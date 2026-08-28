import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dor extends dns implements dok {
   public static final MapCodec<dor> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.fieldOf("block_set_type").forGetter(dns::m), dok.a.e.fieldOf("weathering_state").forGetter(dor::n), u()).apply($$0, dor::new)
   );
   private final dok.a n;

   @Override
   public MapCodec<dor> a() {
      return m;
   }

   protected dor(dsw $$0, dok.a $$1, dsg.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsh $$0) {
      return dok.c($$0.b()).isPresent();
   }

   public dok.a n() {
      return this.n;
   }
}
