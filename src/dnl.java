import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnl extends dnc {
   public static final MapCodec<dnl> e = b(dnl::new);

   @Override
   public MapCodec<? extends dnl> a() {
      return e;
   }

   public dnl(dwv.d $$0) {
      super($$0);
   }

   public static dww b() {
      return djn.J.m();
   }

   @Override
   public void a(dgh $$0, cow $$1, ji $$2, dww $$3, @Nullable dty $$4, cwo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dda.a($$5, aws.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dww $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a(dgq.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dww $$0, dgh $$1, ji $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
