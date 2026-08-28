import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu implements eeq {
   public static final MapCodec<eeu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", jh.c).forGetter($$0x -> $$0x.e)).apply($$0, eeu::new)
   );
   private final kl e;

   public eeu(kl $$0) {
      this.e = $$0;
   }

   public boolean a(dhx $$0, jh $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eer<?> a() {
      return eer.h;
   }
}
