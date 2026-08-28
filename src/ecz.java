import com.mojang.serialization.Codec;

public class ecz implements ede {
   public static final Codec<ecz> a = bqb.b(0, 256).fieldOf("count").xmap(ecz::new, ecz::a).codec();
   private final bqb b;

   public ecz(int $$0) {
      this.b = bpy.a($$0);
   }

   public ecz(bqb $$0) {
      this.b = $$0;
   }

   public bqb a() {
      return this.b;
   }
}
