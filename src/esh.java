import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class esh {
   public final etq a = new etq(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<etq.e<?>> h;
   public final etq.e<List<erh>> b;
   public final etq.e<esh.a> c;
   public final etq.e<Integer> d;
   public final etq.e<Boolean> e;
   public final etq.e<erg> f;
   public final esi g = new esi(new etw());

   public esh(eqr $$0) {
      this.c = this.a.a("server list", () -> {
         erk $$1 = $$0.b();
         return eqm.b() ? new esh.a($$1.a, $$0.c()) : new esh.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), etr.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), etr.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), etr.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), etr.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), etr.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<etq.e<?>> a() {
      return this.h;
   }

   public static record a(List<eri> a, List<eri> b) {
   }
}
