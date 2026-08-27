import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ahq {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<avr> b = CompletableFuture.completedFuture(avr.a);
   private final dn.a c;
   private final dt d;
   private final cqe e = new cqe();
   private final asx f;
   private final egy g = new egy();
   private final ahs h = new ahs(this.g);
   private final aht i;

   public ahq(iu.b $$0, chr $$1, dt.a $$2, int $$3) {
      this.f = new asx($$0);
      this.c = dn.a((iu)$$0, $$1);
      this.d = new dt($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new aht($$3, this.d.a());
   }

   public aht a() {
      return this.i;
   }

   public egy b() {
      return this.g;
   }

   public cqe c() {
      return this.e;
   }

   public dt d() {
      return this.d;
   }

   public ahs e() {
      return this.h;
   }

   public List<aqb> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ahq> a(aqh $$0, iu.b $$1, chr $$2, dt.a $$3, int $$4, Executor $$5, Executor $$6) {
      ahq $$7 = new ahq($$1, $$2, $$3, $$4);
      return aqn.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(iu $$0) {
      this.f.a().forEach($$1 -> a($$0, (asx.a<?>)$$1));
      cwr.a();
   }

   private static <T> void a(iu $$0, asx.a<T> $$1) {
      ahf<? extends it<T>> $$2 = $$1.a();
      Map<asv<T>, List<ih<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> asv.a($$2, (ahg)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ih<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
