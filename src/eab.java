import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eab implements dzn {
   public static final MapCodec<eab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.v(16).optionalFieldOf("offset", ke.g).forGetter($$0x -> $$0x.e), dsl.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eab::new)
   );
   private final ke e;
   private final dsl f;

   protected eab(ke $$0, dsl $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(ddc $$0, ja $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dzo<?> a() {
      return dzo.g;
   }
}
