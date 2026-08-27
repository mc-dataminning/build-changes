import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwp extends cvl {
   public static final MapCodec<cwp> c = b(cwp::new);

   @Override
   public MapCodec<cwp> a() {
      return c;
   }

   protected cwp(djg.d $$0) {
      super($$0);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$0, $$2, dgx.C);
   }

   @Override
   protected void a(ctp $$0, hx $$1, cfi $$2) {
      dgv $$3 = $$0.c_($$1);
      if ($$3 instanceof dgu) {
         $$2.a((bke)$$3);
         $$2.a(asc.as);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, ars.cg, art.e, 1.0F, 1.0F, false);
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
