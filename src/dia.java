import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dia extends dfu implements dhv {
   public static final MapCodec<dia> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhv.a.e.fieldOf("weathering_state").forGetter(czt::c), u()).apply($$0, dia::new)
   );
   private final dhv.a g;

   @Override
   public MapCodec<dia> a() {
      return f;
   }

   public dia(dhv.a $$0, dli.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
