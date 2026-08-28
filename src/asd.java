import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class asd extends asc implements aba, wc {
   private static final Logger f = LogUtils.getLogger();
   private static final wo g = wo.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<art> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private art j;
   private aqn k;
   @Nullable
   private aso l;

   public asd(MinecraftServer $$0, vi $$1, ars $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(vk $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new zc(new zw(this.d.getServerModName())));
      alm $$0 = this.d.bp();
      if (!$$0.a()) {
         this.b(new zj($$0.b()));
      }

      jy<ald> $$1 = this.d.bb();
      List<atw> $$2 = this.d.be().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new aax(crv.e.b(this.d.aZ().K())));
      this.l = new aso($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new asm());
      this.o();
   }

   public void m() {
      this.i.add(new asm());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new asn($$0)));
   }

   @Override
   public void a(zp $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(zt $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(asn.a);
      }
   }

   @Override
   public void a(abc $$0) {
      yy.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(aso.a);
      }
   }

   @Override
   public void a(abb $$0) {
      yy.a($$0, this, this.d);
      this.a(asm.a);
      this.e.a(age.b.a(vz.a(this.d.ba())));

      try {
         avd $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(avd.f);
            return;
         }

         wo $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         ard $$3 = $$1.a(this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new ze(g));
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
         art $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(art.a $$0) {
      art.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
