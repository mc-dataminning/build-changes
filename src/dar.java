import java.util.function.Supplier;

public class dar extends ctd implements csx {
   public static final int a = 7;
   public static final dgj b = dfz.av;
   protected static final float c = 1.0F;
   protected static final eig[] d = new eig[]{
      csv.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final das e;
   private final Supplier<cja> f;

   protected dar(das $$0, Supplier<cja> $$1, dfi.d $$2) {
      super($$2);
      this.e = $$0;
      this.f = $$1;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return d[$$0.c(b)];
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.a(csw.cC);
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cum.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(b);
            if ($$5 < 7) {
               $$0 = $$0.a(b, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ha $$6 = ha.c.a.a($$3);
               gw $$7 = $$2.a($$6);
               dfj $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(csw.cC) || $$8.a(aps.af))) {
                  $$1.b($$7, this.e.n());
                  $$1.b($$2, this.e.b().n().a(cwo.aC, $$6));
               }
            }
         }
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(this.f.get());
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$2.c(b) != 7;
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      int $$4 = Math.min(7, $$3.c(b) + arw.a($$0.z, 2, 5));
      dfj $$5 = $$3.a(b, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }

   public das a() {
      return this.e;
   }
}
