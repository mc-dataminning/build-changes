import javax.annotation.Nullable;

public class cxc extends cyy implements czl {
   public static final dfy a = dfo.at;
   public static final int b = 4;
   private static final ehy[] g = new ehy[]{
      csk.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      csk.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      csk.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      csk.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dfp h = dfo.C;
   public static final dfp c = dfo.j;
   private static final float i = 0.85F;

   public cxc(dex.d $$0) {
      super(new del(0.85F), $$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(a, Integer.valueOf(0)).a(h, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d).a(a).a(h).a(c);
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csl.dR);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eac.c;
      return super.a($$0).a(h, Boolean.valueOf($$2)).a(a, Integer.valueOf(4));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      ehf $$4 = $$0.n($$1, $$2);
      ehy $$5;
      if (!$$0.c(c)) {
         $$5 = g[4];
      } else {
         $$5 = g[$$0.c(a)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(csl.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1 == hb.b && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(h) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!h($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(a), 2);
         }
      }
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(a), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dey $$0) {
      return $$0.c(c);
   }

   private static boolean n(dey $$0) {
      return $$0.c(a) == 4;
   }

   public static dey b() {
      return b(0);
   }

   public static dey b(int $$0) {
      return csl.E.n().a(c, Boolean.valueOf(true)).a(a, Integer.valueOf($$0));
   }
}
