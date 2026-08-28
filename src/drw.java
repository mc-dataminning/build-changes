import com.mojang.serialization.MapCodec;

public class drw extends dmf implements dmi {
   public static final MapCodec<drw> a = b(drw::new);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   protected drw(eag.d $$0) {
      super($$0);
   }

   private static boolean b(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.d();
      eah $$4 = $$1.a_($$3);
      int $$5 = ewf.a($$0, $$4, ja.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dmh.em.m());
      }
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      eah $$4 = $$0.a_($$2);
      iu $$5 = $$2.d();
      ecf $$6 = $$0.m().g();
      jr<eiy<?, ?>> $$7 = $$0.F_().f(mg.aL);
      if ($$4.a(dmh.pc)) {
         this.a($$7, rk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dmh.oT)) {
         this.a($$7, rk.j, $$0, $$6, $$1, $$5);
         this.a($$7, rk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jr<eiy<?, ?>> $$0, alf<eiy<?, ?>> $$1, arq $$2, ecf $$3, azv $$4, iu $$5) {
      $$0.a($$1).ifPresent($$4x -> ((eiy)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dmi.a an_() {
      return dmi.a.a;
   }
}
