import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqp extends dqg {
   public static final MapCodec<dqp> e = b(dqp::new);

   @Override
   public MapCodec<? extends dqp> a() {
      return e;
   }

   public dqp(ean.d $$0) {
      super($$0);
   }

   public static eao b() {
      return dmo.J.m();
   }

   @Override
   public void a(djh $$0, crj $$1, iv $$2, eao $$3, @Nullable dxm $$4, czk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dfz.a($$5, axe.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         eao $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.a(djq.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(eao $$0, djh $$1, iv $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
