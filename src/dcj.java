import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcj(dbu c) implements dcg {
   public static final MapCodec<dcj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.b.fieldOf("factor").forGetter(dcj::b)).apply($$0, dcj::new));

   @Override
   public float a(int $$0, azn $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public dbu b() {
      return this.c;
   }
}
