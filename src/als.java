import java.util.List;
import java.util.Map;

public class als {
   private final String a;
   private final String b;

   public als(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static als a(String $$0) {
      return new als($$0, ".json");
   }

   public alz a(alz $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public alz b(alz $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<alz, avt> a(avv $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<alz, List<avt>> b(avv $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
