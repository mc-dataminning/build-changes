import com.mojang.serialization.Codec;

public class dwu extends dwv {
   public static final dwu a = new dwu(dos.a(0));
   public static final Codec<dwu> b = atg.e(dos.a, dos.a.fieldOf("value").codec()).xmap(dwu::new, dwu::b);
   private final dos d;

   public static dwu a(dos $$0) {
      return new dwu($$0);
   }

   private dwu(dos $$0) {
      this.d = $$0;
   }

   public dos b() {
      return this.d;
   }

   @Override
   public int a(auf $$0, dov $$1) {
      return this.d.a($$1);
   }

   @Override
   public dww<?> a() {
      return dww.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
