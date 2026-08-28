import java.util.List;
import java.util.stream.Stream;

public class dyc<T> {
   private final dcy a;
   private final List<T> b;

   public dyc(dcy $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dcy a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
