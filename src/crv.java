import javax.annotation.Nullable;

public class crv extends cru implements czw {
   public static final dga a = dfz.C;
   public static final dgd b = dfz.P;
   protected final eig c;
   protected final eig d;
   protected final eig e;
   protected final eig f;
   protected final eig g;
   protected final eig h;

   public crv(int $$0, int $$1, dfi.d $$2) {
      super($$2);
      this.k(this.n().a(a, Boolean.valueOf(false)).a(b, hc.b));
      this.g = csv.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = csv.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = csv.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = csv.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = csv.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = csv.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      hc $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return this.c;
         case d:
            return this.d;
         case f:
            return this.e;
         case e:
            return this.f;
         case a:
            return this.h;
         case b:
         default:
            return this.g;
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      hc $$3 = $$0.c(b);
      gw $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      cpw $$1 = $$0.q();
      gw $$2 = $$0.a();
      return this.n().a(a, Boolean.valueOf($$1.b_($$2).a() == ean.c)).a(b, $$0.k());
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(a) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }
}
