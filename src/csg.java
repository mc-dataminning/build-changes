import javax.annotation.Nullable;

public class csg extends csv implements czw {
   public static final dga c = dfz.C;
   private static final eig a = csv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected csg(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Boolean.valueOf(true)));
   }

   protected void a(dfj $$0, cpw $$1, gw $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.D_().a(40));
      }
   }

   protected static boolean e(dfj $$0, cpb $$1, gw $$2) {
      if ($$0.c(c)) {
         return true;
      } else {
         for (hc $$3 : hc.values()) {
            if ($$1.b_($$2.a($$3)).a(apy.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, Boolean.valueOf($$1.a(apy.a) && $$1.e() == 8));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return $$1 == hc.a && !this.a($$0, (cpy)$$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hc.b);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(c);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(c) ? ean.c.a(false) : super.c_($$0);
   }
}
