import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fdi {
   public final fer a = new fer(ad.g(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fer.e<?>> h;
   public final fer.e<List<fci>> b;
   public final fer.e<fdi.a> c;
   public final fer.e<Integer> d;
   public final fer.e<Boolean> e;
   public final fer.e<fch> f;
   public final fdj g = new fdj(new fex());

   public fdi(fbs $$0) {
      this.c = this.a.a("server list", () -> {
         fcl $$1 = $$0.b();
         return fbn.b() ? new fdi.a($$1.a, $$0.c()) : new fdi.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fes.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fes.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fes.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fes.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fes.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fer.e<?>> a() {
      return this.h;
   }

   public static record a(List<fcj> a, List<fcj> b) {
   }
}
