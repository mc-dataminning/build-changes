import com.mojang.serialization.MapCodec;

public interface ebs<P extends ebr> {
   ebs<ebx> a = a("matching_blocks", ebx.a);
   ebs<ebw> b = a("matching_block_tag", ebw.e);
   ebs<eby> c = a("matching_fluids", eby.a);
   ebs<ebu> d = a("has_sturdy_face", ebu.a);
   ebs<ecb> e = a("solid", ecb.a);
   ebs<eca> f = a("replaceable", eca.a);
   ebs<ecf> g = a("would_survive", ecf.a);
   ebs<ebv> h = a("inside_world_bounds", ebv.a);
   ebs<ebq> i = a("any_of", ebq.a);
   ebs<ebp> j = a("all_of", ebp.a);
   ebs<ebz> k = a("not", ebz.a);
   ebs<ecd> l = a("true", ecd.e);
   ebs<ece> m = a("unobstructed", ece.a);

   MapCodec<P> codec();

   private static <P extends ebr> ebs<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.M, $$0, () -> $$1);
   }
}
