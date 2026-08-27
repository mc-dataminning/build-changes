import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dic extends dhe implements dhv {
   public static final MapCodec<dic> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dly.a.fieldOf("block_set_type").forGetter(dhe::g), dhv.a.e.fieldOf("weathering_state").forGetter(dic::s), u()).apply($$0, dic::new)
   );
   private final dhv.a n;

   @Override
   public MapCodec<dic> a() {
      return m;
   }

   protected dic(dly $$0, dhv.a $$1, dli.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dlj $$0) {
      return dhv.c($$0.b()).isPresent();
   }

   public dhv.a s() {
      return this.n;
   }
}
