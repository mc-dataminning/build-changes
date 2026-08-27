import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class agg {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<atz> b = CompletableFuture.completedFuture(atz.a);
   private final dp.a c;
   private final dv d;
   private final cnp e = new cnp();
   private final arj f;
   private final edl g = new edl();
   private final agi h = new agi(this.g);
   private final agj i;

   public agg(ip.b $$0, cfg $$1, dv.a $$2, int $$3) {
      this.f = new arj($$0);
      this.c = dp.a((ip)$$0, $$1);
      this.d = new dv($$2, this.c);
      this.c.a(dp.b.a);
      this.i = new agj($$3, this.d.a());
   }

   public agj a() {
      return this.i;
   }

   public edl b() {
      return this.g;
   }

   public cnp c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public agi e() {
      return this.h;
   }

   public List<aon> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<agg> a(aot $$0, ip.b $$1, cfg $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      agg $$7 = new agg($$1, $$2, $$3, $$4);
      return aoz.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dp.b.b)).thenApply($$1x -> $$7);
   }

   public void a(ip $$0) {
      this.f.a().forEach($$1 -> a($$0, (arj.a<?>)$$1));
      cuc.a();
   }

   private static <T> void a(ip $$0, arj.a<T> $$1) {
      afv<? extends io<T>> $$2 = $$1.a();
      Map<arh<T>, List<ib<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> arh.a($$2, (afw)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ib<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
