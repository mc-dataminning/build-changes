import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fja {
   public final fki a = new fki(ae.h(), TimeUnit.MILLISECONDS, ae.c);
   private final List<fki.e<?>> i;
   public final fki.e<List<fib>> b;
   public final fki.e<fja.a> c;
   public final fki.e<Integer> d;
   public final fki.e<Boolean> e;
   public final fki.e<fia> f;
   public final fki.e<fif> g;
   public final fjb h = new fjb(new fko());

   public fja(fhb $$0) {
      this.c = this.a.a("server list", () -> {
         fie $$1 = $$0.b();
         return fgw.b() ? new fja.a($$1.a, $$0.c()) : new fja.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fkj.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fkj.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fkj.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fkj.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fkj.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fkj.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fki.e<?>> a() {
      return this.i;
   }

   public static record a(List<fic> a, List<fic> b) {
   }
}
