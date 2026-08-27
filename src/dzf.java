import com.mojang.serialization.Codec;

public interface dzf<P extends dze> {
   dzf<dzc> a = a("clear", dzc.a);
   dzf<dzd> b = a("passthrough", dzd.b);
   dzf<dzb> c = a("append_static", dzb.a);
   dzf<dza> d = a("append_loot", dza.a);

   Codec<P> codec();

   private static <P extends dze> dzf<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.q, $$0, () -> $$1);
   }
}
