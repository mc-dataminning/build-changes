import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class als {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bao> b = CompletableFuture.completedFuture(bao.a);
   private final alr.a c;
   private final ew d;
   private final dan e;
   private final alu f;
   private final alv g;
   private final List<kc.a<?>> h;

   private als(jw<alq> $$0, jr.a $$1, cra $$2, ew.a $$3, List<kc.a<?>> $$4, int $$5) {
      this.c = new alr.a($$0.a());
      this.h = $$4;
      this.e = new dan($$1);
      this.d = new ew($$3, er.a($$1, $$2));
      this.f = new alu($$1);
      this.g = new alv($$5, this.d.a());
   }

   public alv a() {
      return this.g;
   }

   public alr.a b() {
      return this.c;
   }

   public dan c() {
      return this.e;
   }

   public ew d() {
      return this.d;
   }

   public alu e() {
      return this.f;
   }

   public List<aut> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<als> a(ava $$0, jw<alq> $$1, List<kc.a<?>> $$2, cra $$3, ew.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alr.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         als $$8 = new als($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avg.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kc.a::c);
   }
}
