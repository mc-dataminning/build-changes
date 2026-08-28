import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class asb implements aam {
   private static final Logger f = LogUtils.getLogger();
   public static final int b = 15000;
   private static final int g = 15000;
   private static final xo h = xo.c("disconnect.timeout");
   static final xo c = xo.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer d;
   protected final wj e;
   private final boolean i;
   private long j;
   private boolean k;
   private long l;
   private long m;
   private boolean n = false;
   private int o;
   private volatile boolean p = false;

   public asb(MinecraftServer $$0, wj $$1, art $$2) {
      this.d = $$0;
      this.e = $$1;
      this.j = ac.c();
      this.o = $$2.b();
      this.i = $$2.d();
   }

   private void l() {
      if (!this.n) {
         this.m = ac.c();
         this.n = true;
      }
   }

   @Override
   public void a(xo $$0) {
      if (this.h()) {
         f.info("Stopping singleplayer server as player logged out");
         this.d.a(false);
      }
   }

   @Override
   public void a(aap $$0) {
      if (this.k && $$0.b() == this.l) {
         int $$1 = (int)(ac.c() - this.j);
         this.o = (this.o * 3 + $$1) / 4;
         this.k = false;
      } else if (!this.h()) {
         this.b(h);
      }
   }

   @Override
   public void a(aaq $$0) {
   }

   @Override
   public void a(aao $$0) {
   }

   @Override
   public void a(aar $$0) {
      zy.a($$0, this, this.d);
      if ($$0.e() == aar.a.b && this.d.Y()) {
         f.info("Disconnecting {} due to resource pack {} rejection", this.i().getName(), $$0.b());
         this.b(xo.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(acf $$0) {
      this.b(c);
   }

   protected void e() {
      this.d.aT().a("keepAlive");
      long $$0 = ac.c();
      if (!this.h() && $$0 - this.j >= 15000L) {
         if (this.k) {
            this.b(h);
         } else if (this.a($$0)) {
            this.k = true;
            this.j = $$0;
            this.l = $$0;
            this.b(new aae(this.l));
         }
      }

      this.d.aT().c();
   }

   private boolean a(long $$0) {
      if (this.n) {
         if ($$0 - this.m >= 15000L) {
            this.b(h);
         }

         return false;
      } else {
         return true;
      }
   }

   public void f() {
      this.p = true;
   }

   public void g() {
      this.p = false;
      this.e.a();
   }

   public void b(zv<?> $$0) {
      this.a($$0, null);
   }

   public void a(zv<?> $$0, @Nullable wv $$1) {
      if ($$0.d()) {
         this.l();
      }

      boolean $$2 = !this.p || !this.d.bw();

      try {
         this.e.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new y($$4);
      }
   }

   public void b(xo $$0) {
      this.e.a(new aad($$0), wv.a(() -> this.e.a($$0)));
      this.e.m();
      this.d.h(this.e::n);
   }

   protected boolean h() {
      return this.d.a(this.i());
   }

   protected abstract GameProfile i();

   @bab
   public GameProfile j() {
      return this.i();
   }

   public int k() {
      return this.o;
   }

   protected art a(aqt $$0) {
      return new art(this.i(), this.o, $$0, this.i);
   }
}
