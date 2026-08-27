import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dji extends dci implements djg {
   public static final MapCodec<dji> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnq.a.fieldOf("block_set_type").forGetter(dci::b), djg.a.e.fieldOf("weathering_state").forGetter(dji::i), u()).apply($$0, dji::new)
   );
   private final djg.a m;

   @Override
   public MapCodec<dji> a() {
      return l;
   }

   protected dji(dnq $$0, djg.a $$1, dna.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(dci.f) == dnx.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dnb $$0) {
      return djg.c($$0.b()).isPresent();
   }

   public djg.a i() {
      return this.m;
   }
}
