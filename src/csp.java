import javax.annotation.Nullable;

public class csp extends cry implements cvc {
   private static final dfz b = dfp.bv;
   public static final int a = 2;
   private final csl c;
   private final aov d;
   private final aov e;

   public csp(csl $$0, dey.d $$1, aov $$2, aov $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.e = $$3;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.c_($$2) instanceof dcp $$4) {
         $$4.c();
      }

      if (cvd.h($$1.a_($$2.d())) && $$2.v() >= $$1.C_()) {
         bye $$5 = bye.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, bye $$2) {
      ehd $$3 = $$2.cG().f();
      $$0.c(2001, gu.a($$3), csl.i($$2.o()));
      $$0.a($$2, djj.f, $$3);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$3.a(16) == 0) {
         gu $$4 = $$2.d();
         if (cvd.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new in(iv.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dcp($$0, $$1);
   }

   public csl a() {
      return this.c;
   }

   public aov b() {
      return this.d;
   }

   public aov c() {
      return this.e;
   }
}
