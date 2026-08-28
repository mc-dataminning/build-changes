import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dof extends dgn implements doe {
   public static final MapCodec<dof> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doe.a.e.fieldOf("weathering_state").forGetter(dof::m), u()).apply($$0, dof::new)
   );
   private final doe.a e;

   @Override
   protected MapCodec<dof> a() {
      return d;
   }

   public dof(doe.a $$0, dsb.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsc $$0) {
      return doe.c($$0.b()).isPresent();
   }

   public doe.a m() {
      return this.e;
   }
}
