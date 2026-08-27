import com.mojang.serialization.Codec;

public class dvy implements dwd {
   public static final Codec<dvy> a = blb.b(0, 256).fieldOf("count").xmap(dvy::new, dvy::a).codec();
   private final blb b;

   public dvy(int $$0) {
      this.b = bky.a($$0);
   }

   public dvy(blb $$0) {
      this.b = $$0;
   }

   public blb a() {
      return this.b;
   }
}
