import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ada {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<apz> b = CompletableFuture.completedFuture(apz.a);
   private final dm.a c;
   private final dt d;
   private final cjd e = new cjd();
   private final ann f;
   private final dzn g = new dzn();
   private final adc h = new adc(this.g);
   private final add i;

   public ada(hs.b $$0, caw $$1, dt.a $$2, int $$3) {
      this.f = new ann($$0);
      this.c = dm.a((hs)$$0, $$1);
      this.d = new dt($$2, this.c);
      this.c.a(dm.b.a);
      this.i = new add($$3, this.d.a());
   }

   public add a() {
      return this.i;
   }

   public dzn b() {
      return this.g;
   }

   public cjd c() {
      return this.e;
   }

   public dt d() {
      return this.d;
   }

   public adc e() {
      return this.h;
   }

   public List<akr> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ada> a(akx $$0, hs.b $$1, caw $$2, dt.a $$3, int $$4, Executor $$5, Executor $$6) {
      ada $$7 = new ada($$1, $$2, $$3, $$4);
      return ald.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dm.b.b)).thenApply($$1x -> $$7);
   }

   public void a(hs $$0) {
      this.f.a().forEach($$1 -> a($$0, (ann.a<?>)$$1));
      cpo.a();
   }

   private static <T> void a(hs $$0, ann.a<T> $$1) {
      acp<? extends hr<T>> $$2 = $$1.a();
      Map<anl<T>, List<he<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> anl.a($$2, (acq)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends he<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
