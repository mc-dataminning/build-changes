import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpf extends doe implements doy {
   public static final MapCodec<dpf> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter(doe::k), doy.a.e.fieldOf("weathering_state").forGetter(dpf::s), u()).apply($$0, dpf::new)
   );
   private final doy.a n;

   @Override
   public MapCodec<dpf> a() {
      return m;
   }

   protected dpf(dtr $$0, doy.a $$1, dtb.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return doy.c($$0.b()).isPresent();
   }

   public doy.a s() {
      return this.n;
   }
}
