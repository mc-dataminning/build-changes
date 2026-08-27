import java.util.Set;
import java.util.function.Predicate;

public record cck(Set<dpy> b, int c, int d) {
   public static final Predicate<iv<cck>> a = $$0 -> false;

   public cck(Set<dpy> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dpy $$0) {
      return this.b.contains($$0);
   }

   public Set<dpy> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
