import com.mojang.serialization.Codec;

public interface dza<P extends dyz> {
   dza<dyx> a = a("clear", dyx.a);
   dza<dyy> b = a("passthrough", dyy.b);
   dza<dyw> c = a("append_static", dyw.a);
   dza<dyv> d = a("append_loot", dyv.a);

   Codec<P> codec();

   private static <P extends dyz> dza<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.q, $$0, () -> $$1);
   }
}
