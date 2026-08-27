import com.mojang.serialization.Codec;

public interface ebe<P extends ebd> {
   ebe<ebb> a = a("clear", ebb.a);
   ebe<ebc> b = a("passthrough", ebc.b);
   ebe<eba> c = a("append_static", eba.a);
   ebe<eaz> d = a("append_loot", eaz.a);

   Codec<P> codec();

   private static <P extends ebd> ebe<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.q, $$0, () -> $$1);
   }
}
