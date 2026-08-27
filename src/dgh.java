import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgh extends der implements dgb {
   public static final MapCodec<dgh> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgb.a.e.fieldOf("weathering_state").forGetter(cxz::c), djp.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dgh::new)
   );
   private final dgb.a J;

   @Override
   public MapCodec<dgh> a() {
      return I;
   }

   public dgh(dgb.a $$0, djp $$1, djo.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djp $$0) {
      return dgb.c($$0.b()).isPresent();
   }

   public dgb.a g() {
      return this.J;
   }
}
