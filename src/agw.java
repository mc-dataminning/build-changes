import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class agw {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<aus> b = CompletableFuture.completedFuture(aus.a);
   private final dp.a c;
   private final dv d;
   private final cow e = new cow();
   private final asb f;
   private final eff g = new eff();
   private final agy h = new agy(this.g);
   private final agz i;

   public agw(it.b $$0, cgi $$1, dv.a $$2, int $$3) {
      this.f = new asb($$0);
      this.c = dp.a((it)$$0, $$1);
      this.d = new dv($$2, this.c);
      this.c.a(dp.b.a);
      this.i = new agz($$3, this.d.a());
   }

   public agz a() {
      return this.i;
   }

   public eff b() {
      return this.g;
   }

   public cow c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public agy e() {
      return this.h;
   }

   public List<apf> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<agw> a(apl $$0, it.b $$1, cgi $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      agw $$7 = new agw($$1, $$2, $$3, $$4);
      return apr.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dp.b.b)).thenApply($$1x -> $$7);
   }

   public void a(it $$0) {
      this.f.a().forEach($$1 -> a($$0, (asb.a<?>)$$1));
      cvh.a();
   }

   private static <T> void a(it $$0, asb.a<T> $$1) {
      agl<? extends is<T>> $$2 = $$1.a();
      Map<arz<T>, List<ig<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> arz.a($$2, (agm)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ig<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
