import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epu extends epp {
   public static final MapCodec<epu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsq.b(epp.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, epu::new)
   );
   private final bsq<epp> b;

   public epu(bsq<epp> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azv $$0, ehk $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public epq<?> a() {
      return epq.f;
   }
}
