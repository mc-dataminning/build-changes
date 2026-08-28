import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dok extends dmt implements doe {
   public static final MapCodec<dok> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doe.a.e.fieldOf("weathering_state").forGetter(dga::c), dsc.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dok::new)
   );
   private final doe.a J;

   @Override
   public MapCodec<dok> a() {
      return I;
   }

   public dok(doe.a $$0, dsc $$1, dsb.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsc $$0) {
      return doe.c($$0.b()).isPresent();
   }

   public doe.a m() {
      return this.J;
   }
}
