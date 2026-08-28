import java.util.List;
import java.util.Map;

public class ala {
   private final String a;
   private final String b;

   public ala(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static ala a(String $$0) {
      return new ala($$0, ".json");
   }

   public alh a(alh $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public alh b(alh $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<alh, auy> a(ava $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<alh, List<auy>> b(ava $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
