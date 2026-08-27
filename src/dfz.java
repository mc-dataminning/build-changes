import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfz extends dej implements dft {
   public static final MapCodec<dfz> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dft.a.e.fieldOf("weathering_state").forGetter(cxr::c), djh.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dfz::new)
   );
   private final dft.a J;

   @Override
   public MapCodec<dfz> a() {
      return I;
   }

   public dfz(dft.a $$0, djh $$1, djg.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djh $$0) {
      return dft.c($$0.b()).isPresent();
   }

   public dft.a g() {
      return this.J;
   }
}
