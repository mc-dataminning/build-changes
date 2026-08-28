import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class arr implements zz {
   private static final Logger f = LogUtils.getLogger();
   public static final int b = 15000;
   private static final int g = 15000;
   private static final wz h = wz.c("disconnect.timeout");
   static final wz c = wz.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer d;
   protected final vt e;
   private final boolean i;
   private long j;
   private boolean k;
   private long l;
   private long m;
   private boolean n = false;
   private int o;
   private volatile boolean p = false;

   public arr(MinecraftServer $$0, vt $$1, arj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.j = ad.c();
      this.o = $$2.b();
      this.i = $$2.d();
   }

   private void l() {
      if (!this.n) {
         this.m = ad.c();
         this.n = true;
      }
   }

   @Override
   public void a(vv $$0) {
      if (this.h()) {
         f.info("Stopping singleplayer server as player logged out");
         this.d.a(false);
      }
   }

   @Override
   public void a(aac $$0) {
      if (this.k && $$0.b() == this.l) {
         int $$1 = (int)(ad.c() - this.j);
         this.o = (this.o * 3 + $$1) / 4;
         this.k = false;
      } else if (!this.h()) {
         this.a(h);
      }
   }

   @Override
   public void a(aad $$0) {
   }

   @Override
   public void a(aab $$0) {
   }

   @Override
   public void a(aae $$0) {
      zj.a($$0, this, this.d);
      if ($$0.e() == aae.a.b && this.d.Y()) {
         f.info("Disconnecting {} due to resource pack {} rejection", this.i().getName(), $$0.b());
         this.a(wz.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(abs $$0) {
      this.a(c);
   }

   protected void e() {
      this.d.aT().a("keepAlive");
      long $$0 = ad.c();
      if (!this.h() && $$0 - this.j >= 15000L) {
         if (this.k) {
            this.a(h);
         } else if (this.a($$0)) {
            this.k = true;
            this.j = $$0;
            this.l = $$0;
            this.b(new zq(this.l));
         }
      }

      this.d.aT().c();
   }

   private boolean a(long $$0) {
      if (this.n) {
         if ($$0 - this.m >= 15000L) {
            this.a(h);
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

   public void b(zg<?> $$0) {
      this.a($$0, null);
   }

   public void a(zg<?> $$0, @Nullable wg $$1) {
      if ($$0.d()) {
         this.l();
      }

      boolean $$2 = !this.p || !this.d.bx();

      try {
         this.e.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new z($$4);
      }
   }

   public void a(wz $$0) {
      this.b(new vv($$0));
   }

   public void b(vv $$0) {
      this.e.a(new zp($$0.a()), wg.a(() -> this.e.a($$0)));
      this.e.m();
      this.d.h(this.e::n);
   }

   protected boolean h() {
      return this.d.a(this.i());
   }

   protected abstract GameProfile i();

   @azt
   public GameProfile j() {
      return this.i();
   }

   public int k() {
      return this.o;
   }

   protected arj a(aqh $$0) {
      return new arj(this.i(), this.o, $$0, this.i);
   }
}
