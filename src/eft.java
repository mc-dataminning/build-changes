import java.util.List;
import java.util.stream.Stream;

public class eft<T> {
   private final djo a;
   private final List<T> b;

   public eft(djo $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public djo a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
