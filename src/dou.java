import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dou extends dnv implements don {
   public static final MapCodec<dou> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dta.a.fieldOf("block_set_type").forGetter(dnv::m), don.a.e.fieldOf("weathering_state").forGetter(dou::n), u()).apply($$0, dou::new)
   );
   private final don.a n;

   @Override
   public MapCodec<dou> a() {
      return m;
   }

   protected dou(dta $$0, don.a $$1, dsk.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsl $$0) {
      return don.c($$0.b()).isPresent();
   }

   public don.a n() {
      return this.n;
   }
}
