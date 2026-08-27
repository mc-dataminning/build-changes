import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class esq {
   public final etz a = new etz(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<etz.e<?>> h;
   public final etz.e<List<erq>> b;
   public final etz.e<esq.a> c;
   public final etz.e<Integer> d;
   public final etz.e<Boolean> e;
   public final etz.e<erp> f;
   public final esr g = new esr(new euf());

   public esq(era $$0) {
      this.c = this.a.a("server list", () -> {
         ert $$1 = $$0.b();
         return eqv.b() ? new esq.a($$1.a, $$0.c()) : new esq.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), eua.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), eua.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), eua.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), eua.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), eua.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<etz.e<?>> a() {
      return this.h;
   }

   public static record a(List<err> a, List<err> b) {
   }
}
