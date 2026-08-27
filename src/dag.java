import java.util.function.Supplier;

public class dag extends css implements csm {
   public static final int a = 7;
   public static final dfy b = dfo.av;
   protected static final float c = 1.0F;
   protected static final ehy[] d = new ehy[]{
      csk.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      csk.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final dah e;
   private final Supplier<cir> f;

   protected dag(dah $$0, Supplier<cir> $$1, dex.d $$2) {
      super($$2);
      this.e = $$0;
      this.f = $$1;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return d[$$0.c(b)];
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.a(csl.cC);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cub.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(b);
            if ($$5 < 7) {
               $$0 = $$0.a(b, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               hb $$6 = hb.c.a.a($$3);
               gv $$7 = $$2.a($$6);
               dey $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(csl.cC) || $$8.a(apj.af))) {
                  $$1.b($$7, this.e.n());
                  $$1.b($$2, this.e.b().n().a(cwd.aC, $$6));
               }
            }
         }
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(this.f.get());
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return $$2.c(b) != 7;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      int $$4 = Math.min(7, $$3.c(b) + aro.a($$0.z, 2, 5));
      dey $$5 = $$3.a(b, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }

   public dah a() {
      return this.e;
   }
}
