import com.mojang.serialization.Codec;

public interface dsd<P extends dsc> {
   dsd<dsi> a = a("matching_blocks", dsi.a);
   dsd<dsh> b = a("matching_block_tag", dsh.e);
   dsd<dsj> c = a("matching_fluids", dsj.a);
   dsd<dsf> d = a("has_sturdy_face", dsf.a);
   dsd<dsm> e = a("solid", dsm.a);
   dsd<dsl> f = a("replaceable", dsl.a);
   dsd<dsp> g = a("would_survive", dsp.a);
   dsd<dsg> h = a("inside_world_bounds", dsg.a);
   dsd<dsb> i = a("any_of", dsb.a);
   dsd<dsa> j = a("all_of", dsa.a);
   dsd<dsk> k = a("not", dsk.a);
   dsd<dso> l = a("true", dso.e);

   Codec<P> codec();

   private static <P extends dsc> dsd<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.O, $$0, () -> $$1);
   }
}
