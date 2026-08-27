import java.util.List;
import java.util.Map;

public class air {
   private final String a;
   private final String b;

   public air(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static air a(String $$0) {
      return new air($$0, ".json");
   }

   public aiy a(aiy $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public aiy b(aiy $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<aiy, arz> a(asb $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<aiy, List<arz>> b(asb $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
