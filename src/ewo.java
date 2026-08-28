import com.mojang.serialization.MapCodec;

public interface ewo<P extends ewn> {
   ewo<ewl> a = a("clear", ewl.a);
   ewo<ewm> b = a("passthrough", ewm.b);
   ewo<ewk> c = a("append_static", ewk.a);
   ewo<ewj> d = a("append_loot", ewj.a);

   MapCodec<P> codec();

   private static <P extends ewn> ewo<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.n, $$0, () -> $$1);
   }
}
