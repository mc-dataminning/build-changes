import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eny implements eob {
   public static final MapCodec<eny> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ub.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eny::new));
   private final ub b;

   public eny(ub $$0) {
      this.b = $$0;
   }

   @Override
   public ub a(ayw $$0, @Nullable ub $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eoc<?> a() {
      return eoc.c;
   }
}
