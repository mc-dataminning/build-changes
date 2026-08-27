import com.mojang.serialization.Codec;

public class dzu implements dzz {
   public static final Codec<dzu> a = bnf.b(0, 256).fieldOf("count").xmap(dzu::new, dzu::a).codec();
   private final bnf b;

   public dzu(int $$0) {
      this.b = bnc.a($$0);
   }

   public dzu(bnf $$0) {
      this.b = $$0;
   }

   public bnf a() {
      return this.b;
   }
}
