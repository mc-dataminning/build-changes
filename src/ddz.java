import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddz extends dds {
   public static final MapCodec<ddz> e = b(ddz::new);

   @Override
   public MapCodec<? extends ddz> a() {
      return e;
   }

   public ddz(dna.d $$0) {
      super($$0);
   }

   public static dnb b() {
      return dae.G.o();
   }

   @Override
   public void a(cxb $$0, ciu $$1, ib $$2, dnb $$3, @Nullable dki $$4, cqm $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cux.a(cuz.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dnb $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.a(cxk.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dnb $$0, cxb $$1, ib $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
