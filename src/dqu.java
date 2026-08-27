import java.util.List;
import java.util.stream.Stream;

public class dqu<T> {
   private final cwi a;
   private final List<T> b;

   public dqu(cwi $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cwi a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
