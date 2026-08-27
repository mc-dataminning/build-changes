import com.mojang.serialization.Codec;

public class dxr extends dyf {
   private static final dxr c = new dxr();
   public static Codec<dxr> a = Codec.unit(() -> c);

   private dxr() {
   }

   public static dxr a() {
      return c;
   }

   @Override
   protected boolean a(dye $$0, aup $$1, hx $$2) {
      dyd $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ih<cuh> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dyh<?> b() {
      return dyh.e;
   }
}
