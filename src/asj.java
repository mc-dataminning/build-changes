import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class asj extends asi implements abq, ws {
   private static final Logger f = LogUtils.getLogger();
   private static final xe g = xe.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<arz> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private arz j;
   private aqv k;
   @Nullable
   private asu l;

   public asj(MinecraftServer $$0, vy $$1, ary $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(wa $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zs(new aam(this.d.getServerModName())));
      alw $$0 = this.d.bq();
      if (!$$0.a()) {
         this.b(new zz($$0.b()));
      }

      jv<aln> $$1 = this.d.bc();
      List<auc> $$2 = this.d.bf().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abn(cqs.f.b(this.d.ba().K())));
      this.l = new asu($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new ass());
      this.o();
   }

   public void m() {
      this.i.add(new ass());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new ast($$0)));
   }

   @Override
   public void a(aaf $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(ast.a);
      }
   }

   @Override
   public void a(abs $$0) {
      zo.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(asu.a);
      }
   }

   @Override
   public void a(abr $$0) {
      zo.a($$0, this, this.d);
      this.a(ass.a);
      this.e.a(agq.b.a(wp.a(this.d.bb())));

      try {
         avj $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(avj.f);
            return;
         }

         xe $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         ark $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new zu(g));
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
         arz $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(arz.a $$0) {
      arz.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
