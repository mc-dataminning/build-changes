import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class apt extends aps implements ve, zx {
   private static final Logger e = LogUtils.getLogger();
   private static final vq f = vq.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile g;
   private final Queue<apm> h = new ConcurrentLinkedQueue<>();
   @Nullable
   private apm i;
   private aol j;

   public apt(MinecraftServer $$0, uo $$1, apl $$2) {
      super($$0, $$1, $$2);
      this.g = $$2.a();
      this.j = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.g;
   }

   @Override
   public void a(vq $$0) {
      e.info("{} lost connection: {}", this.g, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   public void m() {
      this.b(new ye(new yw(this.c.getServerModName())));
      iq<ajh> $$0 = this.c.bc();
      this.b(new zu(cjy.e.b(this.c.ba().K())));
      DynamicOps<tt> $$1 = aiw.a(tk.a, $$0.a());
      iz.a($$1, $$0.c(ajh.b), ($$0x, $$1x) -> this.b(new zt($$0x, $$1x)));
      this.b(new ym(aus.a($$0)));
      this.o();
      this.h.add(new aqc());
      this.p();
   }

   public void n() {
      this.h.add(new aqc());
      this.p();
   }

   private void o() {
      this.c.W().ifPresent($$0 -> this.h.add(new aqd($$0)));
   }

   @Override
   public void a(yp $$0) {
      this.j = $$0.b();
   }

   @Override
   public void a(yt $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(aqd.a);
      }
   }

   @Override
   public void a(zy $$0) {
      ya.a($$0, this, this.c);
      this.a(aqc.a);
      this.d.a(aer.b.bind(vb.a(this.c.bb())));

      try {
         aso $$1 = this.c.ag();
         if ($$1.a(this.g.getId()) != null) {
            this.b(aso.g);
            return;
         }

         vq $$2 = $$1.a(this.d.d(), this.g);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         aox $$3 = $$1.a(this.g, this.j);
         $$1.a(this.d, $$3, this.a(this.j));
      } catch (Exception var5) {
         e.error("Couldn't place player in world", var5);
         this.d.a(new yf(f));
         this.d.a(f);
      }
   }

   @Override
   public void e() {
      this.f();
   }

   private void p() {
      if (this.i != null) {
         throw new IllegalStateException("Task " + this.i.a().a() + " has not finished yet");
      } else if (this.c()) {
         apm $$0 = this.h.poll();
         if ($$0 != null) {
            this.i = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(apm.a $$0) {
      apm.a $$1 = this.i != null ? this.i.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.i = null;
         this.p();
      }
   }
}
