import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daw(daj d) implements das {
   public static final MapCodec<daw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, daw::new));

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   public daj b() {
      return this.d;
   }
}
