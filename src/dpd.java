import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpd extends dmt implements doy {
   public static final MapCodec<dpd> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doy.a.e.fieldOf("weathering_state").forGetter(dgd::c), u()).apply($$0, dpd::new)
   );
   private final doy.a g;

   @Override
   public MapCodec<dpd> a() {
      return f;
   }

   public dpd(doy.a $$0, dtb.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return doy.c($$0.b()).isPresent();
   }

   public doy.a k() {
      return this.g;
   }
}
