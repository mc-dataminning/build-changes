import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dol extends dnm implements doe {
   public static final MapCodec<dol> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsr.a.fieldOf("block_set_type").forGetter(dnm::m), doe.a.e.fieldOf("weathering_state").forGetter(dol::n), u()).apply($$0, dol::new)
   );
   private final doe.a n;

   @Override
   public MapCodec<dol> a() {
      return m;
   }

   protected dol(dsr $$0, doe.a $$1, dsb.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsc $$0) {
      return doe.c($$0.b()).isPresent();
   }

   public doe.a n() {
      return this.n;
   }
}
