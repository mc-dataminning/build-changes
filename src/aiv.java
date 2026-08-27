import java.util.List;
import java.util.Map;

public class aiv {
   private final String a;
   private final String b;

   public aiv(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aiv a(String $$0) {
      return new aiv($$0, ".json");
   }

   public ajc a(ajc $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public ajc b(ajc $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ajc, asd> a(asf $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ajc, List<asd>> b(asf $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
