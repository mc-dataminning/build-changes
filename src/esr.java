import com.mojang.serialization.MapCodec;

public interface esr<P extends esq> {
   esr<esp> a = a("single_pool_element", esp.b);
   esr<eso> b = a("list_pool_element", eso.a);
   esr<esk> c = a("feature_pool_element", esk.a);
   esr<esj> d = a("empty_pool_element", esj.a);
   esr<esn> e = a("legacy_single_pool_element", esn.a);

   MapCodec<P> codec();

   static <P extends esq> esr<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.ag, $$0, () -> $$1);
   }
}
