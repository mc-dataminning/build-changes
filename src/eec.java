import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eec extends edx {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bmp.b(edx.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eec::new)
   );
   private final bmp<edx> b;

   public eec(bmp<edx> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(axt $$0, dvx $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public edy<?> a() {
      return edy.f;
   }
}
