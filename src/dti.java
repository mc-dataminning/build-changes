import com.mojang.serialization.Codec;

public interface dti<P extends dth> {
   dti<dtg> a = a("single_pool_element", dtg.b);
   dti<dtf> b = a("list_pool_element", dtf.a);
   dti<dtb> c = a("feature_pool_element", dtb.a);
   dti<dta> d = a("empty_pool_element", dta.a);
   dti<dte> e = a("legacy_single_pool_element", dte.a);

   Codec<P> codec();

   static <P extends dth> dti<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ai, $$0, () -> $$1);
   }
}
