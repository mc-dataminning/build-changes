import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekn extends eki {
   public static final MapCodec<ekn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqp.b(eki.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ekn::new)
   );
   private final bqp<eki> b;

   public ekn(bqp<eki> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azv $$0, ecg $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ekj<?> a() {
      return ekj.f;
   }
}
