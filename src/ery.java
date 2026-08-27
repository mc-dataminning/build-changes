import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ery extends gjl {
   private static final Logger a = LogUtils.getLogger();
   private static final vb b = vb.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final vb c = vb.c("mco.configure.world.players.inviting").b(-6250336);
   private static final vb v = vb.c("mco.configure.world.players.error").b(-65536);
   private ewq w;
   private ewh x;
   private final eqk y;
   private final ert z;
   private final fcc A;
   @Nullable
   private vb B;

   public ery(ert $$0, fcc $$1, eqk $$2) {
      super(euc.a);
      this.z = $$0;
      this.A = $$1;
      this.y = $$2;
   }

   @Override
   public void aP_() {
      this.w = new ewq(this.f.h, this.g / 2 - 100, h(2), 200, 20, null, vb.c("mco.configure.world.invite.profile.name"));
      this.e(this.w);
      this.c(this.w);
      this.x = this.d(ewh.a(vb.c("mco.configure.world.buttons.invite"), $$0 -> this.C()).a(this.g / 2 - 100, h(10), 200, 20).a());
      this.d(ewh.a(va.e, $$0 -> this.f.a(this.A)).a(this.g / 2 - 100, h(12), 200, 20).a());
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
         CompletableFuture.<eqk>supplyAsync(() -> {
            try {
               return ept.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.y.h = $$0x.h;
               this.f.a(new esf(this.z, this.y));
            } else {
               this.a(v);
            }

            this.w.e(true);
            this.x.i = true;
         }, this.j);
      }
   }

   private void a(vb $$0) {
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, h(1), -1, false);
      if (this.B != null) {
         $$0.a(this.i, this.B, this.g / 2, h(5), -1);
      }

      this.w.a($$0, $$1, $$2, $$3);
   }
}
