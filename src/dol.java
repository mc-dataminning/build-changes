import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dol extends dmu implements dof {
   public static final MapCodec<dol> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dof.a.e.fieldOf("weathering_state").forGetter(dgb::c), dsd.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dol::new)
   );
   private final dof.a J;

   @Override
   public MapCodec<dol> a() {
      return I;
   }

   public dol(dof.a $$0, dsd $$1, dsc.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsd $$0) {
      return dof.c($$0.b()).isPresent();
   }

   public dof.a m() {
      return this.J;
   }
}
