import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dnw {
   public static final MapCodec<dof> e = b(dof::new);

   @Override
   public MapCodec<? extends dof> a() {
      return e;
   }

   public dof(dxp.d $$0) {
      super($$0);
   }

   public static dxq b() {
      return dkg.J.m();
   }

   @Override
   public void a(dgz $$0, cpr $$1, ji $$2, dxq $$3, @Nullable dus $$4, cxh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!ddt.a($$5, aws.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         dxq $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a(dhi.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dxq $$0, dgz $$1, ji $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
