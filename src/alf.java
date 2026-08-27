import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class alf implements vh {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 15000;
   private static final tf e = tf.c("disconnect.timeout");
   protected final MinecraftServer b;
   protected final sg c;
   private long f;
   private boolean g;
   private long h;
   private int i;
   private volatile boolean j = false;

   public alf(MinecraftServer $$0, sg $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.f = ac.b();
      this.i = $$2;
   }

   @Override
   public void a(tf $$0) {
      if (this.i()) {
         d.info("Stopping singleplayer server as player logged out");
         this.b.a(false);
      }
   }

   @Override
   public void a(vj $$0) {
      if (this.g && $$0.a() == this.h) {
         int $$1 = (int)(ac.b() - this.f);
         this.i = (this.i * 3 + $$1) / 4;
         this.g = false;
      } else if (!this.i()) {
         this.b(e);
      }
   }

   @Override
   public void a(vk $$0) {
   }

   @Override
   public void a(vi $$0) {
   }

   @Override
   public void a(vl $$0) {
      uz.a($$0, this, this.b);
      if ($$0.a() == vl.a.b && this.b.T()) {
         d.info("Disconnecting {} due to resource pack rejection", this.j().getName());
         this.b(tf.c("multiplayer.requiredTexturePrompt.disconnect"));
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
            this.b(new vd(this.h));
         }
      }

      this.b.aN().c();
   }

   public void g() {
      this.j = true;
   }

   public void h() {
      this.j = false;
      this.c.c();
   }

   public void b(ux<?> $$0) {
      this.a($$0, null);
   }

   public void a(ux<?> $$0, @Nullable sp $$1) {
      boolean $$2 = !this.j || !this.b.bm();

      try {
         this.c.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Sending packet");
         p $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new y($$4);
      }
   }

   public void b(tf $$0) {
      this.c.a(new vc($$0), sp.a(() -> this.c.a($$0)));
      this.c.o();
      this.b.h(this.c::p);
   }

   protected boolean i() {
      return this.b.a(this.j());
   }

   protected abstract GameProfile j();

   @asq
   public GameProfile k() {
      return this.j();
   }

   public int l() {
      return this.i;
   }
}
