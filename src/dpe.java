import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpe extends dnk implements doy {
   public static final MapCodec<dpe> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doy.a.e.fieldOf("weathering_state").forGetter(dgd::c), dtc.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dpe::new)
   );
   private final doy.a J;

   @Override
   public MapCodec<dpe> a() {
      return I;
   }

   public dpe(doy.a $$0, dtc $$1, dtb.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
