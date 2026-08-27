import java.util.ArrayList;
import java.util.List;

public class aqe {
   private final List<aqf> a = new ArrayList<>();

   public static aqe a() {
      return new aqe();
   }

   public List<aqf> b() {
      return List.copyOf(this.a);
   }

   public aqe a(aqf $$0) {
      this.a.add($$0);
      return this;
   }

   public aqe a(aew $$0) {
      return this.a(aqf.a($$0));
   }

   public aqe b(aew $$0) {
      return this.a(aqf.b($$0));
   }

   public aqe c(aew $$0) {
      return this.a(aqf.c($$0));
   }

   public aqe d(aew $$0) {
      return this.a(aqf.d($$0));
   }
}
