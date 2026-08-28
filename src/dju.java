import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dju extends djm {
   public static final MapCodec<dju> e = b(dju::new);

   @Override
   public MapCodec<? extends dju> a() {
      return e;
   }

   public dju(dsz.d $$0) {
      super($$0);
   }

   public static dta b() {
      return dfy.G.o();
   }

   @Override
   public void a(dcu $$0, cmv $$1, jd $$2, dta $$3, @Nullable dqf $$4, cuo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dac.a($$5, awg.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dta $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.a(ddd.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dta $$0, dcu $$1, jd $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
