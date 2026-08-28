import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fcs {
   public final feb a = new feb(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<feb.e<?>> h;
   public final feb.e<List<fbs>> b;
   public final feb.e<fcs.a> c;
   public final feb.e<Integer> d;
   public final feb.e<Boolean> e;
   public final feb.e<fbr> f;
   public final fct g = new fct(new feh());

   public fcs(fbc $$0) {
      this.c = this.a.a("server list", () -> {
         fbv $$1 = $$0.b();
         return fax.b() ? new fcs.a($$1.a, $$0.c()) : new fcs.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fec.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fec.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fec.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fec.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fec.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<feb.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbt> a, List<fbt> b) {
   }
}
