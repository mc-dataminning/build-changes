import com.mojang.serialization.Codec;

public interface dzk<P extends dzj> {
   dzk<dzh> a = a("clear", dzh.a);
   dzk<dzi> b = a("passthrough", dzi.b);
   dzk<dzg> c = a("append_static", dzg.a);
   dzk<dzf> d = a("append_loot", dzf.a);

   Codec<P> codec();

   private static <P extends dzj> dzk<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.q, $$0, () -> $$1);
   }
}
