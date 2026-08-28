import com.mojang.serialization.MapCodec;

public class dqk extends dmm implements dtx {
   public static final MapCodec<dqk> a = b(dqk::new);
   public static final ebf b = ebe.I;
   private static final ffr c = dmm.b(8.0, 0.0, 8.0);

   public dqk(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(eww.c)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
