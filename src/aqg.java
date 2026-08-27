import java.util.ArrayList;
import java.util.List;

public class aqg {
   private final List<aqh> a = new ArrayList<>();

   public static aqg a() {
      return new aqg();
   }

   public List<aqh> b() {
      return List.copyOf(this.a);
   }

   public aqg a(aqh $$0) {
      this.a.add($$0);
      return this;
   }

   public aqg a(aey $$0) {
      return this.a(aqh.a($$0));
   }

   public aqg b(aey $$0) {
      return this.a(aqh.b($$0));
   }

   public aqg c(aey $$0) {
      return this.a(aqh.c($$0));
   }

   public aqg d(aey $$0) {
      return this.a(aqh.d($$0));
   }
}
