import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpg extends die implements dpe {
   public static final MapCodec<dpg> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter(die::b), dpe.a.e.fieldOf("weathering_state").forGetter(dpg::m), u()).apply($$0, dpg::new)
   );
   private final dpe.a m;

   @Override
   public MapCodec<dpg> a() {
      return l;
   }

   protected dpg(dtr $$0, dpe.a $$1, dtb.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$0.c(die.f) == dty.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dtc $$0) {
      return dpe.c($$0.b()).isPresent();
   }

   public dpe.a m() {
      return this.m;
   }
}
