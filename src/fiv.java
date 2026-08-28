import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fiv extends hld {
   private static final wp a = wp.c("mco.selectServer.create");
   private static final wp b = wp.c("mco.configure.world.name");
   private static final wp c = wp.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fge E;
   private final fsg F = new fsg(this);
   private fpb G;
   private fpb H;
   private final Runnable I;

   public fiv(fge $$0, fhk $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aR_() {
      this.F.a(this.l, this.p);
      fsk $$0 = this.F.c(fsk.d()).a(10);
      fos $$1 = fos.a(wo.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fpb(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !azw.h($$1x));
      this.H = new fpb(this.p, 210, 20, c);
      $$0.a(fsc.a(this.p, this.G, b));
      $$0.a(fsc.a(this.p, this.H, c));
      fsk $$2 = this.F.b(fsk.e().a(10));
      $$2.a($$1);
      $$2.a(fos.a(wo.k, $$0x -> this.aO_()).a());
      this.F.a($$1x -> {
         fop var10000 = this.c($$1x);
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

   private void a(fhk $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new ftd(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wp.c("mco.upload.preparing"), wp.i()));
         CompletableFuture.<fhk>supplyAsync(() -> a($$0), af.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wp $$3;
            if ($$0x.getCause() instanceof fif $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wp.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fix($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fhk a(fhk $$0) {
      fgj $$1 = fgj.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fif var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fhk $$0) {
      fki $$1 = new fki($$0.a, this.G.a(), this.H.a());
      fjg $$2 = fjg.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fge.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aO_() {
      this.m.a(this.E);
   }
}
