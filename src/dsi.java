import com.mojang.serialization.MapCodec;

public class dsi extends dmr implements dmu {
   public static final MapCodec<dsi> a = b(dsi::new);

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   protected dsi(eas.d $$0) {
      super($$0);
   }

   private static boolean b(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.d();
      eat $$4 = $$1.a_($$3);
      int $$5 = ewr.a($$0, $$4, jb.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dmt.em.m());
      }
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      eat $$4 = $$0.a_($$2);
      iv $$5 = $$2.d();
      ecr $$6 = $$0.m().g();
      js<ejk<?, ?>> $$7 = $$0.F_().f(mh.aL);
      if ($$4.a(dmt.pc)) {
         this.a($$7, rk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dmt.oT)) {
         this.a($$7, rk.j, $$0, $$6, $$1, $$5);
         this.a($$7, rk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(js<ejk<?, ?>> $$0, alf<ejk<?, ?>> $$1, arq $$2, ecr $$3, azv $$4, iv $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ejk)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dmu.a an_() {
      return dmu.a.a;
   }
}
