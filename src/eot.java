import com.mojang.serialization.MapCodec;

public interface eot<P extends eos> {
   eot<eor> a = a("single_pool_element", eor.b);
   eot<eoq> b = a("list_pool_element", eoq.a);
   eot<eom> c = a("feature_pool_element", eom.a);
   eot<eol> d = a("empty_pool_element", eol.a);
   eot<eop> e = a("legacy_single_pool_element", eop.a);

   MapCodec<P> codec();

   static <P extends eos> eot<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.ag, $$0, () -> $$1);
   }
}
