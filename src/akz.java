import java.util.List;
import java.util.Map;

public class akz {
   private final String a;
   private final String b;

   public akz(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static akz a(String $$0) {
      return new akz($$0, ".json");
   }

   public static akz a(alf<? extends js<?>> $$0) {
      return a(mh.c($$0));
   }

   public alg a(alg $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public alg b(alg $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<alg, avb> a(avd $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<alg, List<avb>> b(avd $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
