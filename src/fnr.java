import java.util.Map;
import java.util.stream.Collectors;

public class fnr {
   private final Map<fno, elc> a = fno.G().stream().collect(Collectors.toMap($$0 -> (fno)$$0, $$0 -> new elc($$0.H())));

   public elc a(fno $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(elc::g);
   }

   public void b() {
      this.a.values().forEach(elc::h);
   }
}
