import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddc extends dbs implements dcz {
   public static final MapCodec<ddc> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcz.a.e.fieldOf("weathering_state").forGetter(cvb::c), dgb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), t()).apply($$0, ddc::new)
   );
   private final dcz.a J;

   @Override
   public MapCodec<ddc> a() {
      return I;
   }

   public ddc(dcz.a $$0, dgb $$1, dga.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dgb $$0) {
      return dcz.c($$0.b()).isPresent();
   }

   public dcz.a g() {
      return this.J;
   }
}
