import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efb implements eex {
   public static final MapCodec<efb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", jh.c).forGetter($$0x -> $$0x.e)).apply($$0, efb::new)
   );
   private final kl e;

   public efb(kl $$0) {
      this.e = $$0;
   }

   public boolean a(dig $$0, jh $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eey<?> a() {
      return eey.h;
   }
}
