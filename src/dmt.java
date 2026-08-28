import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dmt extends djq implements dpz {
   public static final MapCodec<dmt> a = b(dmt::new);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(dxm.d $$0) {
      super($$0);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.w, $$0.C ? dwi::a : dwi::b);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      dup $$4 = $$1.c_($$2);
      if ($$4 instanceof dwi) {
         int $$5 = ((dwi)$$4).f();

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

            $$1.a(ls.ad, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return cxk.k;
   }

   @Override
   protected boolean a(dxn $$0, eto $$1) {
      return false;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dwi $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dwi.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public eup a(ash $$0, bvf $$1, jh $$2) {
      if ($$0.c_($$2) instanceof dwi $$4) {
         fbs $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cqv
               ? new eup($$0, $$6, fbs.c, 0.0F, 0.0F, Set.of(), eup.c)
               : new eup($$0, $$6, fbs.c, 0.0F, 0.0F, bwp.a(bwp.l, bwp.k), eup.c);
         }
      } else {
         return null;
      }
   }
}
