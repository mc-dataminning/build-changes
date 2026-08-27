import com.mojang.serialization.Codec;

public class eem extends een {
   public static final eem a = new eem(dwk.a(0));
   public static final Codec<eem> b = axe.e(dwk.a, dwk.a.fieldOf("value").codec()).xmap(eem::new, eem::b);
   private final dwk d;

   public static eem a(dwk $$0) {
      return new eem($$0);
   }

   private eem(dwk $$0) {
      this.d = $$0;
   }

   public dwk b() {
      return this.d;
   }

   @Override
   public int a(ayd $$0, dwn $$1) {
      return this.d.a($$1);
   }

   @Override
   public eeo<?> a() {
      return eeo.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
