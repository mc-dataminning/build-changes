import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class agq {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<auj> b = CompletableFuture.completedFuture(auj.a);
   private final dp.a c;
   private final dv d;
   private final coi e = new coi();
   private final art f;
   private final eeo g = new eeo();
   private final ags h = new ags(this.g);
   private final agt i;

   public agq(ip.b $$0, cfv $$1, dv.a $$2, int $$3) {
      this.f = new art($$0);
      this.c = dp.a((ip)$$0, $$1);
      this.d = new dv($$2, this.c);
      this.c.a(dp.b.a);
      this.i = new agt($$3, this.d.a());
   }

   public agt a() {
      return this.i;
   }

   public eeo b() {
      return this.g;
   }

   public coi c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public ags e() {
      return this.h;
   }

   public List<aox> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<agq> a(apd $$0, ip.b $$1, cfv $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      agq $$7 = new agq($$1, $$2, $$3, $$4);
      return apj.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dp.b.b)).thenApply($$1x -> $$7);
   }

   public void a(ip $$0) {
      this.f.a().forEach($$1 -> a($$0, (art.a<?>)$$1));
      cuv.a();
   }

   private static <T> void a(ip $$0, art.a<T> $$1) {
      agf<? extends io<T>> $$2 = $$1.a();
      Map<arr<T>, List<ib<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> arr.a($$2, (agg)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ib<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
