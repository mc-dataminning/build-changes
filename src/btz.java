import com.mojang.serialization.MapCodec;

public interface btz<P extends bty> {
   btz<btv> a = a("constant", btv.b);
   btz<bue> b = a("uniform", bue.a);
   btz<btq> c = a("biased_to_bottom", btq.a);
   btz<btr> d = a("clamped", btr.a);
   btz<buf> e = a("weighted_list", buf.a);
   btz<btt> f = a("clamped_normal", btt.a);

   MapCodec<P> codec();

   static <P extends bty> btz<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.K, $$0, () -> $$1);
   }
}
