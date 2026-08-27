import com.mojang.serialization.Codec;

public interface eac<P extends eab> {
   eac<dzz> a = a("clear", dzz.a);
   eac<eaa> b = a("passthrough", eaa.b);
   eac<dzy> c = a("append_static", dzy.a);
   eac<dzx> d = a("append_loot", dzx.a);

   Codec<P> codec();

   private static <P extends eab> eac<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.q, $$0, () -> $$1);
   }
}
