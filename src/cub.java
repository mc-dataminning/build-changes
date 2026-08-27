import javax.annotation.Nullable;

public class cub extends cwo implements csx {
   public static final int a = 2;
   public static final dgj b = dfz.ar;
   protected static final int c = 4;
   protected static final int d = 5;
   protected static final int e = 2;
   protected static final int f = 6;
   protected static final int g = 7;
   protected static final int h = 3;
   protected static final int i = 8;
   protected static final int j = 9;
   protected static final int k = 4;
   protected static final eig[] l = new eig[]{
      csv.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), csv.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), csv.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final eig[] m = new eig[]{
      csv.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), csv.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), csv.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final eig[] n = new eig[]{
      csv.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), csv.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), csv.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final eig[] D = new eig[]{
      csv.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), csv.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), csv.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public cub(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(b, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dfj $$0) {
      return $$0.c(b) < 2;
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2.a($$0.c(aC)));
      return $$3.a(aps.z);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      int $$4 = $$0.c(b);
      switch ((ha)$$0.c(aC)) {
         case d:
            return D[$$4];
         case c:
         default:
            return n[$$4];
         case e:
            return m[$$4];
         case f:
            return l[$$4];
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = this.n();
      cpy $$2 = $$0.q();
      gw $$3 = $$0.a();

      for (ha $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aC, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == $$0.c(aC) && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$2.c(b) < 2;
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      $$0.a($$2, $$3.a(b, Integer.valueOf($$3.c(b) + 1)), 2);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(aC, b);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
