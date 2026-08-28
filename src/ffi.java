import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ffi {
   public final fgr a = new fgr(ad.h(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fgr.e<?>> i;
   public final fgr.e<List<fek>> b;
   public final fgr.e<ffi.a> c;
   public final fgr.e<Integer> d;
   public final fgr.e<Boolean> e;
   public final fgr.e<fej> f;
   public final fgr.e<feo> g;
   public final ffj h = new ffj(new fgx());

   public ffi(fdu $$0) {
      this.c = this.a.a("server list", () -> {
         fen $$1 = $$0.b();
         return fdp.b() ? new ffi.a($$1.a, $$0.c()) : new ffi.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fgs.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fgs.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fgs.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fgs.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fgs.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fgs.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fgr.e<?>> a() {
      return this.i;
   }

   public static record a(List<fel> a, List<fel> b) {
   }
}
