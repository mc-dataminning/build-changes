import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dct(ji<bvh> c) implements dcr {
   public static final MapCodec<dct> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.W).fieldOf("effects").forGetter(dct::b)).apply($$0, dct::new));
   public static final yw<wj, dct> b = yw.a(yu.c(mg.W), dct::b, dct::new);

   public dct(je<bvh> $$0) {
      this(ji.a($$0));
   }

   @Override
   public dcr.a<dct> a() {
      return dcr.a.b;
   }

   @Override
   public boolean a(dja $$0, czd $$1, bxe $$2) {
      boolean $$3 = false;

      for (je<bvh> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ji<bvh> b() {
      return this.c;
   }
}
