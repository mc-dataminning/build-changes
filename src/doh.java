import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh extends dma implements doc {
   public static final MapCodec<doh> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doc.a.e.fieldOf("weathering_state").forGetter(dfy::c), u()).apply($$0, doh::new)
   );
   private final doc.a g;

   @Override
   public MapCodec<doh> a() {
      return f;
   }

   public doh(doc.a $$0, drz.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsa $$0) {
      return doc.c($$0.b()).isPresent();
   }

   public doc.a m() {
      return this.g;
   }
}
