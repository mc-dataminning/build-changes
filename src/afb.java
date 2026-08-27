import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class afb {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<asp> b = CompletableFuture.completedFuture(asp.a);
   private final dl.a c;
   private final ds d;
   private final cmb e = new cmb();
   private final aqc f;
   private final ecj g = new ecj();
   private final afd h = new afd(this.g);
   private final afe i;

   public afb(hs.b $$0, cdu $$1, ds.a $$2, int $$3) {
      this.f = new aqc($$0);
      this.c = dl.a((hs)$$0, $$1);
      this.d = new ds($$2, this.c);
      this.c.a(dl.b.a);
      this.i = new afe($$3, this.d.a());
   }

   public afe a() {
      return this.i;
   }

   public ecj b() {
      return this.g;
   }

   public cmb c() {
      return this.e;
   }

   public ds d() {
      return this.d;
   }

   public afd e() {
      return this.h;
   }

   public List<ang> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<afb> a(anm $$0, hs.b $$1, cdu $$2, ds.a $$3, int $$4, Executor $$5, Executor $$6) {
      afb $$7 = new afb($$1, $$2, $$3, $$4);
      return ans.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dl.b.b)).thenApply($$1x -> $$7);
   }

   public void a(hs $$0) {
      this.f.a().forEach($$1 -> a($$0, (aqc.a<?>)$$1));
      csm.a();
   }

   private static <T> void a(hs $$0, aqc.a<T> $$1) {
      aeq<? extends hr<T>> $$2 = $$1.a();
      Map<aqa<T>, List<he<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> aqa.a($$2, (aer)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends he<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
