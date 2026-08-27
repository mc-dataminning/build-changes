import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class afe {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<ass> b = CompletableFuture.completedFuture(ass.a);
   private final dn.a c;
   private final du d;
   private final cmg e = new cmg();
   private final aqf f;
   private final eco g = new eco();
   private final afg h = new afg(this.g);
   private final afh i;

   public afe(hu.b $$0, cdx $$1, du.a $$2, int $$3) {
      this.f = new aqf($$0);
      this.c = dn.a((hu)$$0, $$1);
      this.d = new du($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new afh($$3, this.d.a());
   }

   public afh a() {
      return this.i;
   }

   public eco b() {
      return this.g;
   }

   public cmg c() {
      return this.e;
   }

   public du d() {
      return this.d;
   }

   public afg e() {
      return this.h;
   }

   public List<anj> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<afe> a(anp $$0, hu.b $$1, cdx $$2, du.a $$3, int $$4, Executor $$5, Executor $$6) {
      afe $$7 = new afe($$1, $$2, $$3, $$4);
      return anv.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(hu $$0) {
      this.f.a().forEach($$1 -> a($$0, (aqf.a<?>)$$1));
      csr.a();
   }

   private static <T> void a(hu $$0, aqf.a<T> $$1) {
      aet<? extends ht<T>> $$2 = $$1.a();
      Map<aqd<T>, List<hg<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> aqd.a($$2, (aeu)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends hg<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
