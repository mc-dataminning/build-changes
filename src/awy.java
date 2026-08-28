import java.util.ArrayList;
import java.util.List;

public class awy {
   private final List<awz> a = new ArrayList<>();

   public static awy a() {
      return new awy();
   }

   public List<awz> b() {
      return List.copyOf(this.a);
   }

   public awy a(awz $$0) {
      this.a.add($$0);
      return this;
   }

   public awy a(alb $$0) {
      return this.a(awz.a($$0));
   }

   public awy b(alb $$0) {
      return this.a(awz.b($$0));
   }

   public awy c(alb $$0) {
      return this.a(awz.c($$0));
   }

   public awy d(alb $$0) {
      return this.a(awz.d($$0));
   }
}
