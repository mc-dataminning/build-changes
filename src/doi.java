import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doi extends dfa implements dof {
   public static final MapCodec<doi> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dof.a.e.fieldOf("weathering_state").forGetter(dgb::c), u()).apply($$0, doi::new)
   );
   private final dof.a e;

   @Override
   public MapCodec<doi> a() {
      return d;
   }

   public doi(dof.a $$0, dsc.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
