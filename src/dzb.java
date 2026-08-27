import com.mojang.serialization.Codec;

public interface dzb<P extends dza> {
   dzb<dyy> a = a("clear", dyy.a);
   dzb<dyz> b = a("passthrough", dyz.b);
   dzb<dyx> c = a("append_static", dyx.a);
   dzb<dyw> d = a("append_loot", dyw.a);

   Codec<P> codec();

   private static <P extends dza> dzb<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.q, $$0, () -> $$1);
   }
}
