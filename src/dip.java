import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dip extends dgy implements dij {
   public static final MapCodec<dip> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dij.a.e.fieldOf("weathering_state").forGetter(dag::c), dme.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dip::new)
   );
   private final dij.a J;

   @Override
   public MapCodec<dip> a() {
      return I;
   }

   public dip(dij.a $$0, dme $$1, dmd.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dme $$0) {
      return dij.c($$0.b()).isPresent();
   }

   public dij.a i() {
      return this.J;
   }
}
