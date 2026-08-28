import com.mojang.serialization.MapCodec;

public interface esn<P extends esm> {
   esn<esk> a = a("clear", esk.a);
   esn<esl> b = a("passthrough", esl.b);
   esn<esj> c = a("append_static", esj.a);
   esn<esi> d = a("append_loot", esi.a);

   MapCodec<P> codec();

   private static <P extends esm> esn<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.n, $$0, () -> $$1);
   }
}
