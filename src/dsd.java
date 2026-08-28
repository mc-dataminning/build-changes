import com.mojang.serialization.MapCodec;

public class dsd extends dmm implements dmp {
   public static final MapCodec<dsd> a = b(dsd::new);

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   protected dsd(ean.d $$0) {
      super($$0);
   }

   private static boolean b(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.d();
      eao $$4 = $$1.a_($$3);
      int $$5 = ewm.a($$0, $$4, jb.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dmo.em.m());
      }
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      eao $$4 = $$0.a_($$2);
      iv $$5 = $$2.d();
      ecm $$6 = $$0.m().g();
      js<ejf<?, ?>> $$7 = $$0.F_().f(mh.aL);
      if ($$4.a(dmo.pc)) {
         this.a($$7, rk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dmo.oT)) {
         this.a($$7, rk.j, $$0, $$6, $$1, $$5);
         this.a($$7, rk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(js<ejf<?, ?>> $$0, alf<ejf<?, ?>> $$1, arq $$2, ecm $$3, azv $$4, iv $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ejf)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dmp.a an_() {
      return dmp.a.a;
   }
}
