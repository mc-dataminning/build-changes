import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eug {
   public final evp a = new evp(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<evp.e<?>> h;
   public final evp.e<List<etg>> b;
   public final evp.e<eug.a> c;
   public final evp.e<Integer> d;
   public final evp.e<Boolean> e;
   public final evp.e<etf> f;
   public final euh g = new euh(new evv());

   public eug(esq $$0) {
      this.c = this.a.a("server list", () -> {
         etj $$1 = $$0.b();
         return esl.b() ? new eug.a($$1.a, $$0.c()) : new eug.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), evq.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), evq.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), evq.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), evq.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), evq.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<evp.e<?>> a() {
      return this.h;
   }

   public static record a(List<eth> a, List<eth> b) {
   }
}
