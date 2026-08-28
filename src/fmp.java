import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmp(int b, int c) implements fmt {
   public static final MapCodec<fmp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(fmp::b), ayi.i.fieldOf("default").forGetter(fmp::c)).apply($$0, fmp::new)
   );

   @Override
   public int a(cwp $$0) {
      cyz $$1 = $$0.a(kv.p);
      if ($$1 != null) {
         Integer $$2 = $$1.d(this.b);
         if ($$2 != null) {
            return axk.f($$2);
         }
      }

      return axk.f(this.c);
   }

   @Override
   public MapCodec<fmp> a() {
      return a;
   }
}
