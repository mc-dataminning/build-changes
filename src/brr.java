import com.mojang.serialization.MapCodec;

public interface brr<P extends brq> {
   brr<brn> a = a("constant", brn.b);
   brr<brw> b = a("uniform", brw.a);
   brr<bri> c = a("biased_to_bottom", bri.a);
   brr<brj> d = a("clamped", brj.a);
   brr<brx> e = a("weighted_list", brx.a);
   brr<brl> f = a("clamped_normal", brl.a);

   MapCodec<P> codec();

   static <P extends brq> brr<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.K, $$0, () -> $$1);
   }
}
