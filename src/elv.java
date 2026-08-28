import com.mojang.serialization.MapCodec;

public class elv extends emk {
   public static final MapCodec<elv> a = dsh.b.fieldOf("block_state").xmap(elv::new, $$0 -> $$0.b);
   private final dsh b;

   public elv(dsh $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsh $$0, aym $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eml<?> a() {
      return eml.c;
   }
}
