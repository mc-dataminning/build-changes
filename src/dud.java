import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dud extends dlh {
   public static final MapCodec<dud> c = b(dud::new);

   @Override
   public MapCodec<dud> a() {
      return c;
   }

   protected dud(ean.d $$0) {
      super($$0);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$0, $$2, dxo.C);
   }

   @Override
   protected void a(djh $$0, iv $$1, crj $$2) {
      dxm $$3 = $$0.c_($$1);
      if ($$3 instanceof dzd) {
         $$2.a((bui)$$3);
         $$2.a(awx.at);
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.zo, awo.e, 1.0F, 1.0F, false);
         }

         $$1.a(ly.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
