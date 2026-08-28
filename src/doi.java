import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doi extends dod implements doe {
   public static final MapCodec<doi> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doe.a.e.fieldOf("weathering_state").forGetter(doi::m), u()).apply($$0, doi::new)
   );
   private final doe.a f;

   @Override
   protected MapCodec<doi> a() {
      return e;
   }

   protected doi(doe.a $$0, dsb.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsc $$0) {
      return doe.c($$0.b()).isPresent();
   }

   public doe.a m() {
      return this.f;
   }
}
