import java.util.Map;
import java.util.stream.Collectors;

public class fof {
   private final Map<foc, ela> a = foc.G().stream().collect(Collectors.toMap($$0 -> (foc)$$0, $$0 -> new ela($$0.H())));

   public ela a(foc $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(ela::g);
   }

   public void b() {
      this.a.values().forEach(ela::h);
   }
}
