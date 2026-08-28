import com.mojang.serialization.MapCodec;

public interface eso<P extends esn> {
   eso<esl> a = a("clear", esl.a);
   eso<esm> b = a("passthrough", esm.b);
   eso<esk> c = a("append_static", esk.a);
   eso<esj> d = a("append_loot", esj.a);

   MapCodec<P> codec();

   private static <P extends esn> eso<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.n, $$0, () -> $$1);
   }
}
