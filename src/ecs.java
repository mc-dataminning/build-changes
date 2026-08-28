import com.mojang.serialization.Codec;

public class ecs implements ecx {
   public static final Codec<ecs> a = bpu.b(0, 256).fieldOf("count").xmap(ecs::new, ecs::a).codec();
   private final bpu b;

   public ecs(int $$0) {
      this.b = bpr.a($$0);
   }

   public ecs(bpu $$0) {
      this.b = $$0;
   }

   public bpu a() {
      return this.b;
   }
}
