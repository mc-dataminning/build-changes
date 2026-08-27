import java.util.List;
import java.util.Map;

public class agb {
   private final String a;
   private final String b;

   public agb(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static agb a(String $$0) {
      return new agb($$0, ".json");
   }

   public agi a(agi $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public agi b(agi $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<agi, apf> a(aph $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<agi, List<apf>> b(aph $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
