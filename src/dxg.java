import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxg extends dvi implements dxa {
   public static final MapCodec<dxg> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxa.a.e.fieldOf("weathering_state").forGetter(doh::c), ebg.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dxg::new)
   );
   private final dxa.a h;

   @Override
   public MapCodec<dxg> a() {
      return g;
   }

   public dxg(dxa.a $$0, ebg $$1, ebf.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebg $$0) {
      return dxa.c($$0.b()).isPresent();
   }

   public dxa.a q() {
      return this.h;
   }
}
