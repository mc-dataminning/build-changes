import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcn extends czm {
   public static final MapCodec<dcn> a = b(dcn::new);

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   protected dcn(dmy.d $$0) {
      super($$0);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.v, $$0.B ? dlv::a : dlv::b);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      dkg $$4 = $$1.c_($$2);
      if ($$4 instanceof dlv) {
         int $$5 = ((dlv)$$4).f();

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

            $$1.a(kc.aa, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return cqk.h;
   }

   @Override
   protected boolean a(dmz $$0, eim $$1) {
      return false;
   }
}
