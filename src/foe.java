import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class foe {
   public final fpn a = new fpn(ag.i(), TimeUnit.MILLISECONDS, ag.c);
   private final List<fpn.e<?>> i;
   public final fpn.e<List<fnf>> b;
   public final fpn.e<foe.a> c;
   public final fpn.e<Integer> d;
   public final fpn.e<Boolean> e;
   public final fpn.e<fne> f;
   public final fpn.e<fnj> g;
   public final fof h = new fof(new fpt());

   public foe(fmf $$0) {
      this.c = this.a.a("server list", () -> {
         fni $$1 = $$0.c();
         return fma.b() ? new foe.a($$1.a, $$0.d()) : new foe.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fpo.a);
      this.d = this.a.a("pending invite count", $$0::i, Duration.ofSeconds(10L), fpo.a(360));
      this.e = this.a.a("trial availablity", $$0::m, Duration.ofSeconds(60L), fpo.a(60));
      this.f = this.a.a("unread news", $$0::l, Duration.ofMinutes(5L), fpo.a);
      this.b = this.a.a("notifications", $$0::e, Duration.ofMinutes(5L), fpo.a);
      this.g = this.a.a("online players", $$0::f, Duration.ofSeconds(10L), fpo.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fpn.e<?>> a() {
      return this.i;
   }

   public static record a(List<fng> a, List<fng> b) {
   }
}
