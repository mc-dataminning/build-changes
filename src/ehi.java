import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehi implements ehf {
   private final jz e;
   private final ja f;
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.v(16).optionalFieldOf("offset", jz.i).forGetter($$0x -> $$0x.e), ja.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, ehi::new)
   );

   public ehi(jz $$0, ja $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dju $$0, iu $$1) {
      iu $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public ehg<?> a() {
      return ehg.d;
   }
}
