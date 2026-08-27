import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class aji {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<axk> b = CompletableFuture.completedFuture(axk.a);
   private final dq.a c;
   private final dv d;
   private final cse e = new cse();
   private final auq f;
   private final eiy g = new eiy();
   private final ajk h = new ajk(this.g);
   private final ajl i;

   public aji(iw.b $$0, cjs $$1, dv.a $$2, int $$3) {
      this.f = new auq($$0);
      this.c = dq.a((iw)$$0, $$1);
      this.d = new dv($$2, this.c);
      this.c.a(dq.b.a);
      this.i = new ajl($$3, this.d.a());
   }

   public ajl a() {
      return this.i;
   }

   public eiy b() {
      return this.g;
   }

   public cse c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public ajk e() {
      return this.h;
   }

   public List<aru> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<aji> a(asa $$0, iw.b $$1, cjs $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      aji $$7 = new aji($$1, $$2, $$3, $$4);
      return asg.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dq.b.b)).thenApply($$1x -> $$7);
   }

   public void a(iw $$0) {
      this.f.a().forEach($$1 -> a($$0, (auq.a<?>)$$1));
      dii.f();
      cyq.a();
   }

   private static <T> void a(iw $$0, auq.a<T> $$1) {
      aix<? extends iv<T>> $$2 = $$1.a();
      Map<auo<T>, List<ij<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> auo.a($$2, (aiy)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ij<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
