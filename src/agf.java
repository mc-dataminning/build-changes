import java.util.List;
import java.util.Map;

public class agf {
   private final String a;
   private final String b;

   public agf(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static agf a(String $$0) {
      return new agf($$0, ".json");
   }

   public agm a(agm $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public agm b(agm $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<agm, apj> a(apl $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<agm, List<apj>> b(apl $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
