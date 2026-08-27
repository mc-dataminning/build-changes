import javax.annotation.Nullable;

public class ctu extends czg implements czw {
   public static final dga a = dfz.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final eig d = csv.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eig e = csv.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eig f = csv.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public ctu(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(g, ha.a.b));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      switch ((ha.a)$$0.c(g)) {
         case a:
         default:
            return f;
         case c:
            return e;
         case b:
            return d;
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ean.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(a) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
