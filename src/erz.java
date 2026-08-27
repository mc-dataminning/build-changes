import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class erz {
   public final eti a = new eti(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<eti.e<?>> h;
   public final eti.e<List<eqz>> b;
   public final eti.e<erz.a> c;
   public final eti.e<Integer> d;
   public final eti.e<Boolean> e;
   public final eti.e<eqy> f;
   public final esa g = new esa(new eto());

   public erz(eqj $$0) {
      this.c = this.a.a("server list", () -> {
         erc $$1 = $$0.b();
         return eqe.b() ? new erz.a($$1.a, $$0.c()) : new erz.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), etj.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), etj.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), etj.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), etj.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), etj.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<eti.e<?>> a() {
      return this.h;
   }

   public static record a(List<era> a, List<era> b) {
   }
}
