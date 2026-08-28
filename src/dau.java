import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dau(dah d) implements daq {
   public static final MapCodec<dau> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dau::new));

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dau> a() {
      return a;
   }

   public dah b() {
      return this.d;
   }
}
