import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efa implements eex {
   private final kl e;
   private final jm f;
   public static final MapCodec<efa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.h).forGetter($$0x -> $$0x.e), jm.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, efa::new)
   );

   public efa(kl $$0, jm $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dig $$0, jh $$1) {
      jh $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public eey<?> a() {
      return eey.d;
   }
}
