import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh extends dhg implements dof {
   public static final MapCodec<doh> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dss.a.fieldOf("block_set_type").forGetter(dhg::b), dof.a.e.fieldOf("weathering_state").forGetter(doh::m), u()).apply($$0, doh::new)
   );
   private final dof.a m;

   @Override
   public MapCodec<doh> a() {
      return l;
   }

   protected doh(dss $$0, dof.a $$1, dsc.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(dhg.f) == dsz.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsd $$0) {
      return dof.c($$0.b()).isPresent();
   }

   public dof.a m() {
      return this.m;
   }
}
