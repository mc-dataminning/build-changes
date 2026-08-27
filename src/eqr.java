import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqr extends ghr {
   private static final Logger a = LogUtils.getLogger();
   private static final ur b = ur.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final ur c = ur.c("mco.configure.world.players.inviting").b(-6250336);
   private static final ur v = ur.c("mco.configure.world.players.error").b(-65536);
   private evi w;
   private euz x;
   private final epd y;
   private final eqm z;
   private final fau A;
   @Nullable
   private ur B;

   public eqr(eqm $$0, fau $$1, epd $$2) {
      super(esv.a);
      this.z = $$0;
      this.A = $$1;
      this.y = $$2;
   }

   @Override
   public void aP_() {
      this.w = new evi(this.f.h, this.g / 2 - 100, h(2), 200, 20, null, ur.c("mco.configure.world.invite.profile.name"));
      this.e(this.w);
      this.c(this.w);
      this.x = this.d(euz.a(ur.c("mco.configure.world.buttons.invite"), $$0 -> this.C()).a(this.g / 2 - 100, h(10), 200, 20).a());
      this.d(euz.a(uq.e, $$0 -> this.f.a(this.A)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   private void C() {
      if (ac.b(this.w.a())) {
         this.a(v);
      } else {
         long $$0 = this.y.a;
         String $$1 = this.w.a().trim();
         this.x.i = false;
         this.w.e(false);
         this.a(c);
         CompletableFuture.<epd>supplyAsync(() -> {
            try {
               return eom.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.y.h = $$0x.h;
               this.f.a(new eqy(this.z, this.y));
            } else {
               this.a(v);
            }

            this.w.e(true);
            this.x.i = true;
         }, this.j);
      }
   }

   private void a(ur $$0) {
      this.B = $$0;
      this.f.aU().c($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.A);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, h(1), -1, false);
      if (this.B != null) {
         $$0.a(this.i, this.B, this.g / 2, h(5), -1);
      }

      this.w.a($$0, $$1, $$2, $$3);
   }
}
