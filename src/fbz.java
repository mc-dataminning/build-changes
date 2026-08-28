import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fbz {
   public final fdi a = new fdi(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fdi.e<?>> h;
   public final fdi.e<List<faz>> b;
   public final fdi.e<fbz.a> c;
   public final fdi.e<Integer> d;
   public final fdi.e<Boolean> e;
   public final fdi.e<fay> f;
   public final fca g = new fca(new fdo());

   public fbz(faj $$0) {
      this.c = this.a.a("server list", () -> {
         fbc $$1 = $$0.b();
         return fae.b() ? new fbz.a($$1.a, $$0.c()) : new fbz.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fdj.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fdj.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fdj.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fdj.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fdj.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fdi.e<?>> a() {
      return this.h;
   }

   public static record a(List<fba> a, List<fba> b) {
   }
}
