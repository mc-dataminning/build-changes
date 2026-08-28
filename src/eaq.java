import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaq implements eac {
   public static final MapCodec<eaq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.v(16).optionalFieldOf("offset", kh.g).forGetter($$0x -> $$0x.e), dta.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eaq::new)
   );
   private final kh e;
   private final dta f;

   protected eaq(kh $$0, dta $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(ddq $$0, jd $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ead<?> a() {
      return ead.g;
   }
}
