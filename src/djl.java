import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djl extends dhe implements djg {
   public static final MapCodec<djl> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djg.a.e.fieldOf("weathering_state").forGetter(dbd::c), u()).apply($$0, djl::new)
   );
   private final djg.a g;

   @Override
   public MapCodec<djl> a() {
      return f;
   }

   public djl(djg.a $$0, dna.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
