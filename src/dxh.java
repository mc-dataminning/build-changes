import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxh extends dwg implements dxa {
   public static final MapCodec<dxh> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.a.fieldOf("block_set_type").forGetter(dwg::q), dxa.a.e.fieldOf("weathering_state").forGetter(dxh::r), t()).apply($$0, dxh::new)
   );
   private final dxa.a h;

   @Override
   public MapCodec<dxh> a() {
      return g;
   }

   protected dxh(ebv $$0, dxa.a $$1, ebf.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebg $$0) {
      return dxa.c($$0.b()).isPresent();
   }

   public dxa.a r() {
      return this.h;
   }
}
