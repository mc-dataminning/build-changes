import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddd(jj<bvk> c) implements ddb {
   public static final MapCodec<ddd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.W).fieldOf("effects").forGetter(ddd::b)).apply($$0, ddd::new));
   public static final yw<wj, ddd> b = yw.a(yu.c(mh.W), ddd::b, ddd::new);

   public ddd(jf<bvk> $$0) {
      this(jj.a($$0));
   }

   @Override
   public ddb.a<ddd> a() {
      return ddb.a.b;
   }

   @Override
   public boolean a(djm $$0, czn $$1, bxj $$2) {
      boolean $$3 = false;

      for (jf<bvk> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jj<bvk> b() {
      return this.c;
   }
}
