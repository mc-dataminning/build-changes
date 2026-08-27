import com.mojang.serialization.Codec;

public interface blr<P extends blq> {
   blr<bln> a = a("constant", bln.b);
   blr<blw> b = a("uniform", blw.a);
   blr<bli> c = a("biased_to_bottom", bli.a);
   blr<blj> d = a("clamped", blj.a);
   blr<blx> e = a("weighted_list", blx.a);
   blr<bll> f = a("clamped_normal", bll.a);

   Codec<P> codec();

   static <P extends blq> blr<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.M, $$0, () -> $$1);
   }
}
