import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ale extends ald implements st, wl {
   private static final Logger d = LogUtils.getLogger();
   private static final te e = te.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<akx> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private akx h;

   public ale(MinecraftServer $$0, sf $$1, GameProfile $$2) {
      super($$0, $$1, 0);
      this.f = $$2;
   }

   @Override
   protected GameProfile i() {
      return this.f;
   }

   @Override
   public void a(te $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void l() {
      this.b(new va(new vn(this.b.getServerModName())));
      hm<aey> $$0 = this.b.aW();
      this.b(new wk(cdv.d.b(this.b.aU().M())));
      this.b(new wj(new ht.c(hw.a($$0)).c()));
      this.b(new vf(aqb.a($$0)));
      this.n();
      this.g.add(new aln());
      this.o();
   }

   public void m() {
      this.g.add(new aln());
      this.o();
   }

   private void n() {
      this.b.S().ifPresent($$0 -> this.g.add(new alo($$0)));
   }

   @Override
   public void a(vk $$0) {
      super.a($$0);
      if ($$0.a() != vk.a.d) {
         this.a(alo.a);
      }
   }

   @Override
   public void a(wm $$0) {
      this.c.a();
      uy.a($$0, this, this.b);
      this.a(aln.a);

      try {
         anx $$1 = this.b.ac();
         if ($$1.a(this.f.getId()) != null) {
            this.b(anx.g);
            return;
         }

         akj $$2 = $$1.e(this.f);
         $$1.a(this.c, $$2, this.k());
         this.c.b();
      } catch (Exception var4) {
         d.error("Couldn't place player in world", var4);
         this.c.a(new vb(e));
         this.c.a(e);
      }
   }

   @Override
   public void e() {
      this.f();
   }

   private void o() {
      if (this.h != null) {
         throw new IllegalStateException("Task " + this.h.a().a() + " has not finished yet");
      } else if (this.c()) {
         akx $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(akx.a $$0) {
      akx.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.o();
      }
   }
}
