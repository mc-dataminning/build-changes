import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class asc implements aan {
   private static final Logger f = LogUtils.getLogger();
   public static final int b = 15000;
   private static final int g = 15000;
   private static final xp h = xp.c("disconnect.timeout");
   static final xp c = xp.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer d;
   protected final wk e;
   private final boolean i;
   private long j;
   private boolean k;
   private long l;
   private long m;
   private boolean n = false;
   private int o;
   private volatile boolean p = false;

   public asc(MinecraftServer $$0, wk $$1, aru $$2) {
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
   public void a(xp $$0) {
      if (this.h()) {
         f.info("Stopping singleplayer server as player logged out");
         this.d.a(false);
      }
   }

   @Override
   public void a(aaq $$0) {
      if (this.k && $$0.b() == this.l) {
         int $$1 = (int)(ac.c() - this.j);
         this.o = (this.o * 3 + $$1) / 4;
         this.k = false;
      } else if (!this.h()) {
         this.b(h);
      }
   }

   @Override
   public void a(aar $$0) {
   }

   @Override
   public void a(aap $$0) {
   }

   @Override
   public void a(aas $$0) {
      zz.a($$0, this, this.d);
      if ($$0.e() == aas.a.b && this.d.Y()) {
         f.info("Disconnecting {} due to resource pack {} rejection", this.i().getName(), $$0.b());
         this.b(xp.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(acg $$0) {
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
            this.b(new aaf(this.l));
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

   public void b(zw<?> $$0) {
      this.a($$0, null);
   }

   public void a(zw<?> $$0, @Nullable ww $$1) {
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

   public void b(xp $$0) {
      this.e.a(new aae($$0), ww.a(() -> this.e.a($$0)));
      this.e.m();
      this.d.h(this.e::n);
   }

   protected boolean h() {
      return this.d.a(this.i());
   }

   protected abstract GameProfile i();

   @bad
   public GameProfile j() {
      return this.i();
   }

   public int k() {
      return this.o;
   }

   protected aru a(aqu $$0) {
      return new aru(this.i(), this.o, $$0, this.i);
   }
}
