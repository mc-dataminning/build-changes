import java.util.List;
import java.util.Map;

public class ale {
   private final String a;
   private final String b;

   public ale(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static ale a(String $$0) {
      return new ale($$0, ".json");
   }

   public all a(all $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public all b(all $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<all, avc> a(ave $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<all, List<avc>> b(ave $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
