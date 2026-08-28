import com.mojang.serialization.MapCodec;

public class erf extends ert {
   private static final erf c = new erf();
   public static MapCodec<erf> a = MapCodec.unit(() -> c);

   private erf() {
   }

   public static erf a() {
      return c;
   }

   @Override
   protected boolean a(ers $$0, bai $$1, iw $$2) {
      err $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jg<dlm> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public erv<?> b() {
      return erv.e;
   }
}
