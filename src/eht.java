import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eht implements ehf {
   public static final MapCodec<eht> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.v(16).optionalFieldOf("offset", jz.i).forGetter($$0x -> $$0x.e), dzz.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eht::new)
   );
   private final jz e;
   private final dzz f;

   protected eht(jz $$0, dzz $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dju $$0, iu $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ehg<?> a() {
      return ehg.g;
   }
}
