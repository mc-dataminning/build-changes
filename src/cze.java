import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cze extends cya {
   public static final MapCodec<cze> c = b(cze::new);

   @Override
   public MapCodec<cze> a() {
      return c;
   }

   protected cze(dmd.d $$0) {
      super($$0);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$0, $$2, djn.C);
   }

   @Override
   protected void a(cwe $$0, ib $$1, cia $$2) {
      djl $$3 = $$0.c_($$1);
      if ($$3 instanceof djk) {
         $$2.a((bmp)$$3);
         $$2.a(atz.as);
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, atp.ct, atq.e, 1.0F, 1.0F, false);
         }

         ih $$7 = $$0.c(a);
         ih.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ih.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ih.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(kb.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
