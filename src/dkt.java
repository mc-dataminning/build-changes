import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkt extends dgh {
   public static final MapCodec<dkt> c = b(dkt::new);

   @Override
   public MapCodec<dkt> a() {
      return c;
   }

   protected dkt(dur.d $$0) {
      super($$0);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dst($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$0, $$2, drx.a);
   }

   @Override
   protected void a(dej $$0, jf $$1, cnx $$2) {
      drv $$3 = $$0.c_($$1);
      if ($$3 instanceof dst) {
         $$2.a((bru)$$3);
         $$2.a(awq.am);
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awg.jZ, awh.e, 1.0F, 1.0F, false);
         }

         jk $$7 = $$0.c(a);
         jk.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jk.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jk.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lo.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(lo.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
