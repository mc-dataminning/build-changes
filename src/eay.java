import java.util.List;
import java.util.stream.Stream;

public class eay<T> {
   private final dfo a;
   private final List<T> b;

   public eay(dfo $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dfo a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
