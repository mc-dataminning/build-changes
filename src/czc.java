import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czc extends cwb {
   public static final MapCodec<czc> a = b(czc::new);

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   protected czc(djf.d $$0) {
      super($$0);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dij($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.v, $$0.B ? dij::a : dij::b);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      dgu $$4 = $$1.c_($$2);
      if ($$4 instanceof dij) {
         int $$5 = ((dij)$$4).g();

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
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return cmx.f;
   }

   @Override
   public boolean a(djg $$0, eep $$1) {
      return false;
   }
}
