import com.mojang.serialization.MapCodec;

public interface emo<P extends emn> {
   emo<eml> a = a("clear", eml.a);
   emo<emm> b = a("passthrough", emm.b);
   emo<emk> c = a("append_static", emk.a);
   emo<emj> d = a("append_loot", emj.a);

   MapCodec<P> codec();

   private static <P extends emn> emo<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.p, $$0, () -> $$1);
   }
}
