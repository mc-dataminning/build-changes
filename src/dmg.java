import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends dly {
   public static final MapCodec<dmg> e = b(dmg::new);

   @Override
   public MapCodec<? extends dmg> a() {
      return e;
   }

   public dmg(dvn.d $$0) {
      super($$0);
   }

   public static dvo b() {
      return dil.G.m();
   }

   @Override
   public void a(dff $$0, cor $$1, jh $$2, dvo $$3, @Nullable dsr $$4, cwf $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dby.a($$5, axg.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dvo $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.a(dfo.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dvo $$0, dff $$1, jh $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
