import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aln extends alm implements ta, wt {
   private static final Logger d = LogUtils.getLogger();
   private static final tl e = tl.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<alg> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private alg h;
   private akf i;

   public aln(MinecraftServer $$0, sm $$1, alf $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(tl $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new vh(new vv(this.b.getServerModName())));
      hl<aff> $$0 = this.b.aV();
      this.b(new ws(cee.d.b(this.b.aT().M())));
      this.b(new wr(new hr.c(hu.a($$0)).c()));
      this.b(new vm(aqk.a($$0)));
      this.o();
      this.g.add(new alw());
      this.p();
   }

   public void n() {
      this.g.add(new alw());
      this.p();
   }

   private void o() {
      this.b.S().ifPresent($$0 -> this.g.add(new alx($$0)));
   }

   @Override
   public void a(vo $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(vs $$0) {
      super.a($$0);
      if ($$0.a() != vs.a.d) {
         this.a(alx.a);
      }
   }

   @Override
   public void a(wu $$0) {
      this.c.a();
      vf.a($$0, this, this.b);
      this.a(alw.a);

      try {
         aog $$1 = this.b.ac();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aog.g);
            return;
         }

         tl $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         akr $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new vi(e));
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
         alg $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(alg.a $$0) {
      alg.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
