import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhw extends dag implements dhv {
   public static final MapCodec<dhw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhv.a.e.fieldOf("weathering_state").forGetter(dhw::g), u()).apply($$0, dhw::new)
   );
   private final dhv.a e;

   @Override
   protected MapCodec<dhw> a() {
      return d;
   }

   public dhw(dhv.a $$0, dli.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
