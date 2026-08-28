import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcu(dcq f, dcq g, dcq h) implements dck {
   public static final MapCodec<dcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcq.a.fieldOf("input").forGetter(dcu::b), dcq.a.fieldOf("result").forGetter(dcu::d), dcq.a.fieldOf("crafting_station").forGetter(dcu::e))
            .apply($$0, dcu::new)
   );
   public static final yn<wa, dcu> b = yn.a(dcq.b, dcu::b, dcq.b, dcu::d, dcq.b, dcu::e, dcu::new);
   public static final dck.a<dcu> c = new dck.a<>(a, b);

   @Override
   public dck.a<dcu> a() {
      return c;
   }

   public dcq b() {
      return this.f;
   }

   @Override
   public dcq d() {
      return this.g;
   }

   @Override
   public dcq e() {
      return this.h;
   }
}
