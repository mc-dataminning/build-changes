import java.util.List;
import java.util.stream.Stream;

public class dis<T> {
   private final cpi a;
   private final List<T> b;

   public dis(cpi $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cpi a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
