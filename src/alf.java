import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alf {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<baf> b = CompletableFuture.completedFuture(baf.a);
   private final ale.a c;
   private final ey d;
   private final dbl e;
   private final alh f;
   private final ali g;
   private final List<ke.a<?>> h;

   private alf(jy<ald> $$0, jt.a $$1, crt $$2, ey.a $$3, List<ke.a<?>> $$4, int $$5) {
      this.c = new ale.a($$0.a());
      this.h = $$4;
      this.e = new dbl($$1);
      this.d = new ey($$3, et.a($$1, $$2));
      this.f = new alh($$1);
      this.g = new ali($$5, this.d.a());
   }

   public ali a() {
      return this.g;
   }

   public ale.a b() {
      return this.c;
   }

   public dbl c() {
      return this.e;
   }

   public ey d() {
      return this.d;
   }

   public alh e() {
      return this.f;
   }

   public List<auj> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alf> a(aup $$0, jy<ald> $$1, List<ke.a<?>> $$2, crt $$3, ey.a $$4, int $$5, Executor $$6, Executor $$7) {
      return ale.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alf $$8 = new alf($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return auv.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(ke.a::d);
   }
}
