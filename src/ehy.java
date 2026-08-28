import com.mojang.serialization.Codec;

public class ehy implements eid {
   public static final Codec<ehy> a = brq.b(0, 256).fieldOf("count").xmap(ehy::new, ehy::a).codec();
   private final brq b;

   public ehy(int $$0) {
      this.b = brn.a($$0);
   }

   public ehy(brq $$0) {
      this.b = $$0;
   }

   public brq a() {
      return this.b;
   }
}
