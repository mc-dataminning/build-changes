import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fay {
   public final fch a = new fch(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fch.e<?>> h;
   public final fch.e<List<ezy>> b;
   public final fch.e<fay.a> c;
   public final fch.e<Integer> d;
   public final fch.e<Boolean> e;
   public final fch.e<ezx> f;
   public final faz g = new faz(new fcn());

   public fay(ezi $$0) {
      this.c = this.a.a("server list", () -> {
         fab $$1 = $$0.b();
         return ezd.b() ? new fay.a($$1.a, $$0.c()) : new fay.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fci.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fci.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fci.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fci.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fci.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fch.e<?>> a() {
      return this.h;
   }

   public static record a(List<ezz> a, List<ezz> b) {
   }
}
