import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alr {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bau> b = CompletableFuture.completedFuture(bau.a);
   private final alq.a c;
   private final ej d;
   private final deb e;
   private final alt f;
   private final alu g;
   private final List<jr.a<?>> h;

   private alr(jl<alp> $$0, jg.a $$1, cum $$2, ej.a $$3, List<jr.a<?>> $$4, int $$5) {
      this.c = new alq.a($$0.a());
      this.h = $$4;
      this.e = new deb($$1);
      this.d = new ej($$3, ee.a($$1, $$2));
      this.f = new alt($$1);
      this.g = new alu($$5, this.d.a());
   }

   public alu a() {
      return this.g;
   }

   public alq.a b() {
      return this.c;
   }

   public deb c() {
      return this.e;
   }

   public ej d() {
      return this.d;
   }

   public alt e() {
      return this.f;
   }

   public List<auw> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alr> a(avd $$0, jl<alp> $$1, List<jr.a<?>> $$2, cum $$3, ej.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alq.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alr $$8 = new alr($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avj.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(jr.a::d);
   }
}
