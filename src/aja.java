import java.util.List;
import java.util.Map;

public class aja {
   private final String a;
   private final String b;

   public aja(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aja a(String $$0) {
      return new aja($$0, ".json");
   }

   public ajh a(ajh $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public ajh b(ajh $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ajh, asm> a(aso $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ajh, List<asm>> b(aso $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
