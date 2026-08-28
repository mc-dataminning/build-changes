import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdk(dfx b) implements fdm {
   public static final MapCodec<fdk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfx.b.fieldOf("amount").forGetter(fdk::c)).apply($$0, fdk::new));

   @Override
   public float b(ezh $$0) {
      int $$1 = $$0.b(fcb.k);
      return this.b.a($$1);
   }

   @Override
   public fdl b() {
      return fdn.g;
   }

   public static fdk a(dfx $$0) {
      return new fdk($$0);
   }

   public dfx c() {
      return this.b;
   }
}
