import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ati extends ath implements ach, xj {
   private static final Logger f = LogUtils.getLogger();
   private static final xv g = xv.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<asy> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private asy j;
   private ars k;
   @Nullable
   private att l;

   public ati(MinecraftServer $$0, wp $$1, asx $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(wr $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new aaj(new abd(this.d.getServerModName())));
      amr $$0 = this.d.bp();
      if (!$$0.a()) {
         this.b(new aaq($$0.b()));
      }

      jx<ami> $$1 = this.d.bb();
      List<avc> $$2 = this.d.be().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new ace(csq.f.b(this.d.aZ().K())));
      this.l = new att($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new atr());
      this.o();
   }

   public void m() {
      this.i.add(new atr());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new ats($$0)));
   }

   @Override
   public void a(aaw $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aba $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(ats.a);
      }
   }

   @Override
   public void a(acj $$0) {
      aaf.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(att.a);
      }
   }

   @Override
   public void a(aci $$0) {
      aaf.a($$0, this, this.d);
      this.a(atr.a);
      this.e.a(ahl.b.a(xg.a(this.d.ba())));

      try {
         awi $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(awi.f);
            return;
         }

         xv $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         asi $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new aal(g));
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
         asy $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(asy.a $$0) {
      asy.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
