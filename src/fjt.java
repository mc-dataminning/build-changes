import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fjt extends hmd {
   private static final wp a = wp.c("mco.selectServer.create");
   private static final wp b = wp.c("mco.configure.world.name");
   private static final wp c = wp.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fhc E;
   private final fte F = new fte(this);
   private fpz G;
   private fpz H;
   private final Runnable I;

   public fjt(fhc $$0, fii $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aR_() {
      this.F.a(this.l, this.p);
      fti $$0 = this.F.c(fti.d()).a(10);
      fpq $$1 = fpq.a(wo.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fpz(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !azw.h($$1x));
      this.H = new fpz(this.p, 210, 20, c);
      $$0.a(fta.a(this.p, this.G, b));
      $$0.a(fta.a(this.p, this.H, c));
      fti $$2 = this.F.b(fti.e().a(10));
      $$2.a($$1);
      $$2.a(fpq.a(wo.k, $$0x -> this.aO_()).a());
      this.F.a($$1x -> {
         fpo var10000 = this.c($$1x);
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

   private void a(fii $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fub(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wp.c("mco.upload.preparing"), wp.i()));
         CompletableFuture.<fii>supplyAsync(() -> a($$0), af.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wp $$3;
            if ($$0x.getCause() instanceof fjd $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wp.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fjv($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fii a(fii $$0) {
      fhh $$1 = fhh.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fjd var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fii $$0) {
      flg $$1 = new flg($$0.a, this.G.a(), this.H.a());
      fke $$2 = fke.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fhc.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aO_() {
      this.m.a(this.E);
   }
}
