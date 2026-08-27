import javax.annotation.Nullable;

public class ctq extends cwd implements csm {
   public static final int a = 2;
   public static final dfy b = dfo.ar;
   protected static final int c = 4;
   protected static final int d = 5;
   protected static final int e = 2;
   protected static final int f = 6;
   protected static final int g = 7;
   protected static final int h = 3;
   protected static final int i = 8;
   protected static final int j = 9;
   protected static final int k = 4;
   protected static final ehy[] l = new ehy[]{
      csk.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), csk.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), csk.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ehy[] m = new ehy[]{
      csk.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), csk.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), csk.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ehy[] n = new ehy[]{
      csk.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), csk.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), csk.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ehy[] D = new ehy[]{
      csk.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), csk.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), csk.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public ctq(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hb.c).a(b, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(b) < 2;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      dey $$3 = $$1.a_($$2.a($$0.c(aC)));
      return $$3.a(apj.z);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      int $$4 = $$0.c(b);
      switch ((hb)$$0.c(aC)) {
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
   public dey a(cle $$0) {
      dey $$1 = this.n();
      cpn $$2 = $$0.q();
      gv $$3 = $$0.a();

      for (hb $$4 : $$0.f()) {
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
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == $$0.c(aC) && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return $$2.c(b) < 2;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      $$0.a($$2, $$3.a(b, Integer.valueOf($$3.c(b) + 1)), 2);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(aC, b);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
