import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emv extends emq {
   public static final MapCodec<emv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brq.b(emq.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, emv::new)
   );
   private final brq<emq> b;

   public emv(brq<emq> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(bam $$0, eem $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public emr<?> a() {
      return emr.f;
   }
}
