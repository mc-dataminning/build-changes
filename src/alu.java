import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alu {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bas> b = CompletableFuture.completedFuture(bas.a);
   private final alt.a c;
   private final ex d;
   private final dbe e;
   private final alw f;
   private final alx g;
   private final List<kd.a<?>> h;

   private alu(jx<als> $$0, js.a $$1, crq $$2, ex.a $$3, List<kd.a<?>> $$4, int $$5) {
      this.c = new alt.a($$0.a());
      this.h = $$4;
      this.e = new dbe($$1);
      this.d = new ex($$3, es.a($$1, $$2));
      this.f = new alw($$1);
      this.g = new alx($$5, this.d.a());
   }

   public alx a() {
      return this.g;
   }

   public alt.a b() {
      return this.c;
   }

   public dbe c() {
      return this.e;
   }

   public ex d() {
      return this.d;
   }

   public alw e() {
      return this.f;
   }

   public List<auw> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alu> a(avd $$0, jx<als> $$1, List<kd.a<?>> $$2, crq $$3, ex.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alt.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alu $$8 = new alu($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avj.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kd.a::c);
   }
}
