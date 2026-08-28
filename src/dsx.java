import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsx extends dls implements dsv {
   public static final MapCodec<dsx> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxl.a.fieldOf("block_set_type").forGetter(dls::b), dsv.a.e.fieldOf("weathering_state").forGetter(dsx::q), t()).apply($$0, dsx::new)
   );
   private final dsv.a m;

   @Override
   public MapCodec<dsx> a() {
      return l;
   }

   protected dsx(dxl $$0, dsv.a $$1, dwv.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(dls.f) == dxr.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dww $$0) {
      return dsv.c($$0.b()).isPresent();
   }

   public dsv.a q() {
      return this.m;
   }
}
