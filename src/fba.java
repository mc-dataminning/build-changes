import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fba {
   public final fcj a = new fcj(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fcj.e<?>> h;
   public final fcj.e<List<faa>> b;
   public final fcj.e<fba.a> c;
   public final fcj.e<Integer> d;
   public final fcj.e<Boolean> e;
   public final fcj.e<ezz> f;
   public final fbb g = new fbb(new fcp());

   public fba(ezk $$0) {
      this.c = this.a.a("server list", () -> {
         fad $$1 = $$0.b();
         return ezf.b() ? new fba.a($$1.a, $$0.c()) : new fba.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fck.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fck.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fck.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fck.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fck.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fcj.e<?>> a() {
      return this.h;
   }

   public static record a(List<fab> a, List<fab> b) {
   }
}
