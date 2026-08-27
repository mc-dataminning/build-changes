import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class afg {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<asx> b = CompletableFuture.completedFuture(asx.a);
   private final dn.a c;
   private final du d;
   private final cml e = new cml();
   private final aqj f;
   private final ect g = new ect();
   private final afi h = new afi(this.g);
   private final afj i;

   public afg(hr.b $$0, cec $$1, du.a $$2, int $$3) {
      this.f = new aqj($$0);
      this.c = dn.a((hr)$$0, $$1);
      this.d = new du($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new afj($$3, this.d.a());
   }

   public afj a() {
      return this.i;
   }

   public ect b() {
      return this.g;
   }

   public cml c() {
      return this.e;
   }

   public du d() {
      return this.d;
   }

   public afi e() {
      return this.h;
   }

   public List<ann> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<afg> a(ant $$0, hr.b $$1, cec $$2, du.a $$3, int $$4, Executor $$5, Executor $$6) {
      afg $$7 = new afg($$1, $$2, $$3, $$4);
      return anz.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(hr $$0) {
      this.f.a().forEach($$1 -> a($$0, (aqj.a<?>)$$1));
      csw.a();
   }

   private static <T> void a(hr $$0, aqj.a<T> $$1) {
      aev<? extends hq<T>> $$2 = $$1.a();
      Map<aqh<T>, List<he<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> aqh.a($$2, (aew)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends he<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
