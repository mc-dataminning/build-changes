import java.util.List;
import java.util.Map;

public class acj {
   private final String a;
   private final String b;

   public acj(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static acj a(String $$0) {
      return new acj($$0, ".json");
   }

   public acq a(acq $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public acq b(acq $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<acq, akv> a(akx $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<acq, List<akv>> b(akx $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
