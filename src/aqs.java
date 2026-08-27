import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqs extends aqr implements aaq, vw {
   private static final Logger e = LogUtils.getLogger();
   private static final wi f = wi.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile g;
   private final Queue<aqk> h = new ConcurrentLinkedQueue<>();
   @Nullable
   private aqk i;
   private apj j;
   @Nullable
   private ard k;

   public aqs(MinecraftServer $$0, vg $$1, aqj $$2) {
      super($$0, $$1, $$2);
      this.g = $$2.a();
      this.j = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.g;
   }

   @Override
   public void a(wi $$0) {
      e.info("{} lost connection: {}", this.g, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   public void m() {
      this.b(new yw(new zo(this.c.getServerModName())));
      iu<ake> $$0 = this.c.be();
      List<asl> $$1 = this.c.bg().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new aan(cmp.e.b(this.c.bc().K())));
      this.k = new ard($$1, $$0);
      this.h.add(this.k);
      this.o();
      this.h.add(new arb());
      this.p();
   }

   public void n() {
      this.h.add(new arb());
      this.p();
   }

   private void o() {
      this.c.X().ifPresent($$0 -> this.h.add(new arc($$0)));
   }

   @Override
   public void a(zh $$0) {
      this.j = $$0.b();
   }

   @Override
   public void a(zl $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(arc.a);
      }
   }

   @Override
   public void a(aas $$0) {
      ys.a($$0, this, this.c);
      if (this.k == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.k.a($$0.b(), this::b);
         this.a(ard.a);
      }
   }

   @Override
   public void a(aar $$0) {
      ys.a($$0, this, this.c);
      this.a(arb.a);
      this.d.a(afm.b.bind(vt.a(this.c.bd())));

      try {
         atr $$1 = this.c.ah();
         if ($$1.a(this.g.getId()) != null) {
            this.b(atr.g);
            return;
         }

         wi $$2 = $$1.a(this.d.d(), this.g);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         apv $$3 = $$1.a(this.g, this.j);
         $$1.a(this.d, $$3, this.a(this.j));
      } catch (Exception var5) {
         e.error("Couldn't place player in world", var5);
         this.d.a(new yx(f));
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
         aqk $$0 = this.h.poll();
         if ($$0 != null) {
            this.i = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(aqk.a $$0) {
      aqk.a $$1 = this.i != null ? this.i.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.i = null;
         this.p();
      }
   }
}
