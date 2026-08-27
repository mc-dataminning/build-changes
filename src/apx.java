import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class apx extends apw implements vg, zz {
   private static final Logger e = LogUtils.getLogger();
   private static final vs f = vs.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile g;
   private final Queue<apq> h = new ConcurrentLinkedQueue<>();
   @Nullable
   private apq i;
   private aop j;

   public apx(MinecraftServer $$0, uq $$1, app $$2) {
      super($$0, $$1, $$2);
      this.g = $$2.a();
      this.j = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.g;
   }

   @Override
   public void a(vs $$0) {
      e.info("{} lost connection: {}", this.g, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   public void m() {
      this.b(new yg(new yy(this.c.getServerModName())));
      is<ajl> $$0 = this.c.be();
      this.b(new zw(ckn.e.b(this.c.bc().K())));
      DynamicOps<tv> $$1 = aja.a(tm.a, $$0.a());
      jb.a($$1, $$0.c(ajl.b), ($$0x, $$1x) -> this.b(new zv($$0x, $$1x)));
      this.b(new yo(auw.a($$0)));
      this.o();
      this.h.add(new aqg());
      this.p();
   }

   public void n() {
      this.h.add(new aqg());
      this.p();
   }

   private void o() {
      this.c.X().ifPresent($$0 -> this.h.add(new aqh($$0)));
   }

   @Override
   public void a(yr $$0) {
      this.j = $$0.b();
   }

   @Override
   public void a(yv $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(aqh.a);
      }
   }

   @Override
   public void a(aaa $$0) {
      yc.a($$0, this, this.c);
      this.a(aqg.a);
      this.d.a(aeu.b.bind(vd.a(this.c.bd())));

      try {
         ass $$1 = this.c.ah();
         if ($$1.a(this.g.getId()) != null) {
            this.b(ass.g);
            return;
         }

         vs $$2 = $$1.a(this.d.d(), this.g);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         apb $$3 = $$1.a(this.g, this.j);
         $$1.a(this.d, $$3, this.a(this.j));
      } catch (Exception var5) {
         e.error("Couldn't place player in world", var5);
         this.d.a(new yh(f));
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
         apq $$0 = this.h.poll();
         if ($$0 != null) {
            this.i = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(apq.a $$0) {
      apq.a $$1 = this.i != null ? this.i.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.i = null;
         this.p();
      }
   }
}
