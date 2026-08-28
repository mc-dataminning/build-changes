import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqh extends doq implements dqb {
   public static final MapCodec<dqh> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqb.a.e.fieldOf("weathering_state").forGetter(dhw::c), dua.a.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dqh::new)
   );
   private final dqb.a J;

   @Override
   public MapCodec<dqh> a() {
      return I;
   }

   public dqh(dqb.a $$0, dua $$1, dtz.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dua $$0) {
      return dqb.c($$0.b()).isPresent();
   }

   public dqb.a m() {
      return this.J;
   }
}
