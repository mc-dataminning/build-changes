import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhx extends day implements dhv {
   public static final MapCodec<dhx> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dly.a.fieldOf("block_set_type").forGetter(day::b), dhv.a.e.fieldOf("weathering_state").forGetter(dhx::g), u()).apply($$0, dhx::new)
   );
   private final dhv.a m;

   @Override
   public MapCodec<dhx> a() {
      return l;
   }

   protected dhx(dly $$0, dhv.a $$1, dli.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(day.f) == dmf.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dlj $$0) {
      return dhv.c($$0.b()).isPresent();
   }

   public dhv.a g() {
      return this.m;
   }
}
