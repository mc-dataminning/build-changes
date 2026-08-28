import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evu(daj b) implements evw {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("amount").forGetter(evu::c)).apply($$0, evu::new));

   @Override
   public float b(erp $$0) {
      int $$1 = $$0.b(eul.k);
      return this.b.a($$1);
   }

   @Override
   public evv b() {
      return evx.g;
   }

   public static evu a(daj $$0) {
      return new evu($$0);
   }

   public daj c() {
      return this.b;
   }
}
