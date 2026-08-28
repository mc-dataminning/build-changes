import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtb extends dsw implements dsx {
   public static final MapCodec<dtb> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsx.a.e.fieldOf("weathering_state").forGetter(dtb::q), t()).apply($$0, dtb::new)
   );
   private final dsx.a f;

   @Override
   protected MapCodec<dtb> a() {
      return e;
   }

   protected dtb(dsx.a $$0, dwx.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwy $$0) {
      return dsx.c($$0.b()).isPresent();
   }

   public dsx.a q() {
      return this.f;
   }
}
