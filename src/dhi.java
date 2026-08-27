import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhi extends cyx {
   public static final MapCodec<dhi> c = b(dhi::new);

   @Override
   public MapCodec<dhi> a() {
      return c;
   }

   protected dhi(dna.d $$0) {
      super($$0);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$0, $$2, dkk.B);
   }

   @Override
   protected void a(cxb $$0, ib $$1, ciu $$2) {
      dki $$3 = $$0.c_($$1);
      if ($$3 instanceof dlu) {
         $$2.a((bnh)$$3);
         $$2.a(aui.at);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aty.xL, atz.e, 1.0F, 1.0F, false);
         }

         $$1.a(kc.ac, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
