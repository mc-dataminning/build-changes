import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpk extends dnt implements dpe {
   public static final MapCodec<dpk> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpe.a.e.fieldOf("weathering_state").forGetter(dgz::c), dtc.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dpk::new)
   );
   private final dpe.a J;

   @Override
   public MapCodec<dpk> a() {
      return I;
   }

   public dpk(dpe.a $$0, dtc $$1, dtb.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return dpe.c($$0.b()).isPresent();
   }

   public dpe.a m() {
      return this.J;
   }
}
