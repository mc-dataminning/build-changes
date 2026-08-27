import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dem extends dcy implements deg {
   public static final MapCodec<dem> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deg.a.e.fieldOf("weathering_state").forGetter(cwg::c), dhn.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dem::new)
   );
   private final deg.a J;

   @Override
   public MapCodec<dem> a() {
      return I;
   }

   public dem(deg.a $$0, dhn $$1, dhm.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dhn $$0) {
      return deg.c($$0.b()).isPresent();
   }

   public deg.a g() {
      return this.J;
   }
}
