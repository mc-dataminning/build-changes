import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehc extends egx {
   public static final MapCodec<ehc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bon.b(egx.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ehc::new)
   );
   private final bon<egx> b;

   public ehc(bon<egx> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(aym $$0, dyw $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public egy<?> a() {
      return egy.f;
   }
}
