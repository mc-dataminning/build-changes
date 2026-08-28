import java.util.List;
import java.util.Map;

public class akv {
   private final String a;
   private final String b;

   public akv(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static akv a(String $$0) {
      return new akv($$0, ".json");
   }

   public alc a(alc $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public alc b(alc $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<alc, aur> a(aut $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<alc, List<aur>> b(aut $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
