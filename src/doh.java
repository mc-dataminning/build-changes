import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh implements dod {
   public static final Codec<doh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ja.v(16).optionalFieldOf("offset", hx.b).forGetter($$0x -> $$0x.e)).apply($$0, doh::new)
   );
   private final ja e;

   public doh(ja $$0) {
      this.e = $$0;
   }

   public boolean a(csz $$0, hx $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public doe<?> a() {
      return doe.h;
   }
}
