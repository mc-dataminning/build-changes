import com.mojang.serialization.MapCodec;

public interface bqy<P extends bqx> {
   bqy<bqu> a = a("constant", bqu.b);
   bqy<brd> b = a("uniform", brd.a);
   bqy<bqp> c = a("biased_to_bottom", bqp.a);
   bqy<bqq> d = a("clamped", bqq.a);
   bqy<bre> e = a("weighted_list", bre.a);
   bqy<bqs> f = a("clamped_normal", bqs.a);

   MapCodec<P> codec();

   static <P extends bqx> bqy<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.K, $$0, () -> $$1);
   }
}
