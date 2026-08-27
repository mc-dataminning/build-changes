import java.util.List;
import java.util.Map;

public class agw {
   private final String a;
   private final String b;

   public agw(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static agw a(String $$0) {
      return new agw($$0, ".json");
   }

   public ahd a(ahd $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public ahd b(ahd $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ahd, aqa> a(aqc $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ahd, List<aqa>> b(aqc $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
