import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efa implements eew {
   public static final MapCodec<efa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", jh.c).forGetter($$0x -> $$0x.e)).apply($$0, efa::new)
   );
   private final kl e;

   public efa(kl $$0) {
      this.e = $$0;
   }

   public boolean a(dif $$0, jh $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eex<?> a() {
      return eex.h;
   }
}
