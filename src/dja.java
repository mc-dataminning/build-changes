import java.util.List;
import java.util.stream.Stream;

public class dja<T> {
   private final cpe a;
   private final List<T> b;

   public dja(cpe $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cpe a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
