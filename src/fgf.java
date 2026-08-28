import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fgf {
   public final fho a = new fho(ae.h(), TimeUnit.MILLISECONDS, ae.c);
   private final List<fho.e<?>> i;
   public final fho.e<List<ffh>> b;
   public final fho.e<fgf.a> c;
   public final fho.e<Integer> d;
   public final fho.e<Boolean> e;
   public final fho.e<ffg> f;
   public final fho.e<ffl> g;
   public final fgg h = new fgg(new fhu());

   public fgf(fer $$0) {
      this.c = this.a.a("server list", () -> {
         ffk $$1 = $$0.b();
         return fem.b() ? new fgf.a($$1.a, $$0.c()) : new fgf.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fhp.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fhp.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fhp.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fhp.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fhp.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fhp.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fho.e<?>> a() {
      return this.i;
   }

   public static record a(List<ffi> a, List<ffi> b) {
   }
}
