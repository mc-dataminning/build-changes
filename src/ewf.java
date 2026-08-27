import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ewf {
   public final exo a = new exo(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<exo.e<?>> h;
   public final exo.e<List<evf>> b;
   public final exo.e<ewf.a> c;
   public final exo.e<Integer> d;
   public final exo.e<Boolean> e;
   public final exo.e<eve> f;
   public final ewg g = new ewg(new exu());

   public ewf(eup $$0) {
      this.c = this.a.a("server list", () -> {
         evi $$1 = $$0.b();
         return euk.b() ? new ewf.a($$1.a, $$0.c()) : new ewf.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), exp.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), exp.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), exp.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), exp.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), exp.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<exo.e<?>> a() {
      return this.h;
   }

   public static record a(List<evg> a, List<evg> b) {
   }
}
