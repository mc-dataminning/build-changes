import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fiw extends hkx {
   private static final wo a = wo.c("mco.selectServer.create");
   private static final wo b = wo.c("mco.configure.world.name");
   private static final wo c = wo.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fgf E;
   private final fsg F = new fsg(this);
   private fpb G;
   private fpb H;
   private final Runnable I;

   public fiw(fgf $$0, fhl $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aR_() {
      this.F.a(this.l, this.p);
      fsk $$0 = this.F.c(fsk.d()).a(10);
      fos $$1 = fos.a(wn.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fpb(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !azw.h($$1x));
      this.H = new fpb(this.p, 210, 20, c);
      $$0.a(fsc.a(this.p, this.G, b));
      $$0.a(fsc.a(this.p, this.H, c));
      fsk $$2 = this.F.b(fsk.e().a(10));
      $$2.a($$1);
      $$2.a(fos.a(wn.k, $$0x -> this.aO_()).a());
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

   private void a(fhl $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new ftd(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wo.c("mco.upload.preparing"), wo.i()));
         CompletableFuture.<fhl>supplyAsync(() -> a($$0), af.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wo $$3;
            if ($$0x.getCause() instanceof fig $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wo.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fiy($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fhl a(fhl $$0) {
      fgk $$1 = fgk.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fig var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fhl $$0) {
      fkj $$1 = new fkj($$0.a, this.G.a(), this.H.a());
      fjh $$2 = fjh.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fgf.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aO_() {
      this.m.a(this.E);
   }
}
