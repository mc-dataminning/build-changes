import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekd extends ejy {
   public static final MapCodec<ekd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqg.b(ejy.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ekd::new)
   );
   private final bqg<ejy> b;

   public ekd(bqg<ejy> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azr $$0, ebw $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ejz<?> a() {
      return ejz.f;
   }
}
