import com.mojang.serialization.Codec;

public interface drw<P extends drv> {
   drw<dsb> a = a("matching_blocks", dsb.a);
   drw<dsa> b = a("matching_block_tag", dsa.e);
   drw<dsc> c = a("matching_fluids", dsc.a);
   drw<dry> d = a("has_sturdy_face", dry.a);
   drw<dsf> e = a("solid", dsf.a);
   drw<dse> f = a("replaceable", dse.a);
   drw<dsi> g = a("would_survive", dsi.a);
   drw<drz> h = a("inside_world_bounds", drz.a);
   drw<dru> i = a("any_of", dru.a);
   drw<drt> j = a("all_of", drt.a);
   drw<dsd> k = a("not", dsd.a);
   drw<dsh> l = a("true", dsh.e);

   Codec<P> codec();

   private static <P extends drv> drw<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.O, $$0, () -> $$1);
   }
}
