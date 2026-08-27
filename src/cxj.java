import java.util.function.Supplier;

public class cxj extends cpv implements cpp {
   public static final int a = 7;
   public static final ddb b = dcr.av;
   protected static final float c = 1.0F;
   protected static final efb[] d = new efb[]{
      cpn.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cpn.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cpn.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cpn.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cpn.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cpn.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cpn.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cpn.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final cxk e;
   private final Supplier<cfu> f;

   protected cxj(cxk $$0, Supplier<cfu> $$1, dca.d $$2) {
      super($$2);
      this.e = $$0;
      this.f = $$1;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return d[$$0.c(b)];
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.a(cpo.cC);
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cre.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(b);
            if ($$5 < 7) {
               $$0 = $$0.a(b, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ha $$6 = ha.c.a.a($$3);
               gu $$7 = $$2.a($$6);
               dcb $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cpo.cC) || $$8.a(amw.af))) {
                  $$1.b($$7, this.e.n());
                  $$1.b($$2, this.e.b().n().a(ctg.aC, $$6));
               }
            }
         }
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(this.f.get());
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return $$2.c(b) != 7;
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      int $$4 = Math.min(7, $$3.c(b) + apa.a($$0.z, 2, 5));
      dcb $$5 = $$3.a(b, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b);
   }

   public cxk a() {
      return this.e;
   }
}
