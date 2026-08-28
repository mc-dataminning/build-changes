import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtc extends dsd implements dsv {
   public static final MapCodec<dtc> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxl.a.fieldOf("block_set_type").forGetter(dsd::q), dsv.a.e.fieldOf("weathering_state").forGetter(dtc::r), t()).apply($$0, dtc::new)
   );
   private final dsv.a n;

   @Override
   public MapCodec<dtc> a() {
      return m;
   }

   protected dtc(dxl $$0, dsv.a $$1, dwv.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dww $$0) {
      return dsv.c($$0.b()).isPresent();
   }

   public dsv.a r() {
      return this.n;
   }
}
