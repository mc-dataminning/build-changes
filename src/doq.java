import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq implements dod {
   public static final Codec<doq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ja.v(16).optionalFieldOf("offset", ja.g).forGetter($$0x -> $$0x.e), dhn.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, doq::new)
   );
   private final ja e;
   private final dhn f;

   protected doq(ja $$0, dhn $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(csz $$0, hx $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public doe<?> a() {
      return doe.g;
   }
}
