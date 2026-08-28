import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class flr {
   public final fmz a = new fmz(af.i(), TimeUnit.MILLISECONDS, af.c);
   private final List<fmz.e<?>> i;
   public final fmz.e<List<fks>> b;
   public final fmz.e<flr.a> c;
   public final fmz.e<Integer> d;
   public final fmz.e<Boolean> e;
   public final fmz.e<fkr> f;
   public final fmz.e<fkw> g;
   public final fls h = new fls(new fnf());

   public flr(fjs $$0) {
      this.c = this.a.a("server list", () -> {
         fkv $$1 = $$0.b();
         return fjn.b() ? new flr.a($$1.a, $$0.c()) : new flr.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fna.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fna.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fna.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fna.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fna.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fna.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fmz.e<?>> a() {
      return this.i;
   }

   public static record a(List<fkt> a, List<fkt> b) {
   }
}
