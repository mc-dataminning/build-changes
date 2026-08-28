import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dih extends ddv {
   public static final MapCodec<dih> c = b(dih::new);

   @Override
   public MapCodec<dih> a() {
      return c;
   }

   protected dih(dsc.d $$0) {
      super($$0);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$0, $$2, dpk.a);
   }

   @Override
   protected void a(dbz $$0, iz $$1, cmy $$2) {
      dpi $$3 = $$0.c_($$1);
      if ($$3 instanceof dqe) {
         $$2.a((bqz)$$3);
         $$2.a(awk.am);
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.jY, awb.e, 1.0F, 1.0F, false);
         }

         je $$7 = $$0.c(a);
         je.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == je.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == je.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(li.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(li.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
