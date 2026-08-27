import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ags {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<auo> b = CompletableFuture.completedFuture(auo.a);
   private final dp.a c;
   private final dv d;
   private final cor e = new cor();
   private final arx f;
   private final efa g = new efa();
   private final agu h = new agu(this.g);
   private final agv i;

   public ags(ip.b $$0, cgd $$1, dv.a $$2, int $$3) {
      this.f = new arx($$0);
      this.c = dp.a((ip)$$0, $$1);
      this.d = new dv($$2, this.c);
      this.c.a(dp.b.a);
      this.i = new agv($$3, this.d.a());
   }

   public agv a() {
      return this.i;
   }

   public efa b() {
      return this.g;
   }

   public cor c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public agu e() {
      return this.h;
   }

   public List<apb> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ags> a(aph $$0, ip.b $$1, cgd $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      ags $$7 = new ags($$1, $$2, $$3, $$4);
      return apn.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dp.b.b)).thenApply($$1x -> $$7);
   }

   public void a(ip $$0) {
      this.f.a().forEach($$1 -> a($$0, (arx.a<?>)$$1));
      cvc.a();
   }

   private static <T> void a(ip $$0, arx.a<T> $$1) {
      agh<? extends io<T>> $$2 = $$1.a();
      Map<arv<T>, List<ib<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> arv.a($$2, (agi)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ib<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
