import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alp {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bak> b = CompletableFuture.completedFuture(bak.a);
   private final alo.a c;
   private final ev d;
   private final dao e;
   private final alr f;
   private final als g;
   private final List<kb.a<?>> h;

   private alp(jv<aln> $$0, jq.a $$1, cqq $$2, ev.a $$3, List<kb.a<?>> $$4, int $$5) {
      this.c = new alo.a($$0.a());
      this.h = $$4;
      this.e = new dao($$1);
      this.d = new ev($$3, eq.a($$1, $$2));
      this.f = new alr($$1);
      this.g = new als($$5, this.d.a());
   }

   public als a() {
      return this.g;
   }

   public alo.a b() {
      return this.c;
   }

   public dao c() {
      return this.e;
   }

   public ev d() {
      return this.d;
   }

   public alr e() {
      return this.f;
   }

   public List<aup> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alp> a(auv $$0, jv<aln> $$1, List<kb.a<?>> $$2, cqq $$3, ev.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alo.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alp $$8 = new alp($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avc.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kb.a::c);
   }
}
