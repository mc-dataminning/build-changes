import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfx extends dfs implements dft {
   public static final MapCodec<dfx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dft.a.e.fieldOf("weathering_state").forGetter(dfx::g), u()).apply($$0, dfx::new)
   );
   private final dft.a f;

   @Override
   protected MapCodec<dfx> a() {
      return e;
   }

   protected dfx(dft.a $$0, djg.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
