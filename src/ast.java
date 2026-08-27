import java.util.ArrayList;
import java.util.List;

public class ast {
   private final List<asu> a = new ArrayList<>();

   public static ast a() {
      return new ast();
   }

   public List<asu> b() {
      return List.copyOf(this.a);
   }

   public ast a(asu $$0) {
      this.a.add($$0);
      return this;
   }

   public ast a(ahg $$0) {
      return this.a(asu.a($$0));
   }

   public ast b(ahg $$0) {
      return this.a(asu.b($$0));
   }

   public ast c(ahg $$0) {
      return this.a(asu.c($$0));
   }

   public ast d(ahg $$0) {
      return this.a(asu.d($$0));
   }
}
