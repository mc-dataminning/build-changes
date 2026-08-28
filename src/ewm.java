import com.mojang.serialization.MapCodec;

public interface ewm<P extends ewl> {
   ewm<ewj> a = a("clear", ewj.a);
   ewm<ewk> b = a("passthrough", ewk.b);
   ewm<ewi> c = a("append_static", ewi.a);
   ewm<ewh> d = a("append_loot", ewh.a);

   MapCodec<P> codec();

   private static <P extends ewl> ewm<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.n, $$0, () -> $$1);
   }
}
