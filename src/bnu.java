import com.mojang.serialization.Codec;

public interface bnu<P extends bnt> {
   bnu<bnr> a = a("constant", bnr.b);
   bnu<boa> b = a("uniform", boa.a);
   bnu<bnp> c = a("clamped_normal", bnp.a);
   bnu<bnz> d = a("trapezoid", bnz.a);

   Codec<P> codec();

   static <P extends bnt> bnu<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.L, $$0, () -> $$1);
   }
}
