import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fcu {
   public final fed a = new fed(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fed.e<?>> h;
   public final fed.e<List<fbu>> b;
   public final fed.e<fcu.a> c;
   public final fed.e<Integer> d;
   public final fed.e<Boolean> e;
   public final fed.e<fbt> f;
   public final fcv g = new fcv(new fej());

   public fcu(fbe $$0) {
      this.c = this.a.a("server list", () -> {
         fbx $$1 = $$0.b();
         return faz.b() ? new fcu.a($$1.a, $$0.c()) : new fcu.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fee.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fee.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fee.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fee.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fee.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fed.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbv> a, List<fbv> b) {
   }
}
