import java.util.ArrayList;
import java.util.List;

public class aqf {
   private final List<aqg> a = new ArrayList<>();

   public static aqf a() {
      return new aqf();
   }

   public List<aqg> b() {
      return List.copyOf(this.a);
   }

   public aqf a(aqg $$0) {
      this.a.add($$0);
      return this;
   }

   public aqf a(aex $$0) {
      return this.a(aqg.a($$0));
   }

   public aqf b(aex $$0) {
      return this.a(aqg.b($$0));
   }

   public aqf c(aex $$0) {
      return this.a(aqg.c($$0));
   }

   public aqf d(aex $$0) {
      return this.a(aqg.d($$0));
   }
}
