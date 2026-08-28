import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecu implements ecm {
   public static final MapCodec<ecu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecm.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ecu::new)
   );
   private final ecm e;

   public ecu(ecm $$0) {
      this.e = $$0;
   }

   public boolean a(dfy $$0, jh $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ecn<?> a() {
      return ecn.k;
   }
}
