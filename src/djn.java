import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djn extends dio implements djg {
   public static final MapCodec<djn> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnq.a.fieldOf("block_set_type").forGetter(dio::i), djg.a.e.fieldOf("weathering_state").forGetter(djn::s), u()).apply($$0, djn::new)
   );
   private final djg.a n;

   @Override
   public MapCodec<djn> a() {
      return m;
   }

   protected djn(dnq $$0, djg.a $$1, dna.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dnb $$0) {
      return djg.c($$0.b()).isPresent();
   }

   public djg.a s() {
      return this.n;
   }
}
