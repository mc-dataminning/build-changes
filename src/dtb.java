import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtb extends dsc implements dsu {
   public static final MapCodec<dtb> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.fieldOf("block_set_type").forGetter(dsc::q), dsu.a.e.fieldOf("weathering_state").forGetter(dtb::r), t()).apply($$0, dtb::new)
   );
   private final dsu.a n;

   @Override
   public MapCodec<dtb> a() {
      return m;
   }

   protected dtb(dxk $$0, dsu.a $$1, dwu.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwv $$0) {
      return dsu.c($$0.b()).isPresent();
   }

   public dsu.a r() {
      return this.n;
   }
}
