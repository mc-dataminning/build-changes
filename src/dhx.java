import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhx extends dgh implements dhr {
   public static final MapCodec<dhx> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhr.a.e.fieldOf("weathering_state").forGetter(czp::c), dlf.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dhx::new)
   );
   private final dhr.a J;

   @Override
   public MapCodec<dhx> a() {
      return I;
   }

   public dhx(dhr.a $$0, dlf $$1, dle.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dlf $$0) {
      return dhr.c($$0.b()).isPresent();
   }

   public dhr.a g() {
      return this.J;
   }
}
