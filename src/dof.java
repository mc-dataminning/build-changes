import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dof extends dmo implements dnz {
   public static final MapCodec<dof> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnz.a.e.fieldOf("weathering_state").forGetter(dfv::c), drx.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dof::new)
   );
   private final dnz.a J;

   @Override
   public MapCodec<dof> a() {
      return I;
   }

   public dof(dnz.a $$0, drx $$1, drw.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
