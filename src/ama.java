import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ama {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bba> b = CompletableFuture.completedFuture(bba.a);
   private final alz.a c;
   private final ex d;
   private final dcc e;
   private final amc f;
   private final amd g;
   private final List<kd.a<?>> h;

   private ama(jx<aly> $$0, js.a $$1, csk $$2, ex.a $$3, List<kd.a<?>> $$4, int $$5) {
      this.c = new alz.a($$0.a());
      this.h = $$4;
      this.e = new dcc($$1);
      this.d = new ex($$3, es.a($$1, $$2));
      this.f = new amc($$1);
      this.g = new amd($$5, this.d.a());
   }

   public amd a() {
      return this.g;
   }

   public alz.a b() {
      return this.c;
   }

   public dcc c() {
      return this.e;
   }

   public ex d() {
      return this.d;
   }

   public amc e() {
      return this.f;
   }

   public List<avf> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<ama> a(avl $$0, jx<aly> $$1, List<kd.a<?>> $$2, csk $$3, ex.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alz.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         ama $$8 = new ama($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avr.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kd.a::d);
   }
}
