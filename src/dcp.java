import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcp extends dci {
   public static final MapCodec<dcp> e = b(dcp::new);

   @Override
   public MapCodec<? extends dcp> a() {
      return e;
   }

   public dcp(dli.d $$0) {
      super($$0);
   }

   public static dlj b() {
      return cyu.G.o();
   }

   @Override
   public void a(cvr $$0, chl $$1, hz $$2, dlj $$3, @Nullable dix $$4, cpd $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (ctn.a(ctp.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         dlj $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.a(cwa.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dlj $$0, cvr $$1, hz $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
