import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class afj {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<atc> b = CompletableFuture.completedFuture(atc.a);
   private final dn.a c;
   private final du d;
   private final cmr e = new cmr();
   private final aqm f;
   private final ecn g = new ecn();
   private final afl h = new afl(this.g);
   private final afm i;

   public afj(hr.b $$0, cei $$1, du.a $$2, int $$3) {
      this.f = new aqm($$0);
      this.c = dn.a((hr)$$0, $$1);
      this.d = new du($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new afm($$3, this.d.a());
   }

   public afm a() {
      return this.i;
   }

   public ecn b() {
      return this.g;
   }

   public cmr c() {
      return this.e;
   }

   public du d() {
      return this.d;
   }

   public afl e() {
      return this.h;
   }

   public List<anq> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<afj> a(anw $$0, hr.b $$1, cei $$2, du.a $$3, int $$4, Executor $$5, Executor $$6) {
      afj $$7 = new afj($$1, $$2, $$3, $$4);
      return aoc.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(hr $$0) {
      this.f.a().forEach($$1 -> a($$0, (aqm.a<?>)$$1));
      cte.a();
   }

   private static <T> void a(hr $$0, aqm.a<T> $$1) {
      aey<? extends hq<T>> $$2 = $$1.a();
      Map<aqk<T>, List<he<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> aqk.a($$2, (aez)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends he<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
