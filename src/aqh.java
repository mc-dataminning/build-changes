import java.util.ArrayList;
import java.util.List;

public class aqh {
   private final List<aqi> a = new ArrayList<>();

   public static aqh a() {
      return new aqh();
   }

   public List<aqi> b() {
      return List.copyOf(this.a);
   }

   public aqh a(aqi $$0) {
      this.a.add($$0);
      return this;
   }

   public aqh a(aez $$0) {
      return this.a(aqi.a($$0));
   }

   public aqh b(aez $$0) {
      return this.a(aqi.b($$0));
   }

   public aqh c(aez $$0) {
      return this.a(aqi.c($$0));
   }

   public aqh d(aez $$0) {
      return this.a(aqi.d($$0));
   }
}
