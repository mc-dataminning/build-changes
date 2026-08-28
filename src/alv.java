import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alv {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bay> b = CompletableFuture.completedFuture(bay.a);
   private final alu.a c;
   private final el d;
   private final dey e;
   private final alx f;
   private final aly g;
   private final List<jt.a<?>> h;

   private alv(jn<alt> $$0, ji.a $$1, cvj $$2, el.a $$3, List<jt.a<?>> $$4, int $$5) {
      this.c = new alu.a($$0.a());
      this.h = $$4;
      this.e = new dey($$1);
      this.d = new el($$3, eg.a($$1, $$2));
      this.f = new alx($$1);
      this.g = new aly($$5, this.d.a());
   }

   public aly a() {
      return this.g;
   }

   public alu.a b() {
      return this.c;
   }

   public dey c() {
      return this.e;
   }

   public el d() {
      return this.d;
   }

   public alx e() {
      return this.f;
   }

   public List<avb> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<alv> a(avh $$0, jn<alt> $$1, List<jt.a<?>> $$2, cvj $$3, el.a $$4, int $$5, Executor $$6, Executor $$7) {
      return alu.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         alv $$8 = new alv($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return avn.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(jt.a::d);
   }
}
