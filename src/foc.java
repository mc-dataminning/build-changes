import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class foc extends hrc {
   private static final xg a = xg.c("mco.selectServer.create");
   private static final xg b = xg.c("mco.configure.world.name");
   private static final xg c = xg.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fll E;
   private final fxm F = new fxm(this);
   private fuh G;
   private fuh H;
   private final Runnable I;

   public foc(fll $$0, fmr $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aO_() {
      this.F.a(this.l, this.p);
      fxq $$0 = this.F.c(fxq.d()).a(10);
      fty $$1 = fty.a(xf.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fuh(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bay.h($$1x));
      this.H = new fuh(this.p, 210, 20, c);
      $$0.a(fxi.a(this.p, this.G, b));
      $$0.a(fxi.a(this.p, this.H, c));
      fxq $$2 = this.F.b(fxq.e().a(10));
      $$2.a($$1);
      $$2.a(fty.a(xf.k, $$0x -> this.aL_()).a());
      this.F.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.G);
   }

   @Override
   protected void c() {
      this.F.a();
   }

   private void a(fmr $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fyj(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, xg.c("mco.upload.preparing"), xg.i()));
         CompletableFuture.<fmr>supplyAsync(() -> a($$0), ag.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            xg $$3;
            if ($$0x.getCause() instanceof fnm $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xg.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new foe($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fmr a(fmr $$0) {
      flq $$1 = flq.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fnm var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fmr $$0) {
      fpq $$1 = new fpq($$0.a, this.G.a(), this.H.a());
      fon $$2 = fon.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fll.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aL_() {
      this.m.a(this.E);
   }
}
