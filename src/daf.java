import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daf(czs d) implements dab {
   public static final MapCodec<daf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czs.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, daf::new));

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public czs b() {
      return this.d;
   }
}
