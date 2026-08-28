import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dot extends dnu implements dom {
   public static final MapCodec<dot> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsz.a.fieldOf("block_set_type").forGetter(dnu::m), dom.a.e.fieldOf("weathering_state").forGetter(dot::n), u()).apply($$0, dot::new)
   );
   private final dom.a n;

   @Override
   public MapCodec<dot> a() {
      return m;
   }

   protected dot(dsz $$0, dom.a $$1, dsj.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsk $$0) {
      return dom.c($$0.b()).isPresent();
   }

   public dom.a n() {
      return this.n;
   }
}
