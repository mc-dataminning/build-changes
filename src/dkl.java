import java.util.List;
import java.util.stream.Stream;

public class dkl<T> {
   private final cqz a;
   private final List<T> b;

   public dkl(cqz $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cqz a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
