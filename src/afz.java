import java.util.List;
import java.util.Map;

public class afz {
   private final String a;
   private final String b;

   public afz(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static afz a(String $$0) {
      return new afz($$0, ".json");
   }

   public agg a(agg $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public agg b(agg $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<agg, apb> a(apd $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<agg, List<apb>> b(apd $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
