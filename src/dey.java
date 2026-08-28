import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dey extends ddu {
   public static final MapCodec<dey> c = b(dey::new);

   @Override
   public MapCodec<dey> a() {
      return c;
   }

   protected dey(dsb.d $$0) {
      super($$0);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$0, $$2, dpj.C);
   }

   @Override
   protected void a(dby $$0, iz $$1, cmx $$2) {
      dph $$3 = $$0.c_($$1);
      if ($$3 instanceof dpg) {
         $$2.a((bqy)$$3);
         $$2.a(awk.as);
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.cA, awb.e, 1.0F, 1.0F, false);
         }

         je $$7 = $$0.c(a);
         je.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == je.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == je.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(li.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
