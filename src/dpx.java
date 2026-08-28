import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpx extends dlh {
   public static final MapCodec<dpx> c = b(dpx::new);

   @Override
   public MapCodec<dpx> a() {
      return c;
   }

   protected dpx(ean.d $$0) {
      super($$0);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dym($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$0, $$2, dxo.a);
   }

   @Override
   protected void a(djh $$0, iv $$1, crj $$2) {
      dxm $$3 = $$0.c_($$1);
      if ($$3 instanceof dym) {
         $$2.a((bui)$$3);
         $$2.a(awx.am);
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
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
