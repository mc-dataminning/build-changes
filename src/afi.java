import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class afi {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<asz> b = CompletableFuture.completedFuture(asz.a);
   private final dn.a c;
   private final du d;
   private final cmn e = new cmn();
   private final aql f;
   private final ecv g = new ecv();
   private final afk h = new afk(this.g);
   private final afl i;

   public afi(hu.b $$0, cee $$1, du.a $$2, int $$3) {
      this.f = new aql($$0);
      this.c = dn.a((hu)$$0, $$1);
      this.d = new du($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new afl($$3, this.d.a());
   }

   public afl a() {
      return this.i;
   }

   public ecv b() {
      return this.g;
   }

   public cmn c() {
      return this.e;
   }

   public du d() {
      return this.d;
   }

   public afk e() {
      return this.h;
   }

   public List<anp> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<afi> a(anv $$0, hu.b $$1, cee $$2, du.a $$3, int $$4, Executor $$5, Executor $$6) {
      afi $$7 = new afi($$1, $$2, $$3, $$4);
      return aob.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(hu $$0) {
      this.f.a().forEach($$1 -> a($$0, (aql.a<?>)$$1));
      csy.a();
   }

   private static <T> void a(hu $$0, aql.a<T> $$1) {
      aex<? extends ht<T>> $$2 = $$1.a();
      Map<aqj<T>, List<hg<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> aqj.a($$2, (aey)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends hg<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
