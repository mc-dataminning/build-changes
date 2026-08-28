import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doe extends dnv {
   public static final MapCodec<doe> e = b(doe::new);

   @Override
   public MapCodec<? extends doe> a() {
      return e;
   }

   public doe(dxm.d $$0) {
      super($$0);
   }

   public static dxn b() {
      return dkg.J.m();
   }

   @Override
   public void a(dha $$0, cps $$1, jh $$2, dxn $$3, @Nullable dup $$4, cxk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!ddt.a($$5, axx.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dxn $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.a(dhj.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dxn $$0, dha $$1, jh $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
