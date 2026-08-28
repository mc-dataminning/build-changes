import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ast extends ass implements abm, wo {
   private static final Logger f = LogUtils.getLogger();
   private static final xa g = xa.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<asj> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private asj j;
   private arc k;
   @Nullable
   private ate l;

   public ast(MinecraftServer $$0, vt $$1, asi $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(vv $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zo(new aai(this.d.getServerModName())));
      ama $$0 = this.d.bp();
      if (!$$0.a()) {
         this.b(new zv($$0.b()));
      }

      jm<alr> $$1 = this.d.bb();
      List<aul> $$2 = this.d.be().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abj(cvj.e.b(this.d.aZ().K())));
      this.l = new ate($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new atc());
      this.o();
   }

   public void m() {
      this.i.add(new atc());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new atd($$0)));
   }

   @Override
   public void a(aab $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aaf $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(atd.a);
      }
   }

   @Override
   public void a(abo $$0) {
      zk.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(ate.a);
      }
   }

   @Override
   public void a(abn $$0) {
      zk.a($$0, this, this.d);
      this.a(atc.a);
      this.e.a(agq.b.a(wl.a(this.d.ba())));

      try {
         avs $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(avs.f);
            return;
         }

         xa $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         art $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new zq(g));
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
         asj $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(asj.a $$0) {
      asj.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
