import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fem(dgu b) implements feo {
   public static final MapCodec<fem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.b.fieldOf("amount").forGetter(fem::c)).apply($$0, fem::new));

   @Override
   public float b(faj $$0) {
      int $$1 = $$0.b(fdd.k);
      return this.b.a($$1);
   }

   @Override
   public fen b() {
      return fep.g;
   }

   public static fem a(dgu $$0) {
      return new fem($$0);
   }

   public dgu c() {
      return this.b;
   }
}
