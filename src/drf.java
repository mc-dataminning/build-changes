import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drf extends dqw {
   public static final MapCodec<drf> e = b(drf::new);

   @Override
   public MapCodec<? extends drf> a() {
      return e;
   }

   public drf(ebd.d $$0) {
      super($$0);
   }

   public static ebe b() {
      return dne.J.m();
   }

   @Override
   public void a(djx $$0, crx $$1, iv $$2, ebe $$3, @Nullable dyc $$4, czy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dgn.a($$5, axg.s)) {
         if ($$0.F_().i()) {
            $$0.a($$2, false);
            return;
         }

         ebe $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.a(dkg.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ebe $$0, djx $$1, iv $$2) {
      if ($$1.F_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
