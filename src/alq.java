import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alq extends alp implements ta, wu {
   private static final Logger d = LogUtils.getLogger();
   private static final tl e = tl.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<alj> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private alj h;
   private aki i;

   public alq(MinecraftServer $$0, sm $$1, ali $$2) {
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
      this.b(new vi(new vw(this.b.getServerModName())));
      hl<afi> $$0 = this.b.aV();
      this.b(new wt(cek.d.b(this.b.aT().M())));
      this.b(new ws(new hr.c(hu.a($$0)).c()));
      this.b(new vn(aqn.a($$0)));
      this.o();
      this.g.add(new alz());
      this.p();
   }

   public void n() {
      this.g.add(new alz());
      this.p();
   }

   private void o() {
      this.b.S().ifPresent($$0 -> this.g.add(new ama($$0)));
   }

   @Override
   public void a(vp $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(vt $$0) {
      super.a($$0);
      if ($$0.a() != vt.a.d) {
         this.a(ama.a);
      }
   }

   @Override
   public void a(wv $$0) {
      this.c.a();
      vg.a($$0, this, this.b);
      this.a(alz.a);

      try {
         aoj $$1 = this.b.ac();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aoj.g);
            return;
         }

         tl $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         aku $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new vj(e));
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
         alj $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(alj.a $$0) {
      alj.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
