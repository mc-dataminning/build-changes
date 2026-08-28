import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fcg {
   public final fdp a = new fdp(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fdp.e<?>> h;
   public final fdp.e<List<fbg>> b;
   public final fdp.e<fcg.a> c;
   public final fdp.e<Integer> d;
   public final fdp.e<Boolean> e;
   public final fdp.e<fbf> f;
   public final fch g = new fch(new fdv());

   public fcg(faq $$0) {
      this.c = this.a.a("server list", () -> {
         fbj $$1 = $$0.b();
         return fal.b() ? new fcg.a($$1.a, $$0.c()) : new fcg.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fdq.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fdq.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fdq.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fdq.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fdq.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fdp.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbh> a, List<fbh> b) {
   }
}
