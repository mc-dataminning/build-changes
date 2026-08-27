import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czg extends cuu {
   public static final MapCodec<czg> c = b(czg::new);

   @Override
   public MapCodec<czg> a() {
      return c;
   }

   protected czg(dio.d $$0) {
      super($$0);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$0, $$2, dgf.a);
   }

   @Override
   protected void a(csy $$0, hv $$1, cer $$2) {
      dgd $$3 = $$0.c_($$1);
      if ($$3 instanceof dgz) {
         $$2.a((bjo)$$3);
         $$2.a(arm.am);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, arc.ju, ard.e, 1.0F, 1.0F, false);
         }

         ia $$7 = $$0.c(a);
         ia.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ia.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ia.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(jv.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(jv.E, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
