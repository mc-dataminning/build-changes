import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djk extends djf implements djg {
   public static final MapCodec<djk> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djg.a.e.fieldOf("weathering_state").forGetter(djk::i), u()).apply($$0, djk::new)
   );
   private final djg.a f;

   @Override
   protected MapCodec<djk> a() {
      return e;
   }

   protected djk(djg.a $$0, dna.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
