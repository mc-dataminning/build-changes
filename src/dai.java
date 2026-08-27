import java.util.function.Supplier;

public class dai extends csu implements cso {
   public static final int a = 7;
   public static final dga b = dfq.av;
   protected static final float c = 1.0F;
   protected static final ehx[] d = new ehx[]{
      csm.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      csm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final daj e;
   private final Supplier<cit> f;

   protected dai(daj $$0, Supplier<cit> $$1, dez.d $$2) {
      super($$2);
      this.e = $$0;
      this.f = $$1;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return d[$$0.c(b)];
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(csn.cC);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cud.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(b);
            if ($$5 < 7) {
               $$0 = $$0.a(b, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ha $$6 = ha.c.a.a($$3);
               gu $$7 = $$2.a($$6);
               dfa $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(csn.cC) || $$8.a(apl.af))) {
                  $$1.b($$7, this.e.n());
                  $$1.b($$2, this.e.b().n().a(cwf.aC, $$6));
               }
            }
         }
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(this.f.get());
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return $$2.c(b) != 7;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      int $$4 = Math.min(7, $$3.c(b) + arp.a($$0.z, 2, 5));
      dfa $$5 = $$3.a(b, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   public daj a() {
      return this.e;
   }
}
