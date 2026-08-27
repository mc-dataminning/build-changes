import javax.annotation.Nullable;

public abstract class crp extends csx {
   public static final int a = 3;
   public static final dgc b = dgb.r;

   protected crp(dfk.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ehp> b(dfl var1);

   public static boolean c(dfl $$0) {
      return $$0.b(b) && ($$0.a(apu.ae) || $$0.a(apu.bj)) && $$0.c(b);
   }

   @Override
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      if (!$$0.B && $$3.bM() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dfl $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cpx $$0, ehp $$1, ase $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ix.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, apf.dc, apg.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ix.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cbw $$0, dfl $$1, cpy $$2, gw $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof crp) {
         ((crp)$$1.b()).b($$1).forEach($$2x -> $$2.a(ix.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, apf.de, apg.e, 1.0F, 1.0F);
      $$2.a($$0, djv.c, $$3);
   }

   private static void a(cpy $$0, dfl $$1, gw $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
