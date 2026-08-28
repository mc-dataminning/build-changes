import com.mojang.serialization.MapCodec;

public class eli extends ekz {
   public static final MapCodec<eli> b = dxq.a.fieldOf("state").xmap(eli::new, $$0 -> $$0.c);
   private final dxq c;

   protected eli(dxq $$0) {
      this.c = $$0;
   }

   @Override
   protected ela<?> a() {
      return ela.a;
   }

   @Override
   public dxq a(azh $$0, ji $$1) {
      return this.c;
   }
}
