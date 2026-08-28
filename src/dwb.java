import java.util.List;
import java.util.stream.Stream;

public class dwb<T> {
   private final dbg a;
   private final List<T> b;

   public dwb(dbg $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dbg a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
