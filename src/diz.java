import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diz extends dir {
   public static final MapCodec<diz> e = b(diz::new);

   @Override
   public MapCodec<? extends diz> a() {
      return e;
   }

   public diz(dsd.d $$0) {
      super($$0);
   }

   public static dse b() {
      return dfd.G.o();
   }

   @Override
   public void a(dca $$0, cmz $$1, iz $$2, dse $$3, @Nullable dpj $$4, cur $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (dad.a(daf.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dse $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.a(dcj.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dse $$0, dca $$1, iz $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
