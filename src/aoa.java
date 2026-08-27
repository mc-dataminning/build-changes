import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aoa extends anz implements uu, yx {
   private static final Logger d = LogUtils.getLogger();
   private static final vf e = vf.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<ant> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private ant h;
   private ams i;

   public aoa(MinecraftServer $$0, ug $$1, ans $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(vf $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new xj(new xy(this.b.getServerModName())));
      io<ahp> $$0 = this.b.ba();
      this.b(new yw(chu.e.b(this.b.aY().M())));
      this.b(new yv(new iu.c(ix.a($$0)).d()));
      this.b(new xp(asz.a($$0)));
      this.o();
      this.g.add(new aoj());
      this.p();
   }

   public void n() {
      this.g.add(new aoj());
      this.p();
   }

   private void o() {
      this.b.U().ifPresent($$0 -> this.g.add(new aok($$0)));
   }

   @Override
   public void a(xr $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(xv $$0) {
      super.a($$0);
      if ($$0.d().a()) {
         this.a(aok.a);
      }
   }

   @Override
   public void a(yy $$0) {
      this.c.a();
      xh.a($$0, this, this.b);
      this.a(aoj.a);

      try {
         aqv $$1 = this.b.ae();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aqv.g);
            return;
         }

         vf $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         ane $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new xk(e));
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
         ant $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(ant.a $$0) {
      ant.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
