import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ash extends asg implements abp, wr {
   private static final Logger f = LogUtils.getLogger();
   private static final xd g = xd.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<arx> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private arx j;
   private aqt k;
   @Nullable
   private ass l;

   public ash(MinecraftServer $$0, vx $$1, arw $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(vz $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zr(new aal(this.d.getServerModName())));
      alu $$0 = this.d.bq();
      if (!$$0.a()) {
         this.b(new zy($$0.b()));
      }

      ju<all> $$1 = this.d.bc();
      List<aua> $$2 = this.d.bf().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abm(cqp.f.b(this.d.ba().K())));
      this.l = new ass($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new asq());
      this.o();
   }

   public void m() {
      this.i.add(new asq());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new asr($$0)));
   }

   @Override
   public void a(aae $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aai $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(asr.a);
      }
   }

   @Override
   public void a(abr $$0) {
      zn.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(ass.a);
      }
   }

   @Override
   public void a(abq $$0) {
      zn.a($$0, this, this.d);
      this.a(asq.a);
      this.e.a(agp.b.a(wo.a(this.d.bb())));

      try {
         avh $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(avh.f);
            return;
         }

         xd $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         ari $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new zt(g));
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
         arx $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(arx.a $$0) {
      arx.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
