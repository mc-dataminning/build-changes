import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alp {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bas> b = CompletableFuture.completedFuture(bas.a);
   private final alo.a c;
   private final ej d;
   private final ddq e;
   private final alr f;
   private final als g;
   private final List<jr.a<?>> h;

   private alp(jl<aln> $$0, jg.a $$1, cub $$2, ej.a $$3, List<jr.a<?>> $$4, int $$5) {
      this.c = new alo.a($$0.a());
      this.h = $$4;
      this.e = new ddq($$1);
      this.d = new ej($$3, ee.a($$1, $$2));
      this.f = new alr($$1);
      this.g = new als($$5, this.d.a());
   }

   public als a() {
      return this.g;
   }

   public alo.a b() {
      return this.c;
   }

   public ddq c() {
      return this.e;
   }

   public ej d() {
      return this.d;
   }

   public alr e() {
      return this.f;
   }

   public List<auu> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alp> a(avb $$0, jl<aln> $$1, List<jr.a<?>> $$2, cub $$3, ej.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alo.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alp $$8 = new alp($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avh.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(jr.a::d);
   }
}
