import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlp extends dhe {
   public static final MapCodec<dlp> c = b(dlp::new);

   @Override
   public MapCodec<dlp> a() {
      return c;
   }

   protected dlp(dvn.d $$0) {
      super($$0);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$0, $$2, dst.a);
   }

   @Override
   protected void a(dff $$0, jh $$1, cor $$2) {
      dsr $$3 = $$0.c_($$1);
      if ($$3 instanceof dtp) {
         $$2.a((bsj)$$3);
         $$2.a(awy.am);
      }
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awo.jZ, awp.e, 1.0F, 1.0F, false);
         }

         jm $$7 = $$0.c(a);
         jm.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jm.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jm.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ls.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ls.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
