import com.mojang.serialization.MapCodec;

public class dnl extends dmk {
   public static final MapCodec<dnl> i = b(dnl::new);
   private final fcs[] j;

   @Override
   public MapCodec<dnl> a() {
      return i;
   }

   public dnl(dxu.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected fcs d_(dxv $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fcs c(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   public boolean a(dxv $$0, boolean $$1, jm $$2) {
      dkm $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dnm && dnm.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dxv $$0) {
      return $$0.a(axu.U) && $$0.a(axu.l) == this.m().a(axu.l);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      return (btj)(!$$1.B_() ? cxz.a($$3, $$1, $$2) : btj.e);
   }

   @Override
   public dxv a(dbg $$0) {
      dgn $$1 = $$0.q();
      jh $$2 = $$0.a();
      etx $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      dxv $$8 = $$1.a_($$4);
      dxv $$9 = $$1.a_($$5);
      dxv $$10 = $$1.a_($$6);
      dxv $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d), jm.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.e), jm.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.c), jm.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.f), jm.f)))
         .b(e, Boolean.valueOf($$3.a() == ety.c));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
