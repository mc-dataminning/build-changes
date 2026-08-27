import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dls extends dkt implements dll {
   public static final MapCodec<dls> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpx.a.fieldOf("block_set_type").forGetter(dkt::k), dll.a.e.fieldOf("weathering_state").forGetter(dls::s), u()).apply($$0, dls::new)
   );
   private final dll.a n;

   @Override
   public MapCodec<dls> a() {
      return m;
   }

   protected dls(dpx $$0, dll.a $$1, dph.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dpi $$0) {
      return dll.c($$0.b()).isPresent();
   }

   public dll.a s() {
      return this.n;
   }
}
