import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fiu extends hky {
   private static final wo a = wo.c("mco.selectServer.create");
   private static final wo b = wo.c("mco.configure.world.name");
   private static final wo c = wo.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fgd E;
   private final fse F = new fse(this);
   private foz G;
   private foz H;
   private final Runnable I;

   public fiu(fgd $$0, fhj $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aR_() {
      this.F.a(this.l, this.p);
      fsi $$0 = this.F.c(fsi.d()).a(10);
      fop $$1 = fop.a(wn.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new foz(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !azv.h($$1x));
      this.H = new foz(this.p, 210, 20, c);
      $$0.a(fsa.a(this.p, this.G, b));
      $$0.a(fsa.a(this.p, this.H, c));
      fsi $$2 = this.F.b(fsi.e().a(10));
      $$2.a($$1);
      $$2.a(fop.a(wn.k, $$0x -> this.aO_()).a());
      this.F.a($$1x -> {
         fon var10000 = this.c($$1x);
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

   private void a(fhj $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new ftb(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wo.c("mco.upload.preparing"), wo.i()));
         CompletableFuture.<fhj>supplyAsync(() -> a($$0), af.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wo $$3;
            if ($$0x.getCause() instanceof fie $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wo.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fiw($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fhj a(fhj $$0) {
      fgi $$1 = fgi.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fie var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fhj $$0) {
      fkh $$1 = new fkh($$0.a, this.G.a(), this.H.a());
      fjf $$2 = fjf.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fgd.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aO_() {
      this.m.a(this.E);
   }
}
