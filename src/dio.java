import java.util.List;
import java.util.stream.Stream;

public class dio<T> {
   private final cos a;
   private final List<T> b;

   public dio(cos $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cos a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
