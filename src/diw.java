import com.mojang.serialization.MapCodec;

public class diw extends dhu {
   public static final MapCodec<diw> i = b(diw::new);
   private final exv[] j;

   @Override
   public MapCodec<diw> a() {
      return i;
   }

   public diw(dtb.d $$0) {
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
   protected exv f(dtc $$0, dcc $$1, jd $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected exv c(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   public boolean a(dtc $$0, boolean $$1, ji $$2) {
      dfy $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dix && dix.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dtc $$0) {
      return $$0.a(awe.T) && $$0.a(awe.l) == this.o().a(awe.l);
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if ($$2.B) {
         return $$0.a(cut.uK) ? bqt.a : bqt.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      return !$$1.x_() ? cuz.a($$3, $$1, $$2) : bqr.e;
   }

   @Override
   public dtc a(cyd $$0) {
      dcc $$1 = $$0.q();
      jd $$2 = $$0.a();
      epe $$3 = $$0.q().b_($$0.a());
      jd $$4 = $$2.f();
      jd $$5 = $$2.i();
      jd $$6 = $$2.g();
      jd $$7 = $$2.h();
      dtc $$8 = $$1.a_($$4);
      dtc $$9 = $$1.a_($$5);
      dtc $$10 = $$1.a_($$6);
      dtc $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ji.d), ji.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ji.e), ji.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ji.c), ji.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ji.f), ji.f)))
         .a(e, Boolean.valueOf($$3.a() == epf.c));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1.o().e() == ji.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
