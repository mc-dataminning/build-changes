import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dog implements dod {
   private final ja e;
   private final ib f;
   public static final Codec<dog> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ja.v(16).optionalFieldOf("offset", ja.g).forGetter($$0x -> $$0x.e), ib.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dog::new)
   );

   public dog(ja $$0, ib $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(csz $$0, hx $$1) {
      hx $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public doe<?> a() {
      return doe.d;
   }
}
