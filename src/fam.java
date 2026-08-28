import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fam(ddy b) implements fao {
   public static final MapCodec<fam> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("amount").forGetter(fam::c)).apply($$0, fam::new));

   @Override
   public float b(ewh $$0) {
      int $$1 = $$0.b(ezd.k);
      return this.b.a($$1);
   }

   @Override
   public fan b() {
      return fap.g;
   }

   public static fam a(ddy $$0) {
      return new fam($$0);
   }

   public ddy c() {
      return this.b;
   }
}
