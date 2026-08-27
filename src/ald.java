import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class ald implements vg {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 15000;
   private static final te e = te.c("disconnect.timeout");
   protected final MinecraftServer b;
   protected final sf c;
   private long f;
   private boolean g;
   private long h;
   private int i;

   public ald(MinecraftServer $$0, sf $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.f = ac.b();
      this.i = $$2;
   }

   @Override
   public void a(te $$0) {
      if (this.h()) {
         d.info("Stopping singleplayer server as player logged out");
         this.b.a(false);
      }
   }

   @Override
   public void a(vi $$0) {
      if (this.g && $$0.a() == this.h) {
         int $$1 = (int)(ac.b() - this.f);
         this.i = (this.i * 3 + $$1) / 4;
         this.g = false;
      } else if (!this.h()) {
         this.b(e);
      }
   }

   @Override
   public void a(vj $$0) {
   }

   @Override
   public void a(vh $$0) {
   }

   @Override
   public void a(vk $$0) {
      uy.a($$0, this, this.b);
      if ($$0.a() == vk.a.b && this.b.T()) {
         d.info("Disconnecting {} due to resource pack rejection", this.i().getName());
         this.b(te.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   protected void f() {
      this.b.aN().a("keepAlive");
      long $$0 = ac.b();
      if ($$0 - this.f >= 15000L) {
         if (this.g) {
            this.b(e);
         } else {
            this.g = true;
            this.f = $$0;
            this.h = $$0;
            this.b(new vc(this.h));
         }
      }

      this.b.aN().c();
   }

   public void b(uw<?> $$0) {
      this.a($$0, null, true);
   }

   public void c(uw<?> $$0) {
      this.a($$0, null, false);
   }

   public void g() {
      this.c.c();
   }

   public void a(uw<?> $$0, @Nullable so $$1, boolean $$2) {
      try {
         this.c.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new y($$4);
      }
   }

   public void b(te $$0) {
      this.c.a(new vb($$0), so.a(() -> this.c.a($$0)));
      this.c.o();
      this.b.h(this.c::p);
   }

   protected boolean h() {
      return this.b.a(this.i());
   }

   protected abstract GameProfile i();

   @aso
   public GameProfile j() {
      return this.i();
   }

   public int k() {
      return this.i;
   }
}
