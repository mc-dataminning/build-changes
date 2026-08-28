import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fce {
   public final fdn a = new fdn(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fdn.e<?>> h;
   public final fdn.e<List<fbe>> b;
   public final fdn.e<fce.a> c;
   public final fdn.e<Integer> d;
   public final fdn.e<Boolean> e;
   public final fdn.e<fbd> f;
   public final fcf g = new fcf(new fdt());

   public fce(fao $$0) {
      this.c = this.a.a("server list", () -> {
         fbh $$1 = $$0.b();
         return faj.b() ? new fce.a($$1.a, $$0.c()) : new fce.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fdo.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fdo.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fdo.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fdo.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fdo.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fdn.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbf> a, List<fbf> b) {
   }
}
