import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddx extends ddq {
   public static final MapCodec<ddx> e = b(ddx::new);

   @Override
   public MapCodec<? extends ddx> a() {
      return e;
   }

   public ddx(dmy.d $$0) {
      super($$0);
   }

   public static dmz b() {
      return dac.G.o();
   }

   @Override
   public void a(cwz $$0, cis $$1, ib $$2, dmz $$3, @Nullable dkg $$4, cqk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cuv.a(cux.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dmz $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.a(cxi.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dmz $$0, cwz $$1, ib $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
