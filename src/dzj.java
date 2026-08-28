import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzj implements dzg {
   private final ke e;
   private final jf f;
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.v(16).optionalFieldOf("offset", ke.g).forGetter($$0x -> $$0x.e), jf.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dzj::new)
   );

   public dzj(ke $$0, jf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcz $$0, ja $$1) {
      ja $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dzh<?> a() {
      return dzh.d;
   }
}
