import com.mojang.serialization.MapCodec;

public class een extends eee {
   public static final MapCodec<een> b = drd.b.fieldOf("state").xmap(een::new, $$0 -> $$0.c);
   private final drd c;

   protected een(drd $$0) {
      this.c = $$0;
   }

   @Override
   protected eef<?> a() {
      return eef.a;
   }

   @Override
   public drd a(aym $$0, io $$1) {
      return this.c;
   }
}
