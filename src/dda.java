import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dda(jj<bvk> c) implements dcy {
   public static final MapCodec<dda> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.W).fieldOf("effects").forGetter(dda::b)).apply($$0, dda::new));
   public static final yw<wj, dda> b = yw.a(yu.c(mh.W), dda::b, dda::new);

   public dda(jf<bvk> $$0) {
      this(jj.a($$0));
   }

   @Override
   public dcy.a<dda> a() {
      return dcy.a.b;
   }

   @Override
   public boolean a(djh $$0, czk $$1, bxj $$2) {
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
