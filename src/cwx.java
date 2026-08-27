import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwx extends cvt {
   public static final MapCodec<cwx> c = b(cwx::new);

   @Override
   public MapCodec<cwx> a() {
      return c;
   }

   protected cwx(djo.d $$0) {
      super($$0);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$0, $$2, dhf.C);
   }

   @Override
   protected void a(ctx $$0, hx $$1, cfq $$2) {
      dhd $$3 = $$0.c_($$1);
      if ($$3 instanceof dhc) {
         $$2.a((bkg)$$3);
         $$2.a(asd.as);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, art.cs, aru.e, 1.0F, 1.0F, false);
         }

         ic $$7 = $$0.c(a);
         ic.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ic.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ic.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(jx.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
