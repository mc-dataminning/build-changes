import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxf extends csu {
   public static final MapCodec<cxf> c = b(cxf::new);

   @Override
   public MapCodec<cxf> a() {
      return c;
   }

   protected cxf(dga.d $$0) {
      super($$0);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new des($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$0, $$2, ddz.a);
   }

   @Override
   protected void a(cqz $$0, ht $$1, ccx $$2) {
      ddx $$3 = $$0.c_($$1);
      if ($$3 instanceof des) {
         $$2.a((bie)$$3);
         $$2.a(aqn.am);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqd.iT, aqe.e, 1.0F, 1.0F, false);
         }

         hx $$7 = $$0.c(a);
         hx.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == hx.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == hx.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(js.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(js.C, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
