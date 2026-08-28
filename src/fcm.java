import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fcm {
   public final fdv a = new fdv(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fdv.e<?>> h;
   public final fdv.e<List<fbm>> b;
   public final fdv.e<fcm.a> c;
   public final fdv.e<Integer> d;
   public final fdv.e<Boolean> e;
   public final fdv.e<fbl> f;
   public final fcn g = new fcn(new feb());

   public fcm(faw $$0) {
      this.c = this.a.a("server list", () -> {
         fbp $$1 = $$0.b();
         return far.b() ? new fcm.a($$1.a, $$0.c()) : new fcm.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fdw.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fdw.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fdw.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fdw.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fdw.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fdv.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbn> a, List<fbn> b) {
   }
}
