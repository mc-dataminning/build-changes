import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class esj implements esm {
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ux.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, esj::new));
   private final ux b;

   public esj(ux $$0) {
      this.b = $$0;
   }

   @Override
   public ux a(bam $$0, @Nullable ux $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public esn<?> a() {
      return esn.c;
   }
}
