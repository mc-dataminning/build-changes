import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fdm {
   public final fev a = new fev(ad.h(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fev.e<?>> i;
   public final fev.e<List<fco>> b;
   public final fev.e<fdm.a> c;
   public final fev.e<Integer> d;
   public final fev.e<Boolean> e;
   public final fev.e<fcn> f;
   public final fev.e<fcs> g;
   public final fdn h = new fdn(new ffb());

   public fdm(fby $$0) {
      this.c = this.a.a("server list", () -> {
         fcr $$1 = $$0.b();
         return fbt.b() ? new fdm.a($$1.a, $$0.c()) : new fdm.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), few.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), few.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), few.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), few.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), few.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), few.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fev.e<?>> a() {
      return this.i;
   }

   public static record a(List<fcp> a, List<fcp> b) {
   }
}
