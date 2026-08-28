import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alw {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bat> b = CompletableFuture.completedFuture(bat.a);
   private final alv.a c;
   private final ex d;
   private final dax e;
   private final aly f;
   private final alz g;
   private final List<kd.a<?>> h;

   private alw(jx<alu> $$0, js.a $$1, crj $$2, ex.a $$3, List<kd.a<?>> $$4, int $$5) {
      this.c = new alv.a($$0.a());
      this.h = $$4;
      this.e = new dax($$1);
      this.d = new ex($$3, es.a($$1, $$2));
      this.f = new aly($$1);
      this.g = new alz($$5, this.d.a());
   }

   public alz a() {
      return this.g;
   }

   public alv.a b() {
      return this.c;
   }

   public dax c() {
      return this.e;
   }

   public ex d() {
      return this.d;
   }

   public aly e() {
      return this.f;
   }

   public List<auy> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alw> a(ave $$0, jx<alu> $$1, List<kd.a<?>> $$2, crj $$3, ex.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alv.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alw $$8 = new alw($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avk.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kd.a::c);
   }
}
