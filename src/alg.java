import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alg extends alf implements su, wm {
   private static final Logger d = LogUtils.getLogger();
   private static final tf e = tf.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<akz> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private akz h;

   public alg(MinecraftServer $$0, sg $$1, GameProfile $$2) {
      super($$0, $$1, 0);
      this.f = $$2;
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(tf $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new vb(new vo(this.b.getServerModName())));
      hl<afa> $$0 = this.b.aW();
      this.b(new wl(cdx.d.b(this.b.aU().M())));
      this.b(new wk(new hs.c(hv.a($$0)).c()));
      this.b(new vg(aqd.a($$0)));
      this.o();
      this.g.add(new alp());
      this.p();
   }

   public void n() {
      this.g.add(new alp());
      this.p();
   }

   private void o() {
      this.b.S().ifPresent($$0 -> this.g.add(new alq($$0)));
   }

   @Override
   public void a(vl $$0) {
      super.a($$0);
      if ($$0.a() != vl.a.d) {
         this.a(alq.a);
      }
   }

   @Override
   public void a(wn $$0) {
      this.c.a();
      uz.a($$0, this, this.b);
      this.a(alp.a);

      try {
         anz $$1 = this.b.ac();
         if ($$1.a(this.f.getId()) != null) {
            this.b(anz.g);
            return;
         }

         akl $$2 = $$1.e(this.f);
         $$1.a(this.c, $$2, this.l());
         this.c.b();
      } catch (Exception var4) {
         d.error("Couldn't place player in world", var4);
         this.c.a(new vc(e));
         this.c.a(e);
      }
   }

   @Override
   public void e() {
      this.f();
   }

   private void p() {
      if (this.h != null) {
         throw new IllegalStateException("Task " + this.h.a().a() + " has not finished yet");
      } else if (this.c()) {
         akz $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(akz.a $$0) {
      akz.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
