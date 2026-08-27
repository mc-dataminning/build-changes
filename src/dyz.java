import com.mojang.serialization.Codec;

public interface dyz<P extends dyy> {
   dyz<dyw> a = a("clear", dyw.a);
   dyz<dyx> b = a("passthrough", dyx.b);
   dyz<dyv> c = a("append_static", dyv.a);
   dyz<dyu> d = a("append_loot", dyu.a);

   Codec<P> codec();

   private static <P extends dyy> dyz<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.q, $$0, () -> $$1);
   }
}
