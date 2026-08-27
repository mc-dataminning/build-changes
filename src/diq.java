import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diq extends dhr implements dij {
   public static final MapCodec<diq> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmt.a.fieldOf("block_set_type").forGetter(dhr::i), dij.a.e.fieldOf("weathering_state").forGetter(diq::s), u()).apply($$0, diq::new)
   );
   private final dij.a n;

   @Override
   public MapCodec<diq> a() {
      return m;
   }

   protected diq(dmt $$0, dij.a $$1, dmd.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dme $$0) {
      return dij.c($$0.b()).isPresent();
   }

   public dij.a s() {
      return this.n;
   }
}
