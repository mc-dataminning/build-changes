import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpa extends dhj implements doy {
   public static final MapCodec<dpa> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter(dhj::b), doy.a.e.fieldOf("weathering_state").forGetter(dpa::k), u()).apply($$0, dpa::new)
   );
   private final doy.a m;

   @Override
   public MapCodec<dpa> a() {
      return l;
   }

   protected dpa(dtr $$0, doy.a $$1, dtb.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(dhj.f) == dty.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dtc $$0) {
      return doy.c($$0.b()).isPresent();
   }

   public doy.a k() {
      return this.m;
   }
}
