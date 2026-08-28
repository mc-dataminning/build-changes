import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejs extends ejn {
   public static final MapCodec<ejs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqc.b(ejn.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ejs::new)
   );
   private final bqc<ejn> b;

   public ejs(bqc<ejn> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azn $$0, ebl $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ejo<?> a() {
      return ejo.f;
   }
}
