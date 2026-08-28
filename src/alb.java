import java.util.List;
import java.util.Map;

public class alb {
   private final String a;
   private final String b;

   public alb(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static alb a(String $$0) {
      return new alb($$0, ".json");
   }

   public static alb a(alh<? extends js<?>> $$0) {
      return a(mh.c($$0));
   }

   public ali a(ali $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public ali b(ali $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ali, avd> a(avf $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ali, List<avd>> b(avf $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
