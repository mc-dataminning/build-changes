import java.util.ArrayList;
import java.util.List;

public class awd {
   private final List<awe> a = new ArrayList<>();

   public static awd a() {
      return new awd();
   }

   public List<awe> b() {
      return List.copyOf(this.a);
   }

   public awd a(awe $$0) {
      this.a.add($$0);
      return this;
   }

   public awd a(akh $$0) {
      return this.a(awe.a($$0));
   }

   public awd b(akh $$0) {
      return this.a(awe.b($$0));
   }

   public awd c(akh $$0) {
      return this.a(awe.c($$0));
   }

   public awd d(akh $$0) {
      return this.a(awe.d($$0));
   }
}
