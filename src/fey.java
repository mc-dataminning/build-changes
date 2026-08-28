import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fey {
   public final fgh a = new fgh(ad.h(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fgh.e<?>> i;
   public final fgh.e<List<fea>> b;
   public final fgh.e<fey.a> c;
   public final fgh.e<Integer> d;
   public final fgh.e<Boolean> e;
   public final fgh.e<fdz> f;
   public final fgh.e<fee> g;
   public final fez h = new fez(new fgn());

   public fey(fdk $$0) {
      this.c = this.a.a("server list", () -> {
         fed $$1 = $$0.b();
         return fdf.b() ? new fey.a($$1.a, $$0.c()) : new fey.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fgi.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fgi.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fgi.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fgi.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fgi.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fgi.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fgh.e<?>> a() {
      return this.i;
   }

   public static record a(List<feb> a, List<feb> b) {
   }
}
