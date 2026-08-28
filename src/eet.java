import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eet implements eep {
   public static final MapCodec<eet> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", jh.c).forGetter($$0x -> $$0x.e)).apply($$0, eet::new)
   );
   private final kl e;

   public eet(kl $$0) {
      this.e = $$0;
   }

   public boolean a(dhy $$0, jh $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eeq<?> a() {
      return eeq.h;
   }
}
