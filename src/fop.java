import java.util.Map;
import java.util.stream.Collectors;

public class fop {
   private final Map<fom, elk> a = fom.G().stream().collect(Collectors.toMap($$0 -> (fom)$$0, $$0 -> new elk($$0.H())));

   public elk a(fom $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(elk::g);
   }

   public void b() {
      this.a.values().forEach(elk::h);
   }
}
