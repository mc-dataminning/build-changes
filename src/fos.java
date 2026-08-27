import java.util.Map;
import java.util.stream.Collectors;

public class fos {
   private final Map<foo, elm> a = foo.G().stream().collect(Collectors.toMap($$0 -> (foo)$$0, $$0 -> new elm($$0.H())));

   public elm a(foo $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(elm::g);
   }

   public void b() {
      this.a.values().forEach(elm::h);
   }
}
