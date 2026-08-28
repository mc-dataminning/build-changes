import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dao(czt c) implements dae {
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czt.b.fieldOf("value").forGetter(dao::b)).apply($$0, dao::new));

   @Override
   public float a(int $$0, ayo $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   public czt b() {
      return this.c;
   }
}
