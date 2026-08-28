import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class asc implements zo {
   private static final Logger f = LogUtils.getLogger();
   public static final int b = 15000;
   private static final int g = 15000;
   private static final wo h = wo.c("disconnect.timeout");
   static final wo c = wo.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer d;
   protected final vi e;
   private final boolean i;
   private long j;
   private boolean k;
   private long l;
   private long m;
   private boolean n = false;
   private int o;
   private volatile boolean p = false;

   public asc(MinecraftServer $$0, vi $$1, ars $$2) {
      this.d = $$0;
      this.e = $$1;
      this.j = af.c();
      this.o = $$2.b();
      this.i = $$2.d();
   }

   private void l() {
      if (!this.n) {
         this.m = af.c();
         this.n = true;
      }
   }

   @Override
   public void a(vk $$0) {
      if (this.h()) {
         f.info("Stopping singleplayer server as player logged out");
         this.d.a(false);
      }
   }

   @Override
   public void a(yv $$0, Exception $$1) throws z {
      zo.super.a($$0, $$1);
      this.d.a($$1, $$0.a());
   }

   @Override
   public void a(zr $$0) {
      if (this.k && $$0.b() == this.l) {
         int $$1 = (int)(af.c() - this.j);
         this.o = (this.o * 3 + $$1) / 4;
         this.k = false;
      } else if (!this.h()) {
         this.a(h);
      }
   }

   @Override
   public void a(zs $$0) {
   }

   @Override
   public void a(zq $$0) {
   }

   @Override
   public void a(zt $$0) {
      yy.a($$0, this, this.d);
      if ($$0.e() == zt.a.b && this.d.Z()) {
         f.info("Disconnecting {} due to resource pack {} rejection", this.i().getName(), $$0.b());
         this.a(wo.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(abi $$0) {
      this.a(c);
   }

   protected void e() {
      boq.a().a("keepAlive");
      long $$0 = af.c();
      if (!this.h() && $$0 - this.j >= 15000L) {
         if (this.k) {
            this.a(h);
         } else if (this.a($$0)) {
            this.k = true;
            this.j = $$0;
            this.l = $$0;
            this.b(new zf(this.l));
         }
      }

      boq.a().c();
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

   public void b(yv<?> $$0) {
      this.a($$0, null);
   }

   public void a(yv<?> $$0, @Nullable vv $$1) {
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

   public void a(wo $$0) {
      this.b(new vk($$0));
   }

   public void b(vk $$0) {
      this.e.a(new ze($$0.a()), vv.a(() -> this.e.a($$0)));
      this.e.m();
      this.d.h(this.e::n);
   }

   protected boolean h() {
      return this.d.a(this.i());
   }

   protected abstract GameProfile i();

   @baf
   public GameProfile j() {
      return this.i();
   }

   public int k() {
      return this.o;
   }

   protected ars a(aqn $$0) {
      return new ars(this.i(), this.o, $$0, this.i);
   }
}
