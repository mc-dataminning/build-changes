import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnd extends dlz {
   public static final MapCodec<dnd> c = b(dnd::new);

   @Override
   public MapCodec<dnd> a() {
      return c;
   }

   protected dnd(ebf.d $$0) {
      super($$0);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$0, $$2, dyg.D);
   }

   @Override
   protected void a(djz $$0, iw $$1, crz $$2) {
      dye $$3 = $$0.c_($$1);
      if ($$3 instanceof dyd) {
         $$2.a((buv)$$3);
         $$2.a(axb.as);
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awr.cA, aws.e, 1.0F, 1.0F, false);
         }

         jc $$7 = $$0.c(a);
         jc.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jc.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jc.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lz.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
