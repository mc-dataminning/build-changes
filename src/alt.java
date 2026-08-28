import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alt {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<baw> b = CompletableFuture.completedFuture(baw.a);
   private final als.a c;
   private final ek d;
   private final dew e;
   private final alv f;
   private final alw g;
   private final List<js.a<?>> h;

   private alt(jm<alr> $$0, jh.a $$1, cvh $$2, ek.a $$3, List<js.a<?>> $$4, int $$5) {
      this.c = new als.a($$0.a());
      this.h = $$4;
      this.e = new dew($$1);
      this.d = new ek($$3, ef.a($$1, $$2));
      this.f = new alv($$1);
      this.g = new alw($$5, this.d.a());
   }

   public alw a() {
      return this.g;
   }

   public als.a b() {
      return this.c;
   }

   public dew c() {
      return this.e;
   }

   public ek d() {
      return this.d;
   }

   public alv e() {
      return this.f;
   }

   public List<auz> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alt> a(avf $$0, jm<alr> $$1, List<js.a<?>> $$2, cvh $$3, ek.a $$4, int $$5, Executor $$6, Executor $$7) {
      return als.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alt $$8 = new alt($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avl.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(js.a::d);
   }
}
