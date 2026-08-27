import javax.annotation.Nullable;

public class cwy extends csv implements czw {
   public static final dgd a = cwo.aC;
   public static final dga b = dfz.C;
   protected static final float c = 3.0F;
   protected static final eig d = csv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eig e = csv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eig f = csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eig g = csv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected cwy(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      switch ((ha)$$0.c(a)) {
         case c:
            return g;
         case d:
            return f;
         case e:
            return e;
         case f:
         default:
            return d;
      }
   }

   private boolean a(cpb $$0, gw $$1, ha $$2) {
      dfj $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      ha $$3 = $$0.c(a);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csw.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ean.c, ean.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      if (!$$0.c()) {
         dfj $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(a) == $$0.k()) {
            return null;
         }
      }

      dfj $$2 = this.n();
      cpy $$3 = $$0.q();
      gw $$4 = $$0.a();
      eam $$5 = $$0.q().b_($$0.a());

      for (ha $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(a, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(b, Boolean.valueOf($$5.a() == ean.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }
}
