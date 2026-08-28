import java.util.List;
import java.util.Map;

public class ako {
   private final String a;
   private final String b;

   public ako(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static ako a(String $$0) {
      return new ako($$0, ".json");
   }

   public static ako a(aku<? extends ke<?>> $$0) {
      return a(mc.c($$0));
   }

   public akv a(akv $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public akv b(akv $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<akv, aun> a(aup $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<akv, List<aun>> b(aup $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
