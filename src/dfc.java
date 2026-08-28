import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfc(deo d) implements dey {
   public static final MapCodec<dfc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deo.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dfc::new));

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public deo b() {
      return this.d;
   }
}
