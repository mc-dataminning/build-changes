import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emw extends emr {
   public static final MapCodec<emw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brr.b(emr.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, emw::new)
   );
   private final brr<emr> b;

   public emw(brr<emr> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(bam $$0, een $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ems<?> a() {
      return ems.f;
   }
}
