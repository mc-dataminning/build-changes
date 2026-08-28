import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtw extends dsx implements dtp {
   public static final MapCodec<dtw> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyf.a.fieldOf("block_set_type").forGetter(dsx::q), dtp.a.e.fieldOf("weathering_state").forGetter(dtw::r), t()).apply($$0, dtw::new)
   );
   private final dtp.a h;

   @Override
   public MapCodec<dtw> a() {
      return g;
   }

   protected dtw(dyf $$0, dtp.a $$1, dxp.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxq $$0) {
      return dtp.c($$0.b()).isPresent();
   }

   public dtp.a r() {
      return this.h;
   }
}
