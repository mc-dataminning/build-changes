import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dis extends dik {
   public static final MapCodec<dis> e = b(dis::new);

   @Override
   public MapCodec<? extends dis> a() {
      return e;
   }

   public dis(drw.d $$0) {
      super($$0);
   }

   public static drx b() {
      return dew.G.n();
   }

   @Override
   public void a(dbt $$0, cms $$1, iz $$2, drx $$3, @Nullable dpc $$4, cuk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (czw.a(czy.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         drx $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.a(dcc.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(drx $$0, dbt $$1, iz $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
