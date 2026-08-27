import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dil extends dbl implements dij {
   public static final MapCodec<dil> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmt.a.fieldOf("block_set_type").forGetter(dbl::b), dij.a.e.fieldOf("weathering_state").forGetter(dil::i), u()).apply($$0, dil::new)
   );
   private final dij.a m;

   @Override
   public MapCodec<dil> a() {
      return l;
   }

   protected dil(dmt $$0, dij.a $$1, dmd.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(dbl.f) == dna.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dme $$0) {
      return dij.c($$0.b()).isPresent();
   }

   public dij.a i() {
      return this.m;
   }
}
