import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ark extends arj implements abd, wi {
   private static final Logger f = LogUtils.getLogger();
   private static final wu g = wu.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<arc> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private arc j;
   private apz k;
   @Nullable
   private arv l;

   public ark(MinecraftServer $$0, vp $$1, arb $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(wu $$0) {
      f.info("{} lost connection: {}", this.h, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zi(new aaa(this.d.getServerModName())));
      jq<akt> $$0 = this.d.be();
      List<atd> $$1 = this.d.bh().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new aba(cpa.d.b(this.d.bc().K())));
      this.l = new arv($$1, $$0);
      this.i.add(this.l);
      this.n();
      this.i.add(new art());
      this.o();
   }

   public void m() {
      this.i.add(new art());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new aru($$0)));
   }

   @Override
   public void a(zt $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(zx $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(aru.a);
      }
   }

   @Override
   public void a(abf $$0) {
      ze.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(arv.a);
      }
   }

   @Override
   public void a(abe $$0) {
      ze.a($$0, this, this.d);
      this.a(art.a);
      this.e.a(aga.b.bind(wf.a(this.d.bd())));

      try {
         auj $$1 = this.d.ai();
         if ($$1.a(this.h.getId()) != null) {
            this.b(auj.f);
            return;
         }

         wu $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         aqn $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new zj(g));
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
         arc $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(arc.a $$0) {
      arc.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
