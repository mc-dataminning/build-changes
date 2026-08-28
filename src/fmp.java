import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmp(int b, int c) implements fmt {
   public static final MapCodec<fmp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(fmp::b), ayi.i.fieldOf("default").forGetter(fmp::c)).apply($$0, fmp::new)
   );

   @Override
   public int a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2) {
      cyz $$3 = $$0.a(kv.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axk.f($$4);
         }
      }

      return axk.f(this.c);
   }

   @Override
   public MapCodec<fmp> a() {
      return a;
   }
}
