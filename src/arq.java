import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class arq implements aac {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 15000;
   private static final xe f = xe.c("disconnect.timeout");
   static final xe b = xe.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer c;
   protected final wc d;
   private final boolean g;
   private long h;
   private boolean i;
   private long j;
   private int k;
   private volatile boolean l = false;

   public arq(MinecraftServer $$0, wc $$1, ari $$2) {
      this.c = $$0;
      this.d = $$1;
      this.h = ad.b();
      this.k = $$2.b();
      this.g = $$2.d();
   }

   @Override
   public void a(xe $$0) {
      if (this.i()) {
         e.info("Stopping singleplayer server as player logged out");
         this.c.a(false);
      }
   }

   @Override
   public void a(aaf $$0) {
      if (this.i && $$0.b() == this.j) {
         int $$1 = (int)(ad.b() - this.h);
         this.k = (this.k * 3 + $$1) / 4;
         this.i = false;
      } else if (!this.i()) {
         this.b(f);
      }
   }

   @Override
   public void a(aag $$0) {
   }

   @Override
   public void a(aae $$0) {
   }

   @Override
   public void a(aah $$0) {
      zo.a($$0, this, this.c);
      if ($$0.e() == aah.a.b && this.c.Y()) {
         e.info("Disconnecting {} due to resource pack {} rejection", this.j().getName(), $$0.b());
         this.b(xe.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(abu $$0) {
      this.b(b);
   }

   protected void f() {
      this.c.aT().a("keepAlive");
      long $$0 = ad.b();
      if ($$0 - this.h >= 15000L) {
         if (this.i) {
            this.b(f);
         } else {
            this.i = true;
            this.h = $$0;
            this.j = $$0;
            this.b(new zu(this.j));
         }
      }

      this.c.aT().c();
   }

   public void g() {
      this.l = true;
   }

   public void h() {
      this.l = false;
      this.d.a();
   }

   public void b(zl<?> $$0) {
      this.a($$0, null);
   }

   public void a(zl<?> $$0, @Nullable wl $$1) {
      boolean $$2 = !this.l || !this.c.bv();

      try {
         this.d.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new z($$4);
      }
   }

   public void b(xe $$0) {
      this.d.a(new zt($$0), wl.a(() -> this.d.a($$0)));
      this.d.m();
      this.c.h(this.d::n);
   }

   protected boolean i() {
      return this.c.a(this.j());
   }

   protected abstract GameProfile j();

   @azp
   public GameProfile k() {
      return this.j();
   }

   public int l() {
      return this.k;
   }

   protected ari a(aqi $$0) {
      return new ari(this.j(), this.k, $$0, this.g);
   }
}
