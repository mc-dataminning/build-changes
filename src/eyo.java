import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eyo {
   public final ezx a = new ezx(ac.g(), TimeUnit.MILLISECONDS, ac.c);
   private final List<ezx.e<?>> h;
   public final ezx.e<List<exo>> b;
   public final ezx.e<eyo.a> c;
   public final ezx.e<Integer> d;
   public final ezx.e<Boolean> e;
   public final ezx.e<exn> f;
   public final eyp g = new eyp(new fad());

   public eyo(ewy $$0) {
      this.c = this.a.a("server list", () -> {
         exr $$1 = $$0.b();
         return ewt.b() ? new eyo.a($$1.a, $$0.c()) : new eyo.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), ezy.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), ezy.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), ezy.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), ezy.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), ezy.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<ezx.e<?>> a() {
      return this.h;
   }

   public static record a(List<exp> a, List<exp> b) {
   }
}
