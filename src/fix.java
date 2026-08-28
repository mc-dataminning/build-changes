import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fix extends hlf {
   private static final wp a = wp.c("mco.selectServer.create");
   private static final wp b = wp.c("mco.configure.world.name");
   private static final wp c = wp.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fgg E;
   private final fsi F = new fsi(this);
   private fpd G;
   private fpd H;
   private final Runnable I;

   public fix(fgg $$0, fhm $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aR_() {
      this.F.a(this.l, this.p);
      fsm $$0 = this.F.c(fsm.d()).a(10);
      fou $$1 = fou.a(wo.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fpd(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !azw.h($$1x));
      this.H = new fpd(this.p, 210, 20, c);
      $$0.a(fse.a(this.p, this.G, b));
      $$0.a(fse.a(this.p, this.H, c));
      fsm $$2 = this.F.b(fsm.e().a(10));
      $$2.a($$1);
      $$2.a(fou.a(wo.k, $$0x -> this.aO_()).a());
      this.F.a($$1x -> {
         fos var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aF_() {
      this.b(this.G);
   }

   @Override
   protected void c() {
      this.F.a();
   }

   private void a(fhm $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new ftf(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wp.c("mco.upload.preparing"), wp.i()));
         CompletableFuture.<fhm>supplyAsync(() -> a($$0), af.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wp $$3;
            if ($$0x.getCause() instanceof fih $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wp.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fiz($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fhm a(fhm $$0) {
      fgl $$1 = fgl.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fih var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fhm $$0) {
      fkk $$1 = new fkk($$0.a, this.G.a(), this.H.a());
      fji $$2 = fji.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fgg.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aO_() {
      this.m.a(this.E);
   }
}
