import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doj extends dnk implements doc {
   public static final MapCodec<doj> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsp.a.fieldOf("block_set_type").forGetter(dnk::m), doc.a.e.fieldOf("weathering_state").forGetter(doj::n), u()).apply($$0, doj::new)
   );
   private final doc.a n;

   @Override
   public MapCodec<doj> a() {
      return m;
   }

   protected doj(dsp $$0, doc.a $$1, drz.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsa $$0) {
      return doc.c($$0.b()).isPresent();
   }

   public doc.a n() {
      return this.n;
   }
}
