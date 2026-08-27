import java.util.List;
import java.util.stream.Stream;

public class dlc<T> {
   private final crm a;
   private final List<T> b;

   public dlc(crm $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public crm a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
