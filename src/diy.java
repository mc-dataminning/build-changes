import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diy extends diq {
   public static final MapCodec<diy> e = b(diy::new);

   @Override
   public MapCodec<? extends diy> a() {
      return e;
   }

   public diy(dsc.d $$0) {
      super($$0);
   }

   public static dsd b() {
      return dfc.G.o();
   }

   @Override
   public void a(dbz $$0, cmy $$1, iz $$2, dsd $$3, @Nullable dpi $$4, cuq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (dac.a(dae.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dsd $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.a(dci.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsd $$0, dbz $$1, iz $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
