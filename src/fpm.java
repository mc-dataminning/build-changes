import java.util.Map;
import java.util.stream.Collectors;

public class fpm {
   private final Map<fpj, emc> a = fpj.G().stream().collect(Collectors.toMap($$0 -> (fpj)$$0, $$0 -> new emc($$0.H())));

   public emc a(fpj $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(emc::g);
   }

   public void b() {
      this.a.values().forEach(emc::h);
   }
}
