import java.util.List;
import java.util.stream.Stream;

public class dfq<T> {
   private final clt a;
   private final List<T> b;

   public dfq(clt $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public clt a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
