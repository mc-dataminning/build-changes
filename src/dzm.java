import com.mojang.serialization.Codec;

public interface dzm<P extends dzl> {
   dzm<dzj> a = a("clear", dzj.a);
   dzm<dzk> b = a("passthrough", dzk.b);
   dzm<dzi> c = a("append_static", dzi.a);
   dzm<dzh> d = a("append_loot", dzh.a);

   Codec<P> codec();

   private static <P extends dzl> dzm<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.q, $$0, () -> $$1);
   }
}
