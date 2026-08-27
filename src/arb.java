import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class arb implements zq {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 15000;
   private static final ws f = ws.c("disconnect.timeout");
   static final ws b = ws.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer c;
   protected final vq d;
   private final boolean g;
   private long h;
   private boolean i;
   private long j;
   private int k;
   private volatile boolean l = false;

   public arb(MinecraftServer $$0, vq $$1, aqt $$2) {
      this.c = $$0;
      this.d = $$1;
      this.h = ac.b();
      this.k = $$2.b();
      this.g = $$2.d();
   }

   @Override
   public void a(ws $$0) {
      if (this.i()) {
         e.info("Stopping singleplayer server as player logged out");
         this.c.a(false);
      }
   }

   @Override
   public void a(zt $$0) {
      if (this.i && $$0.b() == this.j) {
         int $$1 = (int)(ac.b() - this.h);
         this.k = (this.k * 3 + $$1) / 4;
         this.i = false;
      } else if (!this.i()) {
         this.b(f);
      }
   }

   @Override
   public void a(zu $$0) {
   }

   @Override
   public void a(zs $$0) {
   }

   @Override
   public void a(zv $$0) {
      zc.a($$0, this, this.c);
      if ($$0.e() == zv.a.b && this.c.Y()) {
         e.info("Disconnecting {} due to resource pack {} rejection", this.j().getName(), $$0.b());
         this.b(ws.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(abi $$0) {
      this.b(b);
   }

   protected void f() {
      this.c.aU().a("keepAlive");
      long $$0 = ac.b();
      if ($$0 - this.h >= 15000L) {
         if (this.i) {
            this.b(f);
         } else {
            this.i = true;
            this.h = $$0;
            this.j = $$0;
            this.b(new zi(this.j));
         }
      }

      this.c.aU().c();
   }

   public void g() {
      this.l = true;
   }

   public void h() {
      this.l = false;
      this.d.a();
   }

   public void b(yz<?> $$0) {
      this.a($$0, null);
   }

   public void a(yz<?> $$0, @Nullable vz $$1) {
      boolean $$2 = !this.l || !this.c.bv();

      try {
         this.d.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new y($$4);
      }
   }

   public void b(ws $$0) {
      this.d.a(new zh($$0), vz.a(() -> this.d.a($$0)));
      this.d.m();
      this.c.h(this.d::n);
   }

   protected boolean i() {
      return this.c.a(this.j());
   }

   protected abstract GameProfile j();

   @ayz
   public GameProfile k() {
      return this.j();
   }

   public int l() {
      return this.k;
   }

   protected aqt a(apt $$0) {
      return new aqt(this.j(), this.k, $$0, this.g);
   }
}
