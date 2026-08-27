import java.util.List;
import java.util.stream.Stream;

public class dsx<T> {
   private final cye a;
   private final List<T> b;

   public dsx(cye $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cye a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
