import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctb extends crw {
   public static final MapCodec<ctb> c = b(ctb::new);

   @Override
   public MapCodec<ctb> a() {
      return c;
   }

   protected ctb(dfc.d $$0) {
      super($$0);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dcy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$0, $$2, ddb.C);
   }

   @Override
   protected void a(cqb $$0, gw $$1, cca $$2) {
      dcz $$3 = $$0.c_($$1);
      if ($$3 instanceof dcy) {
         $$2.a((bhh)$$3);
         $$2.a(apq.as);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, apg.cg, aph.e, 1.0F, 1.0F, false);
         }

         ha $$7 = $$0.c(a);
         ha.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ha.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ha.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(iv.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
