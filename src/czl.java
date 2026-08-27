import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czl extends cwk {
   public static final MapCodec<czl> a = b(czl::new);

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   protected czl(djo.d $$0) {
      super($$0);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dis($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.v, $$0.B ? dis::a : dis::b);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      dhd $$4 = $$1.c_($$2);
      if ($$4 instanceof dis) {
         int $$5 = ((dis)$$4).g();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(jx.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return cng.f;
   }

   @Override
   public boolean a(djp $$0, eey $$1) {
      return false;
   }
}
