import java.util.List;
import java.util.Map;

public class aes {
   private final String a;
   private final String b;

   public aes(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aes a(String $$0) {
      return new aes($$0, ".json");
   }

   public aez a(aez $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public aez b(aez $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<aez, anu> a(anw $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<aez, List<anu>> b(anw $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
