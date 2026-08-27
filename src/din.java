import java.util.List;
import java.util.stream.Stream;

public class din<T> {
   private final cor a;
   private final List<T> b;

   public din(cor $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cor a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
