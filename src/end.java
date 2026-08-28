import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class end implements eng {
   public static final MapCodec<end> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tx.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, end::new));
   private final tx b;

   public end(tx $$0) {
      this.b = $$0;
   }

   @Override
   public tx a(ayo $$0, @Nullable tx $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public enh<?> a() {
      return enh.c;
   }
}
