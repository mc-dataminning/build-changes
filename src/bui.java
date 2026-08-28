import com.mojang.serialization.MapCodec;

public interface bui<P extends buh> {
   bui<bue> a = a("constant", bue.b);
   bui<bun> b = a("uniform", bun.a);
   bui<btz> c = a("biased_to_bottom", btz.a);
   bui<bua> d = a("clamped", bua.a);
   bui<buo> e = a("weighted_list", buo.a);
   bui<buc> f = a("clamped_normal", buc.a);

   MapCodec<P> codec();

   static <P extends buh> bui<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.K, $$0, () -> $$1);
   }
}
