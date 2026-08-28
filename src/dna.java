import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dna extends djx implements dqg {
   public static final MapCodec<dna> a = b(dna::new);

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(dxt.d $$0) {
      super($$0);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.w, $$0.C ? dwp::a : dwp::b);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      duw $$4 = $$1.c_($$2);
      if ($$4 instanceof dwp) {
         int $$5 = ((dwp)$$4).f();

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
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return cxo.k;
   }

   @Override
   protected boolean a(dxu $$0, etv $$1) {
      return false;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dwp $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dwp.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public euw a(ash $$0, bvj $$1, jh $$2) {
      if ($$0.c_($$2) instanceof dwp $$4) {
         fbx $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cqz
               ? new euw($$0, $$6, fbx.c, 0.0F, 0.0F, Set.of(), euw.c)
               : new euw($$0, $$6, fbx.c, 0.0F, 0.0F, bwt.a(bwt.l, bwt.k), euw.c);
         }
      } else {
         return null;
      }
   }
}
