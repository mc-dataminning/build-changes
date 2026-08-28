import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class asq implements zy {
   private static final Logger f = LogUtils.getLogger();
   public static final int b = 15000;
   private static final int g = 15000;
   private static final wy h = wy.c("disconnect.timeout");
   static final wy c = wy.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer d;
   protected final vr e;
   private final boolean i;
   private long j;
   private boolean k;
   private long l;
   private long m;
   private boolean n = false;
   private int o;
   private volatile boolean p = false;

   public asq(MinecraftServer $$0, vr $$1, asg $$2) {
      this.d = $$0;
      this.e = $$1;
      this.j = ag.c();
      this.o = $$2.b();
      this.i = $$2.d();
   }

   private void l() {
      if (!this.n) {
         this.m = ag.c();
         this.n = true;
      }
   }

   @Override
   public void a(vt $$0) {
      if (this.h()) {
         f.info("Stopping singleplayer server as player logged out");
         this.d.a(false);
      }
   }

   @Override
   public void a(zf $$0, Exception $$1) throws aa {
      zy.super.a($$0, $$1);
      this.d.a($$1, $$0.a());
   }

   @Override
   public void a(aab $$0) {
      if (this.k && $$0.b() == this.l) {
         int $$1 = (int)(ag.c() - this.j);
         this.o = (this.o * 3 + $$1) / 4;
         this.k = false;
      } else if (!this.h()) {
         this.a(h);
      }
   }

   @Override
   public void a(aac $$0) {
   }

   @Override
   public void a(aaa $$0) {
   }

   @Override
   public void a(aad $$0) {
      zi.a($$0, this, this.d);
      if ($$0.e() == aad.a.b && this.d.Z()) {
         f.info("Disconnecting {} due to resource pack {} rejection", this.i().getName(), $$0.b());
         this.a(wy.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(abs $$0) {
      this.a(c);
   }

   protected void e() {
      bqp.a().a("keepAlive");
      long $$0 = ag.c();
      if (!this.h() && $$0 - this.j >= 15000L) {
         if (this.k) {
            this.a(h);
         } else if (this.a($$0)) {
            this.k = true;
            this.j = $$0;
            this.l = $$0;
            this.b(new zp(this.l));
         }
      }

      bqp.a().c();
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

   public void b(zf<?> $$0) {
      this.a($$0, null);
   }

   public void a(zf<?> $$0, @Nullable wf $$1) {
      if ($$0.d()) {
         this.l();
      }

      boolean $$2 = !this.p || !this.d.bx();

      try {
         this.e.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         p $$4 = p.a(var7, "Sending packet");
         q $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new aa($$4);
      }
   }

   public void a(wy $$0) {
      this.b(new vt($$0));
   }

   public void b(vt $$0) {
      this.e.a(new zo($$0.a()), wf.a(() -> this.e.a($$0)));
      this.e.m();
      this.d.h(this.e::n);
   }

   protected boolean h() {
      return this.d.a(this.i());
   }

   protected abstract GameProfile i();

   @bav
   public GameProfile j() {
      return this.i();
   }

   public int k() {
      return this.o;
   }

   protected asg a(ara $$0) {
      return new asg(this.i(), this.o, $$0, this.i);
   }
}
