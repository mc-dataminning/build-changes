import java.util.ArrayList;
import java.util.List;

public class axx {
   private final List<axy> a = new ArrayList<>();

   public static axx a() {
      return new axx();
   }

   public List<axy> b() {
      return List.copyOf(this.a);
   }

   public axx a(axy $$0) {
      this.a.add($$0);
      return this;
   }

   public axx a(alp $$0) {
      return this.a(axy.a($$0));
   }

   public axx b(alp $$0) {
      return this.a(axy.b($$0));
   }

   public axx c(alp $$0) {
      return this.a(axy.c($$0));
   }

   public axx d(alp $$0) {
      return this.a(axy.d($$0));
   }
}
