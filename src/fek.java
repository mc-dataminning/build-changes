import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fek(dgs b) implements fem {
   public static final MapCodec<fek> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgs.b.fieldOf("amount").forGetter(fek::c)).apply($$0, fek::new));

   @Override
   public float b(fah $$0) {
      int $$1 = $$0.b(fdb.k);
      return this.b.a($$1);
   }

   @Override
   public fel b() {
      return fen.g;
   }

   public static fek a(dgs $$0) {
      return new fek($$0);
   }

   public dgs c() {
      return this.b;
   }
}
