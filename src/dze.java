import com.mojang.serialization.Codec;

public interface dze<P extends dzd> {
   dze<dzb> a = a("clear", dzb.a);
   dze<dzc> b = a("passthrough", dzc.b);
   dze<dza> c = a("append_static", dza.a);
   dze<dyz> d = a("append_loot", dyz.a);

   Codec<P> codec();

   private static <P extends dzd> dze<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.q, $$0, () -> $$1);
   }
}
