import java.util.ArrayList;
import java.util.List;

public class auq {
   private final List<aur> a = new ArrayList<>();

   public static auq a() {
      return new auq();
   }

   public List<aur> b() {
      return List.copyOf(this.a);
   }

   public auq a(aur $$0) {
      this.a.add($$0);
      return this;
   }

   public auq a(ajc $$0) {
      return this.a(aur.a($$0));
   }

   public auq b(ajc $$0) {
      return this.a(aur.b($$0));
   }

   public auq c(ajc $$0) {
      return this.a(aur.c($$0));
   }

   public auq d(ajc $$0) {
      return this.a(aur.d($$0));
   }
}
