import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fcf {
   public final fdo a = new fdo(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fdo.e<?>> h;
   public final fdo.e<List<fbf>> b;
   public final fdo.e<fcf.a> c;
   public final fdo.e<Integer> d;
   public final fdo.e<Boolean> e;
   public final fdo.e<fbe> f;
   public final fcg g = new fcg(new fdu());

   public fcf(fap $$0) {
      this.c = this.a.a("server list", () -> {
         fbi $$1 = $$0.b();
         return fak.b() ? new fcf.a($$1.a, $$0.c()) : new fcf.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fdp.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fdp.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fdp.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fdp.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fdp.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fdo.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbg> a, List<fbg> b) {
   }
}
