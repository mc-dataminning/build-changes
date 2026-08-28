import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends dnu {
   public static final MapCodec<dod> e = b(dod::new);

   @Override
   public MapCodec<? extends dod> a() {
      return e;
   }

   public dod(dxn.d $$0) {
      super($$0);
   }

   public static dxo b() {
      return dkf.J.m();
   }

   @Override
   public void a(dgz $$0, cpo $$1, jh $$2, dxo $$3, @Nullable duq $$4, cxg $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dds.a($$5, axn.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dxo $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.a(dhi.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dxo $$0, dgz $$1, jh $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
