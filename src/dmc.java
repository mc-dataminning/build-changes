import com.mojang.serialization.Codec;

public interface dmc<P extends dmb> {
   dmc<dmh> a = a("matching_blocks", dmh.a);
   dmc<dmg> b = a("matching_block_tag", dmg.e);
   dmc<dmi> c = a("matching_fluids", dmi.a);
   dmc<dme> d = a("has_sturdy_face", dme.a);
   dmc<dml> e = a("solid", dml.a);
   dmc<dmk> f = a("replaceable", dmk.a);
   dmc<dmo> g = a("would_survive", dmo.a);
   dmc<dmf> h = a("inside_world_bounds", dmf.a);
   dmc<dma> i = a("any_of", dma.a);
   dmc<dlz> j = a("all_of", dlz.a);
   dmc<dmj> k = a("not", dmj.a);
   dmc<dmn> l = a("true", dmn.e);

   Codec<P> codec();

   private static <P extends dmb> dmc<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.P, $$0, () -> $$1);
   }
}
