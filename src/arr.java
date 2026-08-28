import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arr extends arq implements abj, wm {
   private static final Logger f = LogUtils.getLogger();
   private static final wy g = wy.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<arj> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private arj j;
   private aqg k;
   @Nullable
   private asc l;

   public arr(MinecraftServer $$0, vs $$1, ari $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(vu $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zm(new aag(this.d.getServerModName())));
      ali $$0 = this.d.bq();
      if (!$$0.a()) {
         this.b(new zt($$0));
      }

      jt<akz> $$1 = this.d.bd();
      List<atk> $$2 = this.d.bg().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abg(cpl.d.b(this.d.bb().K())));
      this.l = new asc($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new asa());
      this.o();
   }

   public void m() {
      this.i.add(new asa());
      this.o();
   }

   private void n() {
      this.d.X().ifPresent($$0 -> this.i.add(new asb($$0)));
   }

   @Override
   public void a(zz $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aad $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(asb.a);
      }
   }

   @Override
   public void a(abl $$0) {
      zi.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(asc.a);
      }
   }

   @Override
   public void a(abk $$0) {
      zi.a($$0, this, this.d);
      this.a(asa.a);
      this.e.a(agg.b.bind(wj.a(this.d.bc())));

      try {
         auq $$1 = this.d.ah();
         if ($$1.a(this.h.getId()) != null) {
            this.a(auq.f);
            return;
         }

         wy $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         aqu $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new zo(g));
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
         arj $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(arj.a $$0) {
      arj.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
