import com.mojang.serialization.Codec;

public class ege implements egj {
   public static final Codec<ege> a = brd.b(0, 256).fieldOf("count").xmap(ege::new, ege::a).codec();
   private final brd b;

   public ege(int $$0) {
      this.b = bra.a($$0);
   }

   public ege(brd $$0) {
      this.b = $$0;
   }

   public brd a() {
      return this.b;
   }
}
