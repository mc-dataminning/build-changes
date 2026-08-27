import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfh extends dds implements dfb {
   public static final MapCodec<dfh> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfb.a.e.fieldOf("weathering_state").forGetter(cxa::c), dip.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dfh::new)
   );
   private final dfb.a J;

   @Override
   public MapCodec<dfh> a() {
      return I;
   }

   public dfh(dfb.a $$0, dip $$1, dio.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dip $$0) {
      return dfb.c($$0.b()).isPresent();
   }

   public dfb.a g() {
      return this.J;
   }
}
