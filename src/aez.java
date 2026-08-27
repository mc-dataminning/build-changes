import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class aez {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<asn> b = CompletableFuture.completedFuture(asn.a);
   private final dm.a c;
   private final dt d;
   private final cma e = new cma();
   private final aqa f;
   private final eck g = new eck();
   private final afb h = new afb(this.g);
   private final afc i;

   public aez(ht.b $$0, cdt $$1, dt.a $$2, int $$3) {
      this.f = new aqa($$0);
      this.c = dm.a((ht)$$0, $$1);
      this.d = new dt($$2, this.c);
      this.c.a(dm.b.a);
      this.i = new afc($$3, this.d.a());
   }

   public afc a() {
      return this.i;
   }

   public eck b() {
      return this.g;
   }

   public cma c() {
      return this.e;
   }

   public dt d() {
      return this.d;
   }

   public afb e() {
      return this.h;
   }

   public List<ane> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<aez> a(ank $$0, ht.b $$1, cdt $$2, dt.a $$3, int $$4, Executor $$5, Executor $$6) {
      aez $$7 = new aez($$1, $$2, $$3, $$4);
      return anq.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dm.b.b)).thenApply($$1x -> $$7);
   }

   public void a(ht $$0) {
      this.f.a().forEach($$1 -> a($$0, (aqa.a<?>)$$1));
      csl.a();
   }

   private static <T> void a(ht $$0, aqa.a<T> $$1) {
      aeo<? extends hs<T>> $$2 = $$1.a();
      Map<apy<T>, List<hf<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> apy.a($$2, (aep)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends hf<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
