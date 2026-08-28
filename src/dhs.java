import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhs(dhe d) implements dho {
   public static final MapCodec<dhs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhe.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dhs::new));

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   public dhe b() {
      return this.d;
   }
}
