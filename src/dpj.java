import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpj extends dnc implements dpe {
   public static final MapCodec<dpj> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpe.a.e.fieldOf("weathering_state").forGetter(dgz::c), u()).apply($$0, dpj::new)
   );
   private final dpe.a g;

   @Override
   public MapCodec<dpj> a() {
      return f;
   }

   public dpj(dpe.a $$0, dtb.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
