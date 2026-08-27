import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alp extends alo implements tc, wv {
   private static final Logger d = LogUtils.getLogger();
   private static final tn e = tn.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<ali> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private ali h;
   private akh i;

   public alp(MinecraftServer $$0, so $$1, alh $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(tn $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new vj(new vx(this.b.getServerModName())));
      hn<afh> $$0 = this.b.aV();
      this.b(new wu(ceg.d.b(this.b.aT().M())));
      this.b(new wt(new hu.c(hx.a($$0)).c()));
      this.b(new vo(aqm.a($$0)));
      this.o();
      this.g.add(new aly());
      this.p();
   }

   public void n() {
      this.g.add(new aly());
      this.p();
   }

   private void o() {
      this.b.S().ifPresent($$0 -> this.g.add(new alz($$0)));
   }

   @Override
   public void a(vq $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(vu $$0) {
      super.a($$0);
      if ($$0.a() != vu.a.d) {
         this.a(alz.a);
      }
   }

   @Override
   public void a(ww $$0) {
      this.c.a();
      vh.a($$0, this, this.b);
      this.a(aly.a);

      try {
         aoi $$1 = this.b.ac();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aoi.g);
            return;
         }

         tn $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         akt $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new vk(e));
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
         ali $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(ali.a $$0) {
      ali.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
