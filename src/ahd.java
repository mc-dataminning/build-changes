import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ahd {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<avc> b = CompletableFuture.completedFuture(avc.a);
   private final dn.a c;
   private final dt d;
   private final cpo e = new cpo();
   private final asi f;
   private final egh g = new egh();
   private final ahf h = new ahf(this.g);
   private final ahg i;

   public ahd(is.b $$0, chb $$1, dt.a $$2, int $$3) {
      this.f = new asi($$0);
      this.c = dn.a((is)$$0, $$1);
      this.d = new dt($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new ahg($$3, this.d.a());
   }

   public ahg a() {
      return this.i;
   }

   public egh b() {
      return this.g;
   }

   public cpo c() {
      return this.e;
   }

   public dt d() {
      return this.d;
   }

   public ahf e() {
      return this.h;
   }

   public List<apm> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ahd> a(aps $$0, is.b $$1, chb $$2, dt.a $$3, int $$4, Executor $$5, Executor $$6) {
      ahd $$7 = new ahd($$1, $$2, $$3, $$4);
      return apy.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(is $$0) {
      this.f.a().forEach($$1 -> a($$0, (asi.a<?>)$$1));
      cwb.a();
   }

   private static <T> void a(is $$0, asi.a<T> $$1) {
      ags<? extends ir<T>> $$2 = $$1.a();
      Map<asg<T>, List<ie<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> asg.a($$2, (agt)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ie<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
