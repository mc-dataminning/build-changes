import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ees implements eep {
   private final kl e;
   private final jm f;
   public static final MapCodec<ees> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.g).forGetter($$0x -> $$0x.e), jm.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, ees::new)
   );

   public ees(kl $$0, jm $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhy $$0, jh $$1) {
      jh $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public eeq<?> a() {
      return eeq.d;
   }
}
