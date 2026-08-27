import javax.annotation.Nullable;

public class cts extends cwf implements cso {
   public static final int a = 2;
   public static final dga b = dfq.ar;
   protected static final int c = 4;
   protected static final int d = 5;
   protected static final int e = 2;
   protected static final int f = 6;
   protected static final int g = 7;
   protected static final int h = 3;
   protected static final int i = 8;
   protected static final int j = 9;
   protected static final int k = 4;
   protected static final ehx[] l = new ehx[]{
      csm.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), csm.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), csm.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ehx[] m = new ehx[]{
      csm.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), csm.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), csm.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ehx[] n = new ehx[]{
      csm.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), csm.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), csm.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ehx[] D = new ehx[]{
      csm.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), csm.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), csm.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public cts(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(b, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.c(b) < 2;
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2.a($$0.c(aC)));
      return $$3.a(apl.z);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
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
   public dfa a(clg $$0) {
      dfa $$1 = this.n();
      cpp $$2 = $$0.q();
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
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == $$0.c(aC) && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return $$2.c(b) < 2;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      $$0.a($$2, $$3.a(b, Integer.valueOf($$3.c(b) + 1)), 2);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(aC, b);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
