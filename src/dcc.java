import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcc extends ctc implements dcb {
   public static final MapCodec<dcc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcb.a.e.fieldOf("weathering_state").forGetter(cud::c), t()).apply($$0, dcc::new)
   );
   private final dcb.a e;

   @Override
   public MapCodec<dcc> a() {
      return d;
   }

   public dcc(dcb.a $$0, dfc.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
