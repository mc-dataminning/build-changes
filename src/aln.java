import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class aln {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bai> b = CompletableFuture.completedFuture(bai.a);
   private final alm.a c;
   private final eu d;
   private final dal e;
   private final alp f;
   private final alq g;
   private final List<ka.a<?>> h;

   private aln(ju<all> $$0, jp.a $$1, cqn $$2, eu.a $$3, List<ka.a<?>> $$4, int $$5) {
      this.c = new alm.a($$0.a());
      this.h = $$4;
      this.e = new dal($$1);
      this.d = new eu($$3, ep.a($$1, $$2));
      this.f = new alp($$1);
      this.g = new alq($$5, this.d.a());
   }

   public alq a() {
      return this.g;
   }

   public alm.a b() {
      return this.c;
   }

   public dal c() {
      return this.e;
   }

   public eu d() {
      return this.d;
   }

   public alp e() {
      return this.f;
   }

   public List<aun> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<aln> a(aut $$0, ju<all> $$1, List<ka.a<?>> $$2, cqn $$3, eu.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alm.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         aln $$8 = new aln($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return ava.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(ka.a::c);
   }
}
