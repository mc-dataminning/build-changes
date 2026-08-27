import javax.annotation.Nullable;

public class ctr extends cwe implements csn {
   public static final int a = 2;
   public static final dfz b = dfp.ar;
   protected static final int c = 4;
   protected static final int d = 5;
   protected static final int e = 2;
   protected static final int f = 6;
   protected static final int g = 7;
   protected static final int h = 3;
   protected static final int i = 8;
   protected static final int j = 9;
   protected static final int k = 4;
   protected static final ehw[] l = new ehw[]{
      csl.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), csl.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), csl.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ehw[] m = new ehw[]{
      csl.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), csl.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), csl.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ehw[] n = new ehw[]{
      csl.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), csl.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), csl.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ehw[] D = new ehw[]{
      csl.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), csl.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), csl.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public ctr(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(b, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.c(b) < 2;
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      dez $$3 = $$1.a_($$2.a($$0.c(aC)));
      return $$3.a(apl.z);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
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
   public dez a(clf $$0) {
      dez $$1 = this.n();
      cpo $$2 = $$0.q();
      gu $$3 = $$0.a();

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
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == $$0.c(aC) && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return $$2.c(b) < 2;
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      $$0.a($$2, $$3.a(b, Integer.valueOf($$3.c(b) + 1)), 2);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(aC, b);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
