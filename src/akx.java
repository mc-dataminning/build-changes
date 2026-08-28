import java.util.List;
import java.util.Map;

public class akx {
   private final String a;
   private final String b;

   public akx(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static akx a(String $$0) {
      return new akx($$0, ".json");
   }

   public ale a(ale $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public ale b(ale $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ale, aum> a(auo $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ale, List<aum>> b(auo $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
