import java.util.List;
import java.util.stream.Stream;

public class dvy<T> {
   private final dbd a;
   private final List<T> b;

   public dvy(dbd $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dbd a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
