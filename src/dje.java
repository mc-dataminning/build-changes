import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends dat {
   public static final MapCodec<dje> c = b(dje::new);

   @Override
   public MapCodec<dje> a() {
      return c;
   }

   protected dje(doy.d $$0) {
      super($$0);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dns($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$0, $$2, dmh.B);
   }

   @Override
   protected void a(cyx $$0, ib $$1, cjt $$2) {
      dmf $$3 = $$0.c_($$1);
      if ($$3 instanceof dns) {
         $$2.a((boe)$$3);
         $$2.a(auw.at);
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aum.xO, aun.e, 1.0F, 1.0F, false);
         }

         $$1.a(kl.ac, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
