import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dpm extends dok {
   public static final MapCodec<dpm> g = b(dpm::new);
   private final Function<eao, ffr> h;

   @Override
   public MapCodec<dpm> a() {
      return g;
   }

   public dpm(ean.d $$0) {
      super(4.0F, 16.0F, 4.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.h = this.a(4.0F, 16.0F, 2.0F, 6.0F, 15.0F);
   }

   @Override
   protected ffr d_(eao $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected ffr c(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   public boolean a(eao $$0, boolean $$1, jb $$2) {
      dmm $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dpn && dpn.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(eao $$0) {
      return $$0.a(axc.U) && $$0.a(axc.l) == this.m().a(axc.l);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      return (bug)(!$$1.w_() ? czu.a($$3, $$1, $$2) : bug.e);
   }

   @Override
   public eao a(ddd $$0) {
      din $$1 = $$0.q();
      iv $$2 = $$0.a();
      ewv $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.i();
      iv $$6 = $$2.g();
      iv $$7 = $$2.h();
      eao $$8 = $$1.a_($$4);
      eao $$9 = $$1.a_($$5);
      eao $$10 = $$1.a_($$6);
      eao $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jb.d), jb.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jb.e), jb.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jb.c), jb.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jb.f), jb.f)))
         .b(e, Boolean.valueOf($$3.a() == eww.c));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
