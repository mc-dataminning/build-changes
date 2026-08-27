import com.mojang.serialization.MapCodec;

public class dcd extends dbb {
   public static final MapCodec<dcd> i = b(dcd::new);
   private final epo[] j;

   @Override
   public MapCodec<dcd> a() {
      return i;
   }

   public dcd(dmd.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected epo f(dme $$0, cvk $$1, ib $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected epo c(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   public boolean a(dme $$0, boolean $$1, ih $$2) {
      czf $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dce && dce.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dme $$0) {
      return $$0.a(aue.S) && $$0.a(aue.k) == this.o().a(aue.k);
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.B) {
         return $$0.a(cpt.uG) ? bmn.a : bmn.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      return !$$1.y_() ? cpv.a($$3, $$1, $$2) : bml.d;
   }

   @Override
   public dme a(crx $$0) {
      cvk $$1 = $$0.q();
      ib $$2 = $$0.a();
      ehr $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      dme $$8 = $$1.a_($$4);
      dme $$9 = $$1.a_($$5);
      dme $$10 = $$1.a_($$6);
      dme $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ih.d), ih.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ih.e), ih.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ih.c), ih.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ih.f), ih.f)))
         .a(e, Boolean.valueOf($$3.a() == ehs.c));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return $$1.o().e() == ih.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
