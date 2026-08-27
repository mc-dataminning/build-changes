import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnl extends dlu implements dnf {
   public static final MapCodec<dnl> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnf.a.e.fieldOf("weathering_state").forGetter(dfb::c), drd.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dnl::new)
   );
   private final dnf.a J;

   @Override
   public MapCodec<dnl> a() {
      return I;
   }

   public dnl(dnf.a $$0, drd $$1, drc.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drd $$0) {
      return dnf.c($$0.b()).isPresent();
   }

   public dnf.a m() {
      return this.J;
   }
}
