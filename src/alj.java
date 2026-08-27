import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alj extends ali implements sx, wp {
   private static final Logger d = LogUtils.getLogger();
   private static final ti e = ti.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<alc> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private alc h;

   public alj(MinecraftServer $$0, sj $$1, GameProfile $$2) {
      super($$0, $$1, 0);
      this.f = $$2;
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(ti $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new ve(new vr(this.b.getServerModName())));
      hn<afd> $$0 = this.b.aV();
      this.b(new wo(cdz.d.b(this.b.aT().M())));
      this.b(new wn(new hu.c(hx.a($$0)).c()));
      this.b(new vj(aqg.a($$0)));
      this.o();
      this.g.add(new als());
      this.p();
   }

   public void n() {
      this.g.add(new als());
      this.p();
   }

   private void o() {
      this.b.S().ifPresent($$0 -> this.g.add(new alt($$0)));
   }

   @Override
   public void a(vo $$0) {
      super.a($$0);
      if ($$0.a() != vo.a.d) {
         this.a(alt.a);
      }
   }

   @Override
   public void a(wq $$0) {
      this.c.a();
      vc.a($$0, this, this.b);
      this.a(als.a);

      try {
         aoc $$1 = this.b.ac();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aoc.g);
            return;
         }

         ti $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         ako $$3 = $$1.e(this.f);
         $$1.a(this.c, $$3, this.l());
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new vf(e));
         this.c.a(e);
      }
   }

   @Override
   public void e() {
      this.f();
   }

   private void p() {
      if (this.h != null) {
         throw new IllegalStateException("Task " + this.h.a().a() + " has not finished yet");
      } else if (this.c()) {
         alc $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(alc.a $$0) {
      alc.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
