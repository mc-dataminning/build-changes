import java.util.List;
import java.util.Map;

public class aka {
   private final String a;
   private final String b;

   public aka(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aka a(String $$0) {
      return new aka($$0, ".json");
   }

   public akh a(akh $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public akh b(akh $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<akh, atp> a(atr $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<akh, List<atp>> b(atr $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
