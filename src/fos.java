import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fos extends hro {
   private static final xc a = xc.c("mco.selectServer.create");
   private static final xc b = xc.c("mco.configure.world.name");
   private static final xc c = xc.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fma E;
   private final fyb F = new fyb(this);
   private fuw G;
   private fuw H;
   private final Runnable I;

   public fos(fma $$0, fng $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aS_() {
      this.F.a(this.l, this.p);
      fyf $$0 = this.F.c(fyf.d()).a(10);
      fun $$1 = fun.a(xb.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fuw(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bap.h($$1x));
      this.H = new fuw(this.p, 210, 20, c);
      $$0.a(fxx.a(this.p, this.G, b));
      $$0.a(fxx.a(this.p, this.H, c));
      fyf $$2 = this.F.b(fyf.e().a(10));
      $$2.a($$1);
      $$2.a(fun.a(xb.k, $$0x -> this.aP_()).a());
      this.F.a($$1x -> {
         ful var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aG_() {
      this.b(this.G);
   }

   @Override
   protected void c() {
      this.F.a();
   }

   private void a(fng $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fyy(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, xc.c("mco.upload.preparing"), xc.i()));
         CompletableFuture.<fng>supplyAsync(() -> a($$0), ag.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            xc $$3;
            if ($$0x.getCause() instanceof fob $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xc.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fou($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fng a(fng $$0) {
      fmf $$1 = fmf.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fob var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fng $$0) {
      fqf $$1 = new fqf($$0.a, this.G.a(), this.H.a());
      fpd $$2 = fpd.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fma.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aP_() {
      this.m.a(this.E);
   }
}
