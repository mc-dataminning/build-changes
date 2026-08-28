import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alr {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bau> b = CompletableFuture.completedFuture(bau.a);
   private final alq.a c;
   private final ek d;
   private final del e;
   private final alt f;
   private final alu g;
   private final List<js.a<?>> h;

   private alr(jm<alp> $$0, jh.a $$1, cuw $$2, ek.a $$3, List<js.a<?>> $$4, int $$5) {
      this.c = new alq.a($$0.a());
      this.h = $$4;
      this.e = new del($$1);
      this.d = new ek($$3, ef.a($$1, $$2));
      this.f = new alt($$1);
      this.g = new alu($$5, this.d.a());
   }

   public alu a() {
      return this.g;
   }

   public alq.a b() {
      return this.c;
   }

   public del c() {
      return this.e;
   }

   public ek d() {
      return this.d;
   }

   public alt e() {
      return this.f;
   }

   public List<auw> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alr> a(avd $$0, jm<alp> $$1, List<js.a<?>> $$2, cuw $$3, ek.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alq.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alr $$8 = new alr($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avj.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(js.a::d);
   }
}
