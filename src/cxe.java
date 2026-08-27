import javax.annotation.Nullable;

public class cxe extends cza implements czn {
   public static final dga a = dfq.at;
   public static final int b = 4;
   private static final ehx[] g = new ehx[]{
      csm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      csm.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      csm.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      csm.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dfr h = dfq.C;
   public static final dfr c = dfq.j;
   private static final float i = 0.85F;

   public cxe(dez.d $$0) {
      super(new den(0.85F), $$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(a, Integer.valueOf(0)).a(h, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d).a(a).a(h).a(c);
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csn.dR);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eae.c;
      return super.a($$0).a(h, Boolean.valueOf($$2)).a(a, Integer.valueOf(4));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ehe $$4 = $$0.n($$1, $$2);
      ehx $$5;
      if (!$$0.c(c)) {
         $$5 = g[4];
      } else {
         $$5 = g[$$0.c(a)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(csn.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$1 == ha.b && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(h) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
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
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(a), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dfa $$0) {
      return $$0.c(c);
   }

   private static boolean n(dfa $$0) {
      return $$0.c(a) == 4;
   }

   public static dfa b() {
      return b(0);
   }

   public static dfa b(int $$0) {
      return csn.E.n().a(c, Boolean.valueOf(true)).a(a, Integer.valueOf($$0));
   }
}
