import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class asn extends asm implements abt, wv {
   private static final Logger f = LogUtils.getLogger();
   private static final xh g = xh.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<asd> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private asd j;
   private aqy k;
   @Nullable
   private asy l;

   public asn(MinecraftServer $$0, wb $$1, asc $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(wd $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zv(new aap(this.d.getServerModName())));
      alz $$0 = this.d.bq();
      if (!$$0.a()) {
         this.b(new aac($$0.b()));
      }

      jw<alq> $$1 = this.d.bc();
      List<aug> $$2 = this.d.bf().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abq(crc.f.b(this.d.ba().K())));
      this.l = new asy($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new asw());
      this.o();
   }

   public void m() {
      this.i.add(new asw());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new asx($$0)));
   }

   @Override
   public void a(aai $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aam $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(asx.a);
      }
   }

   @Override
   public void a(abv $$0) {
      zr.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(asy.a);
      }
   }

   @Override
   public void a(abu $$0) {
      zr.a($$0, this, this.d);
      this.a(asw.a);
      this.e.a(agt.b.a(ws.a(this.d.bb())));

      try {
         avn $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(avn.f);
            return;
         }

         xh $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         arn $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new zx(g));
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
         asd $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(asd.a $$0) {
      asd.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
