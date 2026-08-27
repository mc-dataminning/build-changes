import java.util.List;
import java.util.Map;

public class akg {
   private final String a;
   private final String b;

   public akg(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static akg a(String $$0) {
      return new akg($$0, ".json");
   }

   public akn a(akn $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public akn b(akn $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<akn, atv> a(atx $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<akn, List<atv>> b(atx $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
