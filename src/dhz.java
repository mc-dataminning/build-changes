import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhz extends dhu implements dhv {
   public static final MapCodec<dhz> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhv.a.e.fieldOf("weathering_state").forGetter(dhz::g), u()).apply($$0, dhz::new)
   );
   private final dhv.a f;

   @Override
   protected MapCodec<dhz> a() {
      return e;
   }

   protected dhz(dhv.a $$0, dli.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
