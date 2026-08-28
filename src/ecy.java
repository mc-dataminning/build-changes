import com.mojang.serialization.Codec;

public class ecy implements edd {
   public static final Codec<ecy> a = bqa.b(0, 256).fieldOf("count").xmap(ecy::new, ecy::a).codec();
   private final bqa b;

   public ecy(int $$0) {
      this.b = bpx.a($$0);
   }

   public ecy(bqa $$0) {
      this.b = $$0;
   }

   public bqa a() {
      return this.b;
   }
}
