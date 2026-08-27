import java.util.ArrayList;
import java.util.List;

public class ars {
   private final List<art> a = new ArrayList<>();

   public static ars a() {
      return new ars();
   }

   public List<art> b() {
      return List.copyOf(this.a);
   }

   public ars a(art $$0) {
      this.a.add($$0);
      return this;
   }

   public ars a(agi $$0) {
      return this.a(art.a($$0));
   }

   public ars b(agi $$0) {
      return this.a(art.b($$0));
   }

   public ars c(agi $$0) {
      return this.a(art.c($$0));
   }

   public ars d(agi $$0) {
      return this.a(art.d($$0));
   }
}
