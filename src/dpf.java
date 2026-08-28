import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpf extends dhm implements dpe {
   public static final MapCodec<dpf> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpe.a.e.fieldOf("weathering_state").forGetter(dpf::m), u()).apply($$0, dpf::new)
   );
   private final dpe.a e;

   @Override
   protected MapCodec<dpf> a() {
      return d;
   }

   public dpf(dpe.a $$0, dtb.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
