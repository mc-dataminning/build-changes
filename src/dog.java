import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dog extends dhf implements doe {
   public static final MapCodec<dog> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsr.a.fieldOf("block_set_type").forGetter(dhf::b), doe.a.e.fieldOf("weathering_state").forGetter(dog::m), u()).apply($$0, dog::new)
   );
   private final doe.a m;

   @Override
   public MapCodec<dog> a() {
      return l;
   }

   protected dog(dsr $$0, doe.a $$1, dsb.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(dhf.f) == dsy.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsc $$0) {
      return doe.c($$0.b()).isPresent();
   }

   public doe.a m() {
      return this.m;
   }
}
