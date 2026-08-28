import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class ary implements aaj {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 15000;
   private static final int f = 15000;
   private static final xl g = xl.c("disconnect.timeout");
   static final xl b = xl.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer c;
   protected final wj d;
   private final boolean h;
   private long i;
   private boolean j;
   private long k;
   private long l;
   private boolean m = false;
   private int n;
   private volatile boolean o = false;

   public ary(MinecraftServer $$0, wj $$1, arq $$2) {
      this.c = $$0;
      this.d = $$1;
      this.i = ac.c();
      this.n = $$2.b();
      this.h = $$2.d();
   }

   private void m() {
      if (!this.m) {
         this.l = ac.c();
         this.m = true;
      }
   }

   @Override
   public void a(xl $$0) {
      if (this.i()) {
         e.info("Stopping singleplayer server as player logged out");
         this.c.a(false);
      }
   }

   @Override
   public void a(aam $$0) {
      if (this.j && $$0.b() == this.k) {
         int $$1 = (int)(ac.c() - this.i);
         this.n = (this.n * 3 + $$1) / 4;
         this.j = false;
      } else if (!this.i()) {
         this.b(g);
      }
   }

   @Override
   public void a(aan $$0) {
   }

   @Override
   public void a(aal $$0) {
   }

   @Override
   public void a(aao $$0) {
      zv.a($$0, this, this.c);
      if ($$0.e() == aao.a.b && this.c.Y()) {
         e.info("Disconnecting {} due to resource pack {} rejection", this.j().getName(), $$0.b());
         this.b(xl.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(acc $$0) {
      this.b(b);
   }

   protected void f() {
      this.c.aT().a("keepAlive");
      long $$0 = ac.c();
      if (!this.i() && $$0 - this.i >= 15000L) {
         if (this.j) {
            this.b(g);
         } else if (this.a($$0)) {
            this.j = true;
            this.i = $$0;
            this.k = $$0;
            this.b(new aab(this.k));
         }
      }

      this.c.aT().c();
   }

   private boolean a(long $$0) {
      if (this.m) {
         if ($$0 - this.l >= 15000L) {
            this.b(g);
         }

         return false;
      } else {
         return true;
      }
   }

   public void g() {
      this.o = true;
   }

   public void h() {
      this.o = false;
      this.d.a();
   }

   public void b(zs<?> $$0) {
      this.a($$0, null);
   }

   public void a(zs<?> $$0, @Nullable ws $$1) {
      if ($$0.d()) {
         this.m();
      }

      boolean $$2 = !this.o || !this.c.bw();

      try {
         this.d.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new y($$4);
      }
   }

   public void b(xl $$0) {
      this.d.a(new aaa($$0), ws.a(() -> this.d.a($$0)));
      this.d.m();
      this.c.h(this.d::n);
   }

   protected boolean i() {
      return this.c.a(this.j());
   }

   protected abstract GameProfile j();

   @azy
   public GameProfile k() {
      return this.j();
   }

   public int l() {
      return this.n;
   }

   protected arq a(aqq $$0) {
      return new arq(this.j(), this.n, $$0, this.h);
   }
}
