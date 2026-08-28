import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dnb extends djy implements dqh {
   public static final MapCodec<dnb> a = b(dnb::new);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   protected dnb(dxu.d $$0) {
      super($$0);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.w, $$0.C ? dwq::a : dwq::b);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      dux $$4 = $$1.c_($$2);
      if ($$4 instanceof dwq) {
         int $$5 = ((dwq)$$4).f();

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
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return cxp.j;
   }

   @Override
   protected boolean a(dxv $$0, etw $$1) {
      return false;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dwq $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dwq.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public eux a(ash $$0, bvk $$1, jh $$2) {
      if ($$0.c_($$2) instanceof dwq $$4) {
         fby $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cra
               ? new eux($$0, $$6, fby.c, 0.0F, 0.0F, Set.of(), eux.c)
               : new eux($$0, $$6, fby.c, 0.0F, 0.0F, bwu.a(bwu.l, bwu.k), eux.c);
         }
      } else {
         return null;
      }
   }
}
