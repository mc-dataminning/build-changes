import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dof extends dhe implements dod {
   public static final MapCodec<dof> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsq.a.fieldOf("block_set_type").forGetter(dhe::b), dod.a.e.fieldOf("weathering_state").forGetter(dof::m), u()).apply($$0, dof::new)
   );
   private final dod.a m;

   @Override
   public MapCodec<dof> a() {
      return l;
   }

   protected dof(dsq $$0, dod.a $$1, dsa.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(dhe.f) == dsx.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsb $$0) {
      return dod.c($$0.b()).isPresent();
   }

   public dod.a m() {
      return this.m;
   }
}
