import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fhl extends hff {
   private static final xl a = xl.c("mco.selectServer.create");
   private static final xl b = xl.c("mco.configure.world.name");
   private static final xl c = xl.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fev D;
   private final fpl E = new fpl(this);
   private fmf F;
   private fmf G;
   private final Runnable H;

   public fhl(fev $$0, fgb $$1, boolean $$2) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1, $$2);
   }

   @Override
   public void aS_() {
      this.E.a(this.l, this.p);
      fpp $$0 = this.E.c(fpp.d()).a(10);
      flw $$1 = flw.a(xk.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fmf(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !bak.h($$1x));
      this.G = new fmf(this.p, 210, 20, c);
      $$0.a(fph.a(this.p, this.F, b));
      $$0.a(fph.a(this.p, this.G, c));
      fpp $$2 = this.E.b(fpp.e().a(10));
      $$2.a($$1);
      $$2.a(flw.a(xk.k, $$0x -> this.aP_()).a());
      this.E.a($$1x -> {
         flu var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aG_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fgb $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fqi(() -> {
            $$2.set(true);
            this.D.h();
            this.m.a(this.D);
         }, xl.c("mco.upload.preparing"), xl.i()));
         CompletableFuture.<fgb>supplyAsync(() -> a($$0), ae.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.D.h();
            xl $$3;
            if ($$0x.getCause() instanceof fgv $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xl.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fhn($$3, this.D));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fgb a(fgb $$0) {
      ffa $$1 = ffa.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fgv var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fgb $$0) {
      fiy $$1 = new fiy($$0.a, this.F.a(), this.G.a());
      fhw $$2 = fhw.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fev.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   @Override
   public void aP_() {
      this.m.a(this.D);
   }
}
