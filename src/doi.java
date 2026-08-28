import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doi extends dhh implements dog {
   public static final MapCodec<doi> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dst.a.fieldOf("block_set_type").forGetter(dhh::b), dog.a.e.fieldOf("weathering_state").forGetter(doi::m), u()).apply($$0, doi::new)
   );
   private final dog.a m;

   @Override
   public MapCodec<doi> a() {
      return l;
   }

   protected doi(dst $$0, dog.a $$1, dsd.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(dhh.f) == dta.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dse $$0) {
      return dog.c($$0.b()).isPresent();
   }

   public dog.a m() {
      return this.m;
   }
}
