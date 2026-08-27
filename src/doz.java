import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doz extends dgq implements doy {
   public static final MapCodec<doz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doy.a.e.fieldOf("weathering_state").forGetter(doz::k), u()).apply($$0, doz::new)
   );
   private final doy.a e;

   @Override
   protected MapCodec<doz> a() {
      return d;
   }

   public doz(doy.a $$0, dtb.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
