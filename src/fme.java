import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fme extends hpb {
   private static final wy a = wy.c("mco.selectServer.create");
   private static final wy b = wy.c("mco.configure.world.name");
   private static final wy c = wy.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fjn E;
   private final fvq F = new fvq(this);
   private fsl G;
   private fsl H;
   private final Runnable I;

   public fme(fjn $$0, fkt $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aN_() {
      this.F.a(this.l, this.p);
      fvu $$0 = this.F.c(fvu.d()).a(10);
      fsc $$1 = fsc.a(wx.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fsl(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bal.h($$1x));
      this.H = new fsl(this.p, 210, 20, c);
      $$0.a(fvm.a(this.p, this.G, b));
      $$0.a(fvm.a(this.p, this.H, c));
      fvu $$2 = this.F.b(fvu.e().a(10));
      $$2.a($$1);
      $$2.a(fsc.a(wx.k, $$0x -> this.aK_()).a());
      this.F.a($$1x -> {
         fsa var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aB_() {
      this.b(this.G);
   }

   @Override
   protected void c() {
      this.F.a();
   }

   private void a(fkt $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fwn(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wy.c("mco.upload.preparing"), wy.i()));
         CompletableFuture.<fkt>supplyAsync(() -> a($$0), af.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wy $$3;
            if ($$0x.getCause() instanceof flo $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wy.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fmg($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fkt a(fkt $$0) {
      fjs $$1 = fjs.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (flo var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fkt $$0) {
      fnr $$1 = new fnr($$0.a, this.G.a(), this.H.a());
      fmp $$2 = fmp.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fjn.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aK_() {
      this.m.a(this.E);
   }
}
