import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddw extends dcm implements ddt {
   public static final MapCodec<ddw> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddt.a.e.fieldOf("weathering_state").forGetter(cvu::c), dgw.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), t()).apply($$0, ddw::new)
   );
   private final ddt.a J;

   @Override
   public MapCodec<ddw> a() {
      return I;
   }

   public ddw(ddt.a $$0, dgw $$1, dgv.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dgw $$0) {
      return ddt.c($$0.b()).isPresent();
   }

   public ddt.a g() {
      return this.J;
   }
}
