import java.util.List;
import java.util.stream.Stream;

public class dwc<T> {
   private final dbh a;
   private final List<T> b;

   public dwc(dbh $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dbh a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
