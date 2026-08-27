import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djm extends dhv implements djg {
   public static final MapCodec<djm> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djg.a.e.fieldOf("weathering_state").forGetter(dbd::c), dnb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, djm::new)
   );
   private final djg.a J;

   @Override
   public MapCodec<djm> a() {
      return I;
   }

   public djm(djg.a $$0, dnb $$1, dna.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dnb $$0) {
      return djg.c($$0.b()).isPresent();
   }

   public djg.a i() {
      return this.J;
   }
}
