import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqi extends dmm implements dtx {
   public static final MapCodec<dqi> a = b(dqi::new);
   private static final ebf b = ebe.I;
   private static final ffr c = dmm.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   protected dqi(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = super.a($$0);
      if ($$1 != null) {
         ewv $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == eww.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.d();
      eao $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jb.a);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.b && !this.a($$0, $$1, $$3)) {
         return dmo.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
