import java.util.List;
import java.util.Map;

public class akw {
   private final String a;
   private final String b;

   public akw(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static akw a(String $$0) {
      return new akw($$0, ".json");
   }

   public static akw a(alc<? extends kf<?>> $$0) {
      return a(me.c($$0));
   }

   public ald a(ald $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public ald b(ald $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ald, auy> a(ava $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ald, List<auy>> b(ava $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
