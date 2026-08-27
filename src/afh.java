import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class afh {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<asx> b = CompletableFuture.completedFuture(asx.a);
   private final dn.a c;
   private final du d;
   private final cml e = new cml();
   private final aqk f;
   private final ect g = new ect();
   private final afj h = new afj(this.g);
   private final afk i;

   public afh(hu.b $$0, cec $$1, du.a $$2, int $$3) {
      this.f = new aqk($$0);
      this.c = dn.a((hu)$$0, $$1);
      this.d = new du($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new afk($$3, this.d.a());
   }

   public afk a() {
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

   public afj e() {
      return this.h;
   }

   public List<ano> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<afh> a(anu $$0, hu.b $$1, cec $$2, du.a $$3, int $$4, Executor $$5, Executor $$6) {
      afh $$7 = new afh($$1, $$2, $$3, $$4);
      return aoa.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(hu $$0) {
      this.f.a().forEach($$1 -> a($$0, (aqk.a<?>)$$1));
      csw.a();
   }

   private static <T> void a(hu $$0, aqk.a<T> $$1) {
      aew<? extends ht<T>> $$2 = $$1.a();
      Map<aqi<T>, List<hg<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> aqi.a($$2, (aex)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends hg<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
