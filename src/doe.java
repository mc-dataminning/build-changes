import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doe extends dhd implements doc {
   public static final MapCodec<doe> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsp.a.fieldOf("block_set_type").forGetter(dhd::b), doc.a.e.fieldOf("weathering_state").forGetter(doe::m), u()).apply($$0, doe::new)
   );
   private final doc.a m;

   @Override
   public MapCodec<doe> a() {
      return l;
   }

   protected doe(dsp $$0, doc.a $$1, drz.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$0.c(dhd.f) == dsw.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsa $$0) {
      return doc.c($$0.b()).isPresent();
   }

   public doc.a m() {
      return this.m;
   }
}
