import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djh extends dbq implements djg {
   public static final MapCodec<djh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djg.a.e.fieldOf("weathering_state").forGetter(djh::i), u()).apply($$0, djh::new)
   );
   private final djg.a e;

   @Override
   protected MapCodec<djh> a() {
      return d;
   }

   public djh(djg.a $$0, dna.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dnb $$0) {
      return djg.c($$0.b()).isPresent();
   }

   public djg.a i() {
      return this.e;
   }
}
