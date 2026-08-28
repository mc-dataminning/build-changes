import com.mojang.serialization.Codec;

public class eiu implements eiz {
   public static final Codec<eiu> a = bsn.b(0, 256).fieldOf("count").xmap(eiu::new, eiu::a).codec();
   private final bsn b;

   public eiu(int $$0) {
      this.b = bsk.a($$0);
   }

   public eiu(bsn $$0) {
      this.b = $$0;
   }

   public bsn a() {
      return this.b;
   }
}
