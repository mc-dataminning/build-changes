import java.util.List;
import java.util.Map;

public class ald {
   private final String a;
   private final String b;

   public ald(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static ald a(String $$0) {
      return new ald($$0, ".json");
   }

   public static ald a(alj<? extends jt<?>> $$0) {
      return a(mi.c($$0));
   }

   public alk a(alk $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public alk b(alk $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<alk, avf> a(avh $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<alk, List<avf>> b(avh $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
