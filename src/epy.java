import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epy implements eqb {
   public static final MapCodec<epy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(uj.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, epy::new));
   private final uj b;

   public epy(uj $$0) {
      this.b = $$0;
   }

   @Override
   public uj a(azr $$0, @Nullable uj $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eqc<?> a() {
      return eqc.c;
   }
}
