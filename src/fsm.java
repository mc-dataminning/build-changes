import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsm(float b, float c) implements fsn {
   public static final MapCodec<fsm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fsm::b), ayw.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fsm::c))
            .apply($$0, fsm::new)
   );

   public fsm() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      return djv.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fsm> a() {
      return a;
   }
}
