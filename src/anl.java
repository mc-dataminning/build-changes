import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class anl implements xe {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 15000;
   private static final vb e = vb.c("disconnect.timeout");
   protected final MinecraftServer b;
   protected final uc c;
   private long f;
   private boolean g;
   private long h;
   private int i;
   private volatile boolean j = false;

   public anl(MinecraftServer $$0, uc $$1, ane $$2) {
      this.b = $$0;
      this.c = $$1;
      this.f = ac.b();
      this.i = $$2.b();
   }

   @Override
   public void a(vb $$0) {
      if (this.i()) {
         d.info("Stopping singleplayer server as player logged out");
         this.b.a(false);
      }
   }

   @Override
   public void a(xh $$0) {
      if (this.g && $$0.a() == this.h) {
         int $$1 = (int)(ac.b() - this.f);
         this.i = (this.i * 3 + $$1) / 4;
         this.g = false;
      } else if (!this.i()) {
         this.b(e);
      }
   }

   @Override
   public void a(xi $$0) {
   }

   @Override
   public void a(xg $$0) {
   }

   @Override
   public void a(xj $$0) {
      ww.a($$0, this, this.b);
      if ($$0.a() == xj.a.b && this.b.V()) {
         d.info("Disconnecting {} due to resource pack rejection", this.j().getName());
         this.b(vb.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   protected void f() {
      this.b.aR().a("keepAlive");
      long $$0 = ac.b();
      if ($$0 - this.f >= 15000L) {
         if (this.g) {
            this.b(e);
         } else {
            this.g = true;
            this.f = $$0;
            this.h = $$0;
            this.b(new xa(this.h));
         }
      }

      this.b.aR().c();
   }

   public void g() {
      this.j = true;
   }

   public void h() {
      this.j = false;
      this.c.c();
   }

   public void b(wu<?> $$0) {
      this.a($$0, null);
   }

   public void a(wu<?> $$0, @Nullable ul $$1) {
      boolean $$2 = !this.j || !this.b.bq();

      try {
         this.c.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new y($$4);
      }
   }

   public void b(vb $$0) {
      this.c.a(new wz($$0), ul.a(() -> this.c.a($$0)));
      this.c.o();
      this.b.h(this.c::p);
   }

   protected boolean i() {
      return this.b.a(this.j());
   }

   protected abstract GameProfile j();

   @avd
   public GameProfile k() {
      return this.j();
   }

   public int l() {
      return this.i;
   }

   protected ane a(ame $$0) {
      return new ane(this.j(), this.i, $$0);
   }
}
