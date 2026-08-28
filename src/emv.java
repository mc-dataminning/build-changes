import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emv implements emy {
   public static final MapCodec<emv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tx.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, emv::new));
   private final tx b;

   public emv(tx $$0) {
      this.b = $$0;
   }

   @Override
   public tx a(aym $$0, @Nullable tx $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public emz<?> a() {
      return emz.c;
   }
}
