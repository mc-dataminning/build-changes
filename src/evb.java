import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evb(czt b) implements evd {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czt.b.fieldOf("amount").forGetter(evb::c)).apply($$0, evb::new));

   @Override
   public float b(eqw $$0) {
      int $$1 = $$0.b(ets.k);
      return this.b.a($$1);
   }

   @Override
   public evc b() {
      return eve.g;
   }

   public static evb a(czt $$0) {
      return new evb($$0);
   }

   public czt c() {
      return this.b;
   }
}
