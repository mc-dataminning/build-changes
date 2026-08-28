import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdc(dfs b) implements fde {
   public static final MapCodec<fdc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfs.b.fieldOf("amount").forGetter(fdc::c)).apply($$0, fdc::new));

   @Override
   public float b(eyz $$0) {
      int $$1 = $$0.b(fbt.k);
      return this.b.a($$1);
   }

   @Override
   public fdd b() {
      return fdf.g;
   }

   public static fdc a(dfs $$0) {
      return new fdc($$0);
   }

   public dfs c() {
      return this.b;
   }
}
