import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dib extends dgl implements dhv {
   public static final MapCodec<dib> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhv.a.e.fieldOf("weathering_state").forGetter(czt::c), dlj.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dib::new)
   );
   private final dhv.a J;

   @Override
   public MapCodec<dib> a() {
      return I;
   }

   public dib(dhv.a $$0, dlj $$1, dli.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dlj $$0) {
      return dhv.c($$0.b()).isPresent();
   }

   public dhv.a g() {
      return this.J;
   }
}
