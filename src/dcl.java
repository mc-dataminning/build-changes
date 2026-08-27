import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcl extends dce {
   public static final MapCodec<dcl> e = b(dcl::new);

   @Override
   public MapCodec<? extends dcl> a() {
      return e;
   }

   public dcl(dle.d $$0) {
      super($$0);
   }

   public static dlf b() {
      return cyq.G.o();
   }

   @Override
   public void a(cvn $$0, chh $$1, hz $$2, dlf $$3, @Nullable dit $$4, coz $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (ctj.a(ctl.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         dlf $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.a(cvw.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dlf $$0, cvn $$1, hz $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
