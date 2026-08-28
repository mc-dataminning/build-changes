import com.mojang.serialization.MapCodec;

public class elp extends eme {
   public static final MapCodec<elp> a = dsc.b.fieldOf("block_state").xmap(elp::new, $$0 -> $$0.b);
   private final dsc b;

   public elp(dsc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsc $$0, azh $$1) {
      return $$0 == this.b;
   }

   @Override
   protected emf<?> a() {
      return emf.c;
   }
}
