import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ahn {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<avm> b = CompletableFuture.completedFuture(avm.a);
   private final dn.a c;
   private final dt d;
   private final cpy e = new cpy();
   private final ass f;
   private final egs g = new egs();
   private final ahp h = new ahp(this.g);
   private final ahq i;

   public ahn(iu.b $$0, chl $$1, dt.a $$2, int $$3) {
      this.f = new ass($$0);
      this.c = dn.a((iu)$$0, $$1);
      this.d = new dt($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new ahq($$3, this.d.a());
   }

   public ahq a() {
      return this.i;
   }

   public egs b() {
      return this.g;
   }

   public cpy c() {
      return this.e;
   }

   public dt d() {
      return this.d;
   }

   public ahp e() {
      return this.h;
   }

   public List<apw> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ahn> a(aqc $$0, iu.b $$1, chl $$2, dt.a $$3, int $$4, Executor $$5, Executor $$6) {
      ahn $$7 = new ahn($$1, $$2, $$3, $$4);
      return aqi.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(iu $$0) {
      this.f.a().forEach($$1 -> a($$0, (ass.a<?>)$$1));
      cwl.a();
   }

   private static <T> void a(iu $$0, ass.a<T> $$1) {
      ahc<? extends it<T>> $$2 = $$1.a();
      Map<asq<T>, List<ih<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> asq.a($$2, (ahd)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ih<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
