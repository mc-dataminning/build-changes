import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class amk {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bbk> b = CompletableFuture.completedFuture(bbk.a);
   private final amj.a c;
   private final ex d;
   private final dcf e;
   private final amm f;
   private final amn g;
   private final List<kd.a<?>> h;

   private amk(jx<ami> $$0, js.a $$1, cso $$2, ex.a $$3, List<kd.a<?>> $$4, int $$5) {
      this.c = new amj.a($$0.a());
      this.h = $$4;
      this.e = new dcf($$1);
      this.d = new ex($$3, es.a($$1, $$2));
      this.f = new amm($$1);
      this.g = new amn($$5, this.d.a());
   }

   public amn a() {
      return this.g;
   }

   public amj.a b() {
      return this.c;
   }

   public dcf c() {
      return this.e;
   }

   public ex d() {
      return this.d;
   }

   public amm e() {
      return this.f;
   }

   public List<avp> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<amk> a(avv $$0, jx<ami> $$1, List<kd.a<?>> $$2, cso $$3, ex.a $$4, int $$5, Executor $$6, Executor $$7) {
      return amj.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         amk $$8 = new amk($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return awb.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kd.a::d);
   }
}
