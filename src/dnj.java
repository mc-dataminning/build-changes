import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnj extends dls implements dnd {
   public static final MapCodec<dnj> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnd.a.e.fieldOf("weathering_state").forGetter(dez::c), drb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dnj::new)
   );
   private final dnd.a J;

   @Override
   public MapCodec<dnj> a() {
      return I;
   }

   public dnj(dnd.a $$0, drb $$1, dra.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drb $$0) {
      return dnd.c($$0.b()).isPresent();
   }

   public dnd.a l() {
      return this.J;
   }
}
