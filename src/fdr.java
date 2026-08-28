import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdr(dge b) implements fdt {
   public static final MapCodec<fdr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dge.b.fieldOf("amount").forGetter(fdr::c)).apply($$0, fdr::new));

   @Override
   public float b(ezo $$0) {
      int $$1 = $$0.b(fci.k);
      return this.b.a($$1);
   }

   @Override
   public fds b() {
      return fdu.g;
   }

   public static fdr a(dge $$0) {
      return new fdr($$0);
   }

   public dge c() {
      return this.b;
   }
}
