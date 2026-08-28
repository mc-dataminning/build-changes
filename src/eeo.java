import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo implements eea {
   public static final MapCodec<eeo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", km.h).forGetter($$0x -> $$0x.e), dwy.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eeo::new)
   );
   private final km e;
   private final dwy f;

   protected eeo(km $$0, dwy $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhh $$0, ji $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eeb<?> a() {
      return eeb.g;
   }
}
