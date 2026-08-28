import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnn extends dne {
   public static final MapCodec<dnn> e = b(dnn::new);

   @Override
   public MapCodec<? extends dnn> a() {
      return e;
   }

   public dnn(dwx.d $$0) {
      super($$0);
   }

   public static dwy b() {
      return djp.J.m();
   }

   @Override
   public void a(dgj $$0, coy $$1, ji $$2, dwy $$3, @Nullable dua $$4, cwq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!ddc.a($$5, aws.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dwy $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a(dgs.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dwy $$0, dgj $$1, ji $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
