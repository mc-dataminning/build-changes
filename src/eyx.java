import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eyx {
   public final fag a = new fag(ac.g(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fag.e<?>> h;
   public final fag.e<List<exx>> b;
   public final fag.e<eyx.a> c;
   public final fag.e<Integer> d;
   public final fag.e<Boolean> e;
   public final fag.e<exw> f;
   public final eyy g = new eyy(new fam());

   public eyx(exh $$0) {
      this.c = this.a.a("server list", () -> {
         eya $$1 = $$0.b();
         return exc.b() ? new eyx.a($$1.a, $$0.c()) : new eyx.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fah.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fah.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fah.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fah.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fah.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fag.e<?>> a() {
      return this.h;
   }

   public static record a(List<exy> a, List<exy> b) {
   }
}
