import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcd extends dad implements dcb {
   public static final MapCodec<dcd> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcb.a.e.fieldOf("weathering_state").forGetter(cud::c), t()).apply($$0, dcd::new)
   );
   private final dcb.a g;

   @Override
   public MapCodec<dcd> a() {
      return f;
   }

   public dcd(dcb.a $$0, dfc.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfd $$0) {
      return dcb.c($$0.b()).isPresent();
   }

   public dcb.a g() {
      return this.g;
   }
}
