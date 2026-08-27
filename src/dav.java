import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dav extends dao {
   public static final MapCodec<dav> e = b(dav::new);

   @Override
   public MapCodec<? extends dav> a() {
      return e;
   }

   public dav(djo.d $$0) {
      super($$0);
   }

   public static djp b() {
      return cxa.G.o();
   }

   @Override
   public void a(ctx $$0, cfq $$1, hx $$2, djp $$3, @Nullable dhd $$4, cng $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (crt.a(crv.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         djp $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.a(cug.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(djp $$0, ctx $$1, hx $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
