import com.mojang.serialization.MapCodec;

public interface ein<P extends eim> {
   ein<eis> a = a("matching_blocks", eis.a);
   ein<eir> b = a("matching_block_tag", eir.e);
   ein<eit> c = a("matching_fluids", eit.a);
   ein<eip> d = a("has_sturdy_face", eip.a);
   ein<eiw> e = a("solid", eiw.a);
   ein<eiv> f = a("replaceable", eiv.a);
   ein<eja> g = a("would_survive", eja.a);
   ein<eiq> h = a("inside_world_bounds", eiq.a);
   ein<eil> i = a("any_of", eil.a);
   ein<eik> j = a("all_of", eik.a);
   ein<eiu> k = a("not", eiu.a);
   ein<eiy> l = a("true", eiy.e);
   ein<eiz> m = a("unobstructed", eiz.a);

   MapCodec<P> codec();

   private static <P extends eim> ein<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.M, $$0, () -> $$1);
   }
}
