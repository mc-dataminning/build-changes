import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fdg {
   public final fep a = new fep(ad.h(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fep.e<?>> i;
   public final fep.e<List<fci>> b;
   public final fep.e<fdg.a> c;
   public final fep.e<Integer> d;
   public final fep.e<Boolean> e;
   public final fep.e<fch> f;
   public final fep.e<fcm> g;
   public final fdh h = new fdh(new fev());

   public fdg(fbs $$0) {
      this.c = this.a.a("server list", () -> {
         fcl $$1 = $$0.b();
         return fbn.b() ? new fdg.a($$1.a, $$0.c()) : new fdg.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), feq.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), feq.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), feq.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), feq.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), feq.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), feq.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fep.e<?>> a() {
      return this.i;
   }

   public static record a(List<fcj> a, List<fcj> b) {
   }
}
