import java.util.List;
import java.util.stream.Stream;

public class efj<T> {
   private final dje a;
   private final List<T> b;

   public efj(dje $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dje a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
