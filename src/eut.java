import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eut(czq b) implements euv {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czq.b.fieldOf("amount").forGetter(eut::c)).apply($$0, eut::new));

   @Override
   public float b(eqo $$0) {
      int $$1 = $$0.b(etk.k);
      return this.b.a($$1);
   }

   @Override
   public euu b() {
      return euw.g;
   }

   public static eut a(czq $$0) {
      return new eut($$0);
   }

   public czq c() {
      return this.b;
   }
}
