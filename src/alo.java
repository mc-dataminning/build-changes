import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alo {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<baq> b = CompletableFuture.completedFuture(baq.a);
   private final aln.a c;
   private final ey d;
   private final dcs e;
   private final alq f;
   private final alr g;
   private final List<kf.a<?>> h;

   private alo(jz<alm> $$0, ju.a $$1, cte $$2, ey.a $$3, List<kf.a<?>> $$4, int $$5) {
      this.c = new aln.a($$0.a());
      this.h = $$4;
      this.e = new dcs($$1);
      this.d = new ey($$3, et.a($$1, $$2));
      this.f = new alq($$1);
      this.g = new alr($$5, this.d.a());
   }

   public alr a() {
      return this.g;
   }

   public aln.a b() {
      return this.c;
   }

   public dcs c() {
      return this.e;
   }

   public ey d() {
      return this.d;
   }

   public alq e() {
      return this.f;
   }

   public List<aut> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alo> a(ava $$0, jz<alm> $$1, List<kf.a<?>> $$2, cte $$3, ey.a $$4, int $$5, Executor $$6, Executor $$7) {
      return aln.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alo $$8 = new alo($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avg.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kf.a::d);
   }
}
