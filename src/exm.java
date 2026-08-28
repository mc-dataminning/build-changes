import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exm(dbr b) implements exo {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.b.fieldOf("amount").forGetter(exm::c)).apply($$0, exm::new));

   @Override
   public float b(eth $$0) {
      int $$1 = $$0.b(ewd.k);
      return this.b.a($$1);
   }

   @Override
   public exn b() {
      return exp.g;
   }

   public static exm a(dbr $$0) {
      return new exm($$0);
   }

   public dbr c() {
      return this.b;
   }
}
