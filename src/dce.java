import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dce extends dau implements dcb {
   public static final MapCodec<dce> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcb.a.e.fieldOf("weathering_state").forGetter(cud::c), dfd.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), t()).apply($$0, dce::new)
   );
   private final dcb.a J;

   @Override
   public MapCodec<dce> a() {
      return I;
   }

   public dce(dcb.a $$0, dfd $$1, dfc.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
