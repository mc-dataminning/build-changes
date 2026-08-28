import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alm {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bah> b = CompletableFuture.completedFuture(bah.a);
   private final all.a c;
   private final eu d;
   private final czx e;
   private final alo f;
   private final alp g;
   private final List<ka.a<?>> h;

   private alm(ju<alk> $$0, jp.a $$1, cqh $$2, eu.a $$3, List<ka.a<?>> $$4, int $$5) {
      this.c = new all.a($$0.a());
      this.h = $$4;
      this.e = new czx($$1);
      this.d = new eu($$3, ep.a($$1, $$2));
      this.f = new alo($$1);
      this.g = new alp($$5, this.d.a());
   }

   public alp a() {
      return this.g;
   }

   public all.a b() {
      return this.c;
   }

   public czx c() {
      return this.e;
   }

   public eu d() {
      return this.d;
   }

   public alo e() {
      return this.f;
   }

   public List<aum> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alm> a(aus $$0, ju<alk> $$1, List<ka.a<?>> $$2, cqh $$3, eu.a $$4, int $$5, Executor $$6, Executor $$7) {
      return all.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alm $$8 = new alm($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return auz.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(ka.a::c);
   }
}
