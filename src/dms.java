import com.mojang.serialization.Codec;

public interface dms<P extends dmr> {
   dms<dmx> a = a("matching_blocks", dmx.a);
   dms<dmw> b = a("matching_block_tag", dmw.e);
   dms<dmy> c = a("matching_fluids", dmy.a);
   dms<dmu> d = a("has_sturdy_face", dmu.a);
   dms<dnb> e = a("solid", dnb.a);
   dms<dna> f = a("replaceable", dna.a);
   dms<dne> g = a("would_survive", dne.a);
   dms<dmv> h = a("inside_world_bounds", dmv.a);
   dms<dmq> i = a("any_of", dmq.a);
   dms<dmp> j = a("all_of", dmp.a);
   dms<dmz> k = a("not", dmz.a);
   dms<dnd> l = a("true", dnd.e);

   Codec<P> codec();

   private static <P extends dmr> dms<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.P, $$0, () -> $$1);
   }
}
