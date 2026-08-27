import com.mojang.serialization.Codec;

public interface dis<P extends dir> {
   dis<dix> a = a("matching_blocks", dix.a);
   dis<diw> b = a("matching_block_tag", diw.e);
   dis<diy> c = a("matching_fluids", diy.a);
   dis<diu> d = a("has_sturdy_face", diu.a);
   dis<djb> e = a("solid", djb.a);
   dis<dja> f = a("replaceable", dja.a);
   dis<dje> g = a("would_survive", dje.a);
   dis<div> h = a("inside_world_bounds", div.a);
   dis<diq> i = a("any_of", diq.a);
   dis<dip> j = a("all_of", dip.a);
   dis<diz> k = a("not", diz.a);
   dis<djd> l = a("true", djd.e);

   Codec<P> codec();

   private static <P extends dir> dis<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.P, $$0, () -> $$1);
   }
}
