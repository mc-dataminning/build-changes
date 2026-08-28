import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcq(dbu c) implements dcg {
   public static final MapCodec<dcq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.b.fieldOf("value").forGetter(dcq::b)).apply($$0, dcq::new));

   @Override
   public float a(int $$0, azn $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public dbu b() {
      return this.c;
   }
}
