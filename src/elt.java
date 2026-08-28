import com.mojang.serialization.MapCodec;

public class elt extends emk {
   public static final MapCodec<elt> a = lq.e.r().fieldOf("block").xmap(elt::new, $$0 -> $$0.b);
   private final dff b;

   public elt(dff $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsh $$0, aym $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eml<?> a() {
      return eml.b;
   }
}
