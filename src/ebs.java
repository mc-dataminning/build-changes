import java.util.List;
import java.util.stream.Stream;

public class ebs<T> {
   private final dgg a;
   private final List<T> b;

   public ebs(dgg $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dgg a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
