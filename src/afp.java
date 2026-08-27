import java.util.List;
import java.util.Map;

public class afp {
   private final String a;
   private final String b;

   public afp(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static afp a(String $$0) {
      return new afp($$0, ".json");
   }

   public afw a(afw $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public afw b(afw $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<afw, aor> a(aot $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<afw, List<aor>> b(aot $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
