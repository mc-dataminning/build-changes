import javax.annotation.Nullable;

public abstract class crc extends csk {
   public static final int a = 3;
   public static final dfp b = dfo.r;

   protected crc(dex.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ehf> b(dey var1);

   public static boolean c(dey $$0) {
      return $$0.b(b) && ($$0.a(apj.ae) || $$0.a(apj.bj)) && $$0.c(b);
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      if (!$$0.B && $$3.bM() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dey $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cpk $$0, ehf $$1, art $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(iw.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aou.dc, aov.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(iw.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cbl $$0, dey $$1, cpl $$2, gv $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof crc) {
         ((crc)$$1.b()).b($$1).forEach($$2x -> $$2.a(iw.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aou.de, aov.e, 1.0F, 1.0F);
      $$2.a($$0, dji.c, $$3);
   }

   private static void a(cpl $$0, dey $$1, gv $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
