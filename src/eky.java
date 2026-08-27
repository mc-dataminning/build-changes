import com.mojang.serialization.Codec;

public interface eky<P extends ekx> {
   eky<ekv> a = a("clear", ekv.a);
   eky<ekw> b = a("passthrough", ekw.b);
   eky<eku> c = a("append_static", eku.a);
   eky<ekt> d = a("append_loot", ekt.a);

   Codec<P> codec();

   private static <P extends ekx> eky<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.p, $$0, () -> $$1);
   }
}
