import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfv extends dfo {
   public static final MapCodec<dfv> e = b(dfv::new);

   @Override
   public MapCodec<? extends dfv> a() {
      return e;
   }

   public dfv(doy.d $$0) {
      super($$0);
   }

   public static doz b() {
      return dca.G.n();
   }

   @Override
   public void a(cyx $$0, cjt $$1, ib $$2, doz $$3, @Nullable dmf $$4, crj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cwr.a(cwt.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         doz $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.a(czg.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(doz $$0, cyx $$1, ib $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
