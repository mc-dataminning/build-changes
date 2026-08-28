import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dpf extends dod {
   public static final MapCodec<dpf> g = b(dpf::new);
   private final Function<eah, ffk> h;

   @Override
   public MapCodec<dpf> a() {
      return g;
   }

   public dpf(eag.d $$0) {
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
   protected ffk d_(eah $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected ffk c(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   public boolean a(eah $$0, boolean $$1, ja $$2) {
      dmf $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dpg && dpg.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(eah $$0) {
      return $$0.a(axc.U) && $$0.a(axc.l) == this.m().a(axc.l);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      return (bud)(!$$1.w_() ? czn.a($$3, $$1, $$2) : bud.e);
   }

   @Override
   public eah a(dcw $$0) {
      dig $$1 = $$0.q();
      iu $$2 = $$0.a();
      ewo $$3 = $$0.q().b_($$0.a());
      iu $$4 = $$2.f();
      iu $$5 = $$2.i();
      iu $$6 = $$2.g();
      iu $$7 = $$2.h();
      eah $$8 = $$1.a_($$4);
      eah $$9 = $$1.a_($$5);
      eah $$10 = $$1.a_($$6);
      eah $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, ja.d), ja.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, ja.e), ja.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, ja.c), ja.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, ja.f), ja.f)))
         .b(e, Boolean.valueOf($$3.a() == ewp.c));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
