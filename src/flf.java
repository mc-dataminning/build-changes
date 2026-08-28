import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class flf {
   public final fmn a = new fmn(af.i(), TimeUnit.MILLISECONDS, af.c);
   private final List<fmn.e<?>> i;
   public final fmn.e<List<fkg>> b;
   public final fmn.e<flf.a> c;
   public final fmn.e<Integer> d;
   public final fmn.e<Boolean> e;
   public final fmn.e<fkf> f;
   public final fmn.e<fkk> g;
   public final flg h = new flg(new fmt());

   public flf(fjg $$0) {
      this.c = this.a.a("server list", () -> {
         fkj $$1 = $$0.b();
         return fjb.b() ? new flf.a($$1.a, $$0.c()) : new flf.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fmo.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fmo.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fmo.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fmo.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fmo.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fmo.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fmn.e<?>> a() {
      return this.i;
   }

   public static record a(List<fkh> a, List<fkh> b) {
   }
}
