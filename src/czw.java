import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czw extends cvk {
   public static final MapCodec<czw> c = b(czw::new);

   @Override
   public MapCodec<czw> a() {
      return c;
   }

   protected czw(djf.d $$0) {
      super($$0);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$0, $$2, dgw.a);
   }

   @Override
   protected void a(cto $$0, hx $$1, cfh $$2) {
      dgu $$3 = $$0.c_($$1);
      if ($$3 instanceof dhq) {
         $$2.a((bkd)$$3);
         $$2.a(asb.am);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, arr.ju, ars.e, 1.0F, 1.0F, false);
         }

         ic $$7 = $$0.c(a);
         ic.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ic.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ic.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(jx.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(jx.E, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
