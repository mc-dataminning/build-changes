import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dph extends dfy implements dpe {
   public static final MapCodec<dph> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpe.a.e.fieldOf("weathering_state").forGetter(dgz::c), u()).apply($$0, dph::new)
   );
   private final dpe.a e;

   @Override
   public MapCodec<dph> a() {
      return d;
   }

   public dph(dpe.a $$0, dtb.d $$1) {
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
