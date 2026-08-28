import com.mojang.serialization.MapCodec;

public interface ewy<P extends ewx> {
   ewy<ewv> a = a("clear", ewv.a);
   ewy<eww> b = a("passthrough", eww.b);
   ewy<ewu> c = a("append_static", ewu.a);
   ewy<ewt> d = a("append_loot", ewt.a);

   MapCodec<P> codec();

   private static <P extends ewx> ewy<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.n, $$0, () -> $$1);
   }
}
