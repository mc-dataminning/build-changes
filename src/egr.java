import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egr extends egm {
   public static final MapCodec<egr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(boz.b(egm.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, egr::new)
   );
   private final boz<egm> b;

   public egr(boz<egm> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azc $$0, dym $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public egn<?> a() {
      return egn.f;
   }
}
