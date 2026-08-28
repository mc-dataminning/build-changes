import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgf(dgb f, dgb g, dgb h) implements dfv {
   public static final MapCodec<dgf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgb.a.fieldOf("input").forGetter(dgf::b), dgb.a.fieldOf("result").forGetter(dgf::d), dgb.a.fieldOf("crafting_station").forGetter(dgf::e))
            .apply($$0, dgf::new)
   );
   public static final yy<wl, dgf> b = yy.a(dgb.b, dgf::b, dgb.b, dgf::d, dgb.b, dgf::e, dgf::new);
   public static final dfv.a<dgf> c = new dfv.a<>(a, b);

   @Override
   public dfv.a<dgf> a() {
      return c;
   }

   public dgb b() {
      return this.f;
   }

   @Override
   public dgb d() {
      return this.g;
   }

   @Override
   public dgb e() {
      return this.h;
   }
}
