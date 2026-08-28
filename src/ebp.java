import java.util.List;
import java.util.stream.Stream;

public class ebp<T> {
   private final dgf a;
   private final List<T> b;

   public ebp(dgf $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dgf a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
