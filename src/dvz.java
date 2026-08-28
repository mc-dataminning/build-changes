import java.util.List;
import java.util.stream.Stream;

public class dvz<T> {
   private final dbe a;
   private final List<T> b;

   public dvz(dbe $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dbe a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
