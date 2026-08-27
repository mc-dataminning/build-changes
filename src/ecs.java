import com.mojang.serialization.Codec;

public class ecs extends ecj {
   public static final Codec<ecs> b = dpi.b.fieldOf("state").xmap(ecs::new, $$0 -> $$0.c).codec();
   private final dpi c;

   protected ecs(dpi $$0) {
      this.c = $$0;
   }

   @Override
   protected eck<?> a() {
      return eck.a;
   }

   @Override
   public dpi a(axt $$0, id $$1) {
      return this.c;
   }
}
