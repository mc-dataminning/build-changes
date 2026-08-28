import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fdk {
   public final fet a = new fet(ad.h(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fet.e<?>> i;
   public final fet.e<List<fcm>> b;
   public final fet.e<fdk.a> c;
   public final fet.e<Integer> d;
   public final fet.e<Boolean> e;
   public final fet.e<fcl> f;
   public final fet.e<fcq> g;
   public final fdl h = new fdl(new fez());

   public fdk(fbw $$0) {
      this.c = this.a.a("server list", () -> {
         fcp $$1 = $$0.b();
         return fbr.b() ? new fdk.a($$1.a, $$0.c()) : new fdk.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), feu.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), feu.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), feu.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), feu.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), feu.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), feu.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fet.e<?>> a() {
      return this.i;
   }

   public static record a(List<fcn> a, List<fcn> b) {
   }
}
