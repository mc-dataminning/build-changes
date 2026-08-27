import javax.annotation.Nullable;

public class csq extends crz implements cvd {
   private static final dga b = dfq.bv;
   public static final int a = 2;
   private final csm c;
   private final aov d;
   private final aov e;

   public csq(csm $$0, dez.d $$1, aov $$2, aov $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.e = $$3;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.c_($$2) instanceof dcq $$4) {
         $$4.c();
      }

      if (cve.h($$1.a_($$2.d())) && $$2.v() >= $$1.C_()) {
         byf $$5 = byf.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, byf $$2) {
      ehe $$3 = $$2.cG().f();
      $$0.c(2001, gu.a($$3), csm.i($$2.o()));
      $$0.a($$2, djk.f, $$3);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$3.a(16) == 0) {
         gu $$4 = $$2.d();
         if (cve.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new in(iv.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dcq($$0, $$1);
   }

   public csm a() {
      return this.c;
   }

   public aov b() {
      return this.d;
   }

   public aov c() {
      return this.e;
   }
}
