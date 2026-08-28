import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqc extends dlm {
   public static final MapCodec<dqc> c = b(dqc::new);

   @Override
   public MapCodec<dqc> a() {
      return c;
   }

   protected dqc(eas.d $$0) {
      super($$0);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$0, $$2, dxt.a);
   }

   @Override
   protected void a(djm $$0, iv $$1, crm $$2) {
      dxr $$3 = $$0.c_($$1);
      if ($$3 instanceof dyr) {
         $$2.a((bui)$$3);
         $$2.a(awx.am);
      }
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.kC, awo.e, 1.0F, 1.0F, false);
         }

         jb $$7 = $$0.c(a);
         jb.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jb.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jb.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ly.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ly.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
