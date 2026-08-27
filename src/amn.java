import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amn extends amm implements tx, xr {
   private static final Logger d = LogUtils.getLogger();
   private static final ui e = ui.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<amg> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private amg h;
   private alf i;

   public amn(MinecraftServer $$0, tj $$1, amf $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(ui $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new wf(new wt(this.b.getServerModName())));
      ij<agf> $$0 = this.b.aV();
      this.b(new xq(cfi.d.b(this.b.aT().M())));
      this.b(new xp(new ip.c(is.a($$0)).c()));
      this.b(new wk(ark.a($$0)));
      this.o();
      this.g.add(new amw());
      this.p();
   }

   public void n() {
      this.g.add(new amw());
      this.p();
   }

   private void o() {
      this.b.S().ifPresent($$0 -> this.g.add(new amx($$0)));
   }

   @Override
   public void a(wm $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      if ($$0.a() != wq.a.d) {
         this.a(amx.a);
      }
   }

   @Override
   public void a(xs $$0) {
      this.c.a();
      wd.a($$0, this, this.b);
      this.a(amw.a);

      try {
         apg $$1 = this.b.ac();
         if ($$1.a(this.f.getId()) != null) {
            this.b(apg.g);
            return;
         }

         ui $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         alr $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new wg(e));
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
         amg $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(amg.a $$0) {
      amg.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
