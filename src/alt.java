import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alt {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bap> b = CompletableFuture.completedFuture(bap.a);
   private final als.a c;
   private final ex d;
   private final dat e;
   private final alv f;
   private final alw g;
   private final List<kd.a<?>> h;

   private alt(jx<alr> $$0, js.a $$1, crf $$2, ex.a $$3, List<kd.a<?>> $$4, int $$5) {
      this.c = new als.a($$0.a());
      this.h = $$4;
      this.e = new dat($$1);
      this.d = new ex($$3, es.a($$1, $$2));
      this.f = new alv($$1);
      this.g = new alw($$5, this.d.a());
   }

   public alw a() {
      return this.g;
   }

   public als.a b() {
      return this.c;
   }

   public dat c() {
      return this.e;
   }

   public ex d() {
      return this.d;
   }

   public alv e() {
      return this.f;
   }

   public List<auu> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alt> a(avb $$0, jx<alr> $$1, List<kd.a<?>> $$2, crf $$3, ex.a $$4, int $$5, Executor $$6, Executor $$7) {
      return als.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alt $$8 = new alt($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avh.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(kd.a::c);
   }
}
