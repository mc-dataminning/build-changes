import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgu extends dfq {
   public static final MapCodec<dgu> c = b(dgu::new);

   @Override
   public MapCodec<dgu> a() {
      return c;
   }

   protected dgu(dtz.d $$0) {
      super($$0);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$0, $$2, drg.C);
   }

   @Override
   protected void a(dds $$0, je $$1, cnp $$2) {
      dre $$3 = $$0.c_($$1);
      if ($$3 instanceof drd) {
         $$2.a((brm)$$3);
         $$2.a(awn.as);
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awd.cA, awe.e, 1.0F, 1.0F, false);
         }

         jj $$7 = $$0.c(a);
         jj.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jj.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jj.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ln.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
