import java.util.List;
import java.util.Map;

public class agz {
   private final String a;
   private final String b;

   public agz(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static agz a(String $$0) {
      return new agz($$0, ".json");
   }

   public ahg a(ahg $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public ahg b(ahg $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ahg, aqf> a(aqh $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ahg, List<aqf>> b(aqh $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
