import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anm extends anl implements uq, yl {
   private static final Logger d = LogUtils.getLogger();
   private static final vb e = vb.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<anf> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private anf h;
   private ame i;

   public anm(MinecraftServer $$0, uc $$1, ane $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(vb $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new wy(new xm(this.b.getServerModName())));
      im<ahc> $$0 = this.b.ba();
      this.b(new yk(chd.e.b(this.b.aY().M())));
      this.b(new yj(new is.c(iv.a($$0)).d()));
      this.b(new xd(asj.a($$0)));
      this.o();
      this.g.add(new anv());
      this.p();
   }

   public void n() {
      this.g.add(new anv());
      this.p();
   }

   private void o() {
      this.b.U().ifPresent($$0 -> this.g.add(new anw($$0)));
   }

   @Override
   public void a(xf $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(xj $$0) {
      super.a($$0);
      if ($$0.a() != xj.a.d) {
         this.a(anw.a);
      }
   }

   @Override
   public void a(ym $$0) {
      this.c.a();
      ww.a($$0, this, this.b);
      this.a(anv.a);

      try {
         aqf $$1 = this.b.ae();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aqf.g);
            return;
         }

         vb $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         amq $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new wz(e));
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
         anf $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(anf.a $$0) {
      anf.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
