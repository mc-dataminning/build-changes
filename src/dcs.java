import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcs(dco f, dco g, dco h) implements dci {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dco.a.fieldOf("input").forGetter(dcs::b), dco.a.fieldOf("result").forGetter(dcs::d), dco.a.fieldOf("crafting_station").forGetter(dcs::e))
            .apply($$0, dcs::new)
   );
   public static final yn<wa, dcs> b = yn.a(dco.b, dcs::b, dco.b, dcs::d, dco.b, dcs::e, dcs::new);
   public static final dci.a<dcs> c = new dci.a<>(a, b);

   @Override
   public dci.a<dcs> a() {
      return c;
   }

   public dco b() {
      return this.f;
   }

   @Override
   public dco d() {
      return this.g;
   }

   @Override
   public dco e() {
      return this.h;
   }
}
