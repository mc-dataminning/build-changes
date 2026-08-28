import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzq implements dzn {
   private final ke e;
   private final jf f;
   public static final MapCodec<dzq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.v(16).optionalFieldOf("offset", ke.g).forGetter($$0x -> $$0x.e), jf.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dzq::new)
   );

   public dzq(ke $$0, jf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(ddc $$0, ja $$1) {
      ja $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dzo<?> a() {
      return dzo.d;
   }
}
