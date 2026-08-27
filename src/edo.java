import com.mojang.serialization.Codec;

public interface edo<P extends edn> {
   edo<edl> a = a("clear", edl.a);
   edo<edm> b = a("passthrough", edm.b);
   edo<edk> c = a("append_static", edk.a);
   edo<edj> d = a("append_loot", edj.a);

   Codec<P> codec();

   private static <P extends edn> edo<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.p, $$0, () -> $$1);
   }
}
