import java.util.Map;
import java.util.stream.Collectors;

public class fol {
   private final Map<foi, ele> a = foi.G().stream().collect(Collectors.toMap($$0 -> (foi)$$0, $$0 -> new ele($$0.H())));

   public ele a(foi $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(ele::g);
   }

   public void b() {
      this.a.values().forEach(ele::h);
   }
}
