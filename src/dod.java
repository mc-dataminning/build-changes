import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dod extends dny implements dnz {
   public static final MapCodec<dod> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnz.a.e.fieldOf("weathering_state").forGetter(dod::m), u()).apply($$0, dod::new)
   );
   private final dnz.a f;

   @Override
   protected MapCodec<dod> a() {
      return e;
   }

   protected dod(dnz.a $$0, drw.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drx $$0) {
      return dnz.c($$0.b()).isPresent();
   }

   public dnz.a m() {
      return this.f;
   }
}
