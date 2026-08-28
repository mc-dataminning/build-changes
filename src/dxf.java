import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxf extends dur implements dxa {
   public static final MapCodec<dxf> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxa.a.e.fieldOf("weathering_state").forGetter(doh::c), t()).apply($$0, dxf::new)
   );
   private final dxa.a e;

   @Override
   public MapCodec<dxf> a() {
      return d;
   }

   public dxf(dxa.a $$0, ebf.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
