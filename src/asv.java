import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class asv extends asu implements abo, wq {
   private static final Logger f = LogUtils.getLogger();
   private static final xc g = xc.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<asl> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private asl j;
   private are k;
   @Nullable
   private atg l;

   public asv(MinecraftServer $$0, vv $$1, ask $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(vx $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zq(new aak(this.d.getServerModName())));
      amc $$0 = this.d.bp();
      if (!$$0.a()) {
         this.b(new zx($$0.b()));
      }

      jn<alt> $$1 = this.d.bb();
      List<aun> $$2 = this.d.be().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abl(cvl.e.b(this.d.aZ().K())));
      this.l = new atg($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new ate());
      this.o();
   }

   public void m() {
      this.i.add(new ate());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new atf($$0)));
   }

   @Override
   public void a(aad $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(atf.a);
      }
   }

   @Override
   public void a(abq $$0) {
      zm.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(atg.a);
      }
   }

   @Override
   public void a(abp $$0) {
      zm.a($$0, this, this.d);
      this.a(ate.a);
      this.e.a(ags.b.a(wn.a(this.d.ba())));

      try {
         avu $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(avu.f);
            return;
         }

         xc $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         arv $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new zs(g));
         this.e.a(g);
      }
   }

   @Override
   public void d() {
      this.e();
   }

   private void o() {
      if (this.j != null) {
         throw new IllegalStateException("Task " + this.j.a().a() + " has not finished yet");
      } else if (this.c()) {
         asl $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(asl.a $$0) {
      asl.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
