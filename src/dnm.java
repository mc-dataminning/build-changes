import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnm extends diz {
   public static final MapCodec<dnm> c = b(dnm::new);

   @Override
   public MapCodec<dnm> a() {
      return c;
   }

   protected dnm(dxm.d $$0) {
      super($$0);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$0, $$2, dur.a);
   }

   @Override
   protected void a(dha $$0, jh $$1, cps $$2) {
      dup $$3 = $$0.c_($$1);
      if ($$3 instanceof dvo) {
         $$2.a((btg)$$3);
         $$2.a(axp.am);
      }
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, axf.kr, axg.e, 1.0F, 1.0F, false);
         }

         jm $$7 = $$0.c(a);
         jm.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jm.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jm.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ls.af, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ls.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
