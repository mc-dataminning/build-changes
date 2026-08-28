import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class asc extends asb implements abx, xc {
   private static final Logger f = LogUtils.getLogger();
   private static final xo g = xo.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<aru> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private aru j;
   private aqt k;
   @Nullable
   private asn l;

   public asc(MinecraftServer $$0, wj $$1, art $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(xo $$0) {
      f.info("{} lost connection: {}", this.h, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new aac(new aau(this.d.getServerModName())));
      jp<aln> $$0 = this.d.bd();
      List<atv> $$1 = this.d.bg().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abu(cpm.e.b(this.d.bb().K())));
      this.l = new asn($$1, $$0);
      this.i.add(this.l);
      this.n();
      this.i.add(new asl());
      this.o();
   }

   public void m() {
      this.i.add(new asl());
      this.o();
   }

   private void n() {
      this.d.X().ifPresent($$0 -> this.i.add(new asm($$0)));
   }

   @Override
   public void a(aan $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aar $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(asm.a);
      }
   }

   @Override
   public void a(abz $$0) {
      zy.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(asn.a);
      }
   }

   @Override
   public void a(aby $$0) {
      zy.a($$0, this, this.d);
      this.a(asl.a);
      this.e.a(agu.b.bind(wz.a(this.d.bc())));

      try {
         avc $$1 = this.d.ah();
         if ($$1.a(this.h.getId()) != null) {
            this.b(avc.f);
            return;
         }

         xo $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         arf $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new aad(g));
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
         aru $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(aru.a $$0) {
      aru.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
