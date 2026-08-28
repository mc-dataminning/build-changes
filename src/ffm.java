import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ffm {
   public final fgv a = new fgv(ad.h(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fgv.e<?>> i;
   public final fgv.e<List<feo>> b;
   public final fgv.e<ffm.a> c;
   public final fgv.e<Integer> d;
   public final fgv.e<Boolean> e;
   public final fgv.e<fen> f;
   public final fgv.e<fes> g;
   public final ffn h = new ffn(new fhb());

   public ffm(fdy $$0) {
      this.c = this.a.a("server list", () -> {
         fer $$1 = $$0.b();
         return fdt.b() ? new ffm.a($$1.a, $$0.c()) : new ffm.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fgw.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fgw.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fgw.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fgw.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fgw.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fgw.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fgv.e<?>> a() {
      return this.i;
   }

   public static record a(List<fep> a, List<fep> b) {
   }
}
