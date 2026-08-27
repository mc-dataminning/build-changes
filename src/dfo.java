import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfo extends dbc {
   public static final MapCodec<dfo> c = b(dfo::new);

   @Override
   public MapCodec<dfo> a() {
      return c;
   }

   protected dfo(dph.d $$0) {
      super($$0);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$0, $$2, dmq.a);
   }

   @Override
   protected void a(czg $$0, id $$1, cka $$2) {
      dmo $$3 = $$0.c_($$1);
      if ($$3 instanceof dnk) {
         $$2.a((boj)$$3);
         $$2.a(auz.am);
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, auo.jT, aup.e, 1.0F, 1.0F, false);
         }

         ij $$7 = $$0.c(a);
         ij.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ij.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ij.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(kn.ac, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(kn.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
