import com.mojang.serialization.Codec;

public class eit implements eiy {
   public static final Codec<eit> a = bsd.b(0, 256).fieldOf("count").xmap(eit::new, eit::a).codec();
   private final bsd b;

   public eit(int $$0) {
      this.b = bsa.a($$0);
   }

   public eit(bsd $$0) {
      this.b = $$0;
   }

   public bsd a() {
      return this.b;
   }
}
