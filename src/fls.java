import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fls extends hol {
   private static final ww a = ww.c("mco.selectServer.create");
   private static final ww b = ww.c("mco.configure.world.name");
   private static final ww c = ww.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fjb E;
   private final fve F = new fve(this);
   private frz G;
   private frz H;
   private final Runnable I;

   public fls(fjb $$0, fkh $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aN_() {
      this.F.a(this.l, this.p);
      fvi $$0 = this.F.c(fvi.d()).a(10);
      frq $$1 = frq.a(wv.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new frz(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !baj.h($$1x));
      this.H = new frz(this.p, 210, 20, c);
      $$0.a(fva.a(this.p, this.G, b));
      $$0.a(fva.a(this.p, this.H, c));
      fvi $$2 = this.F.b(fvi.e().a(10));
      $$2.a($$1);
      $$2.a(frq.a(wv.k, $$0x -> this.aK_()).a());
      this.F.a($$1x -> {
         fro var10000 = this.c($$1x);
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

   private void a(fkh $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fwb(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, ww.c("mco.upload.preparing"), ww.i()));
         CompletableFuture.<fkh>supplyAsync(() -> a($$0), af.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            ww $$3;
            if ($$0x.getCause() instanceof flc $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = ww.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new flu($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fkh a(fkh $$0) {
      fjg $$1 = fjg.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (flc var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fkh $$0) {
      fnf $$1 = new fnf($$0.a, this.G.a(), this.H.a());
      fmd $$2 = fmd.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fjb.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aK_() {
      this.m.a(this.E);
   }
}
