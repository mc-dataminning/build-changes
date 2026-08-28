import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends doc {
   public static final MapCodec<dol> e = b(dol::new);

   @Override
   public MapCodec<? extends dol> a() {
      return e;
   }

   public dol(dxt.d $$0) {
      super($$0);
   }

   public static dxu b() {
      return dkn.J.m();
   }

   @Override
   public void a(dhh $$0, cpw $$1, jh $$2, dxu $$3, @Nullable duw $$4, cxo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dea.a($$5, axx.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dxu $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.a(dhq.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dxu $$0, dhh $$1, jh $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
