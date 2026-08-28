import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class amc {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bbh> b = CompletableFuture.completedFuture(bbh.a);
   private final amb.a c;
   private final el d;
   private final dfi e;
   private final ame f;
   private final amf g;
   private final List<jt.a<?>> h;

   private amc(jn<ama> $$0, ji.a $$1, cvs $$2, el.a $$3, List<jt.a<?>> $$4, int $$5) {
      this.c = new amb.a($$0.a());
      this.h = $$4;
      this.e = new dfi($$1);
      this.d = new el($$3, eg.a($$1, $$2));
      this.f = new ame($$1);
      this.g = new amf($$5, this.d.a());
   }

   public amf a() {
      return this.g;
   }

   public amb.a b() {
      return this.c;
   }

   public dfi c() {
      return this.e;
   }

   public el d() {
      return this.d;
   }

   public ame e() {
      return this.f;
   }

   public List<avi> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<amc> a(avo $$0, jn<ama> $$1, List<jt.a<?>> $$2, cvs $$3, el.a $$4, int $$5, Executor $$6, Executor $$7) {
      return amb.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         amc $$8 = new amc($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avu.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(jt.a::d);
   }
}
