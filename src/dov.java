import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dov extends dom {
   public static final MapCodec<dov> e = b(dov::new);

   @Override
   public MapCodec<? extends dov> a() {
      return e;
   }

   public dov(dyl.d $$0) {
      super($$0);
   }

   public static dym b() {
      return dkw.J.m();
   }

   @Override
   public void a(dhp $$0, cqi $$1, jj $$2, dym $$3, @Nullable dvl $$4, cxy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dej.a($$5, axc.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         dym $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.a(dhy.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dym $$0, dhp $$1, jj $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
