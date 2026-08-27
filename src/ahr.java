import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ahr {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<avt> b = CompletableFuture.completedFuture(avt.a);
   private final dn.a c;
   private final dt d;
   private final cqn e = new cqn();
   private final asz f;
   private final ehi g = new ehi();
   private final aht h = new aht(this.g);
   private final ahu i;

   public ahr(iu.b $$0, cia $$1, dt.a $$2, int $$3) {
      this.f = new asz($$0);
      this.c = dn.a((iu)$$0, $$1);
      this.d = new dt($$2, this.c);
      this.c.a(dn.b.a);
      this.i = new ahu($$3, this.d.a());
   }

   public ahu a() {
      return this.i;
   }

   public ehi b() {
      return this.g;
   }

   public cqn c() {
      return this.e;
   }

   public dt d() {
      return this.d;
   }

   public aht e() {
      return this.h;
   }

   public List<aqd> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ahr> a(aqj $$0, iu.b $$1, cia $$2, dt.a $$3, int $$4, Executor $$5, Executor $$6) {
      ahr $$7 = new ahr($$1, $$2, $$3, $$4);
      return aqp.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(dn.b.b)).thenApply($$1x -> $$7);
   }

   public void a(iu $$0) {
      this.f.a().forEach($$1 -> a($$0, (asz.a<?>)$$1));
      cxa.a();
   }

   private static <T> void a(iu $$0, asz.a<T> $$1) {
      ahg<? extends it<T>> $$2 = $$1.a();
      Map<asx<T>, List<ih<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> asx.a($$2, (ahh)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ih<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }
}
