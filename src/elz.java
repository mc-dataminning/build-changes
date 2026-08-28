import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elz extends elu {
   public static final MapCodec<elz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqt.b(elu.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, elz::new)
   );
   private final bqt<elu> b;

   public elz(bqt<elu> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azh $$0, edq $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public elv<?> a() {
      return elv.f;
   }
}
