import java.util.List;
import java.util.stream.Stream;

public class dpb<T> {
   private final cuy a;
   private final List<T> b;

   public dpb(cuy $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cuy a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
