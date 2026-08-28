import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dok extends dmd implements dof {
   public static final MapCodec<dok> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dof.a.e.fieldOf("weathering_state").forGetter(dgb::c), u()).apply($$0, dok::new)
   );
   private final dof.a g;

   @Override
   public MapCodec<dok> a() {
      return f;
   }

   public dok(dof.a $$0, dsc.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
