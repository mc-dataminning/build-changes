import javax.annotation.Nullable;

public class cwk extends csv implements czw {
   private static final dga b = dfz.C;
   protected static final eig a = csv.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected cwk(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = super.a($$0);
      if ($$1 != null) {
         eam $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == ean.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfj $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ha.a);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1 == ha.b && !this.a($$0, $$3, $$4)) {
         return csw.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ean.c, ean.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
