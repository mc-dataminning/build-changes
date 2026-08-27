import java.util.Map;
import java.util.stream.Collectors;

public class fnw {
   private final Map<fnt, elb> a = fnt.G().stream().collect(Collectors.toMap($$0 -> (fnt)$$0, $$0 -> new elb($$0.H())));

   public elb a(fnt $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(elb::g);
   }

   public void b() {
      this.a.values().forEach(elb::h);
   }
}
