import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgh(dgd f, dgd g, dgd h) implements dfx {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgd.a.fieldOf("input").forGetter(dgh::b), dgd.a.fieldOf("result").forGetter(dgh::d), dgd.a.fieldOf("crafting_station").forGetter(dgh::e))
            .apply($$0, dgh::new)
   );
   public static final za<wn, dgh> b = za.a(dgd.b, dgh::b, dgd.b, dgh::d, dgd.b, dgh::e, dgh::new);
   public static final dfx.a<dgh> c = new dfx.a<>(a, b);

   @Override
   public dfx.a<dgh> a() {
      return c;
   }

   public dgd b() {
      return this.f;
   }

   @Override
   public dgd d() {
      return this.g;
   }

   @Override
   public dgd e() {
      return this.h;
   }
}
