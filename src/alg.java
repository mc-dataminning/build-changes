import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alg {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<baf> b = CompletableFuture.completedFuture(baf.a);
   private final alf.a c;
   private final ey d;
   private final dbl e;
   private final ali f;
   private final alj g;
   private final List<ke.a<?>> h;

   private alg(jy<ale> $$0, jt.a $$1, crt $$2, ey.a $$3, List<ke.a<?>> $$4, int $$5) {
      this.c = new alf.a($$0.a());
      this.h = $$4;
      this.e = new dbl($$1);
      this.d = new ey($$3, et.a($$1, $$2));
      this.f = new ali($$1);
      this.g = new alj($$5, this.d.a());
   }

   public alj a() {
      return this.g;
   }

   public alf.a b() {
      return this.c;
   }

   public dbl c() {
      return this.e;
   }

   public ey d() {
      return this.d;
   }

   public ali e() {
      return this.f;
   }

   public List<auj> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alg> a(aup $$0, jy<ale> $$1, List<ke.a<?>> $$2, crt $$3, ey.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alf.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alg $$8 = new alg($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return auv.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(ke.a::d);
   }
}
