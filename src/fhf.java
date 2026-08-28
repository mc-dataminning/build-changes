import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fhf {
   public final fin a = new fin(ae.h(), TimeUnit.MILLISECONDS, ae.c);
   private final List<fin.e<?>> i;
   public final fin.e<List<fgh>> b;
   public final fin.e<fhf.a> c;
   public final fin.e<Integer> d;
   public final fin.e<Boolean> e;
   public final fin.e<fgg> f;
   public final fin.e<fgl> g;
   public final fhg h = new fhg(new fit());

   public fhf(ffh $$0) {
      this.c = this.a.a("server list", () -> {
         fgk $$1 = $$0.b();
         return ffc.b() ? new fhf.a($$1.a, $$0.c()) : new fhf.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fio.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fio.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fio.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fio.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fio.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fio.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fin.e<?>> a() {
      return this.i;
   }

   public static record a(List<fgi> a, List<fgi> b) {
   }
}
