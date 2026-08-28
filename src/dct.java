import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dct(dcp f, dcp g, dcp h) implements dcj {
   public static final MapCodec<dct> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcp.a.fieldOf("input").forGetter(dct::b), dcp.a.fieldOf("result").forGetter(dct::d), dcp.a.fieldOf("crafting_station").forGetter(dct::e))
            .apply($$0, dct::new)
   );
   public static final ym<vz, dct> b = ym.a(dcp.b, dct::b, dcp.b, dct::d, dcp.b, dct::e, dct::new);
   public static final dcj.a<dct> c = new dcj.a<>(a, b);

   @Override
   public dcj.a<dct> a() {
      return c;
   }

   public dcp b() {
      return this.f;
   }

   @Override
   public dcp d() {
      return this.g;
   }

   @Override
   public dcp e() {
      return this.h;
   }
}
