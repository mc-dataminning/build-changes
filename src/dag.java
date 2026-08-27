import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dag extends czz {
   public static final MapCodec<dag> e = b(dag::new);

   @Override
   public MapCodec<? extends dag> a() {
      return e;
   }

   public dag(diz.d $$0) {
      super($$0);
   }

   public static dja b() {
      return cwl.G.o();
   }

   @Override
   public void a(cti $$0, cfb $$1, hx $$2, dja $$3, @Nullable dgo $$4, cmr $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cre.a(crg.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         dja $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.a(ctr.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dja $$0, cti $$1, hx $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
