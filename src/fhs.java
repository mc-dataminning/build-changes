import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fhs extends hfq {
   private static final xj a = xj.c("mco.selectServer.create");
   private static final xj b = xj.c("mco.configure.world.name");
   private static final xj c = xj.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final ffc D;
   private final fps E = new fps(this);
   private fmm F;
   private fmm G;
   private final Runnable H;

   public fhs(ffc $$0, fgi $$1, boolean $$2) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1, $$2);
   }

   @Override
   public void aR_() {
      this.E.a(this.l, this.p);
      fpw $$0 = this.E.c(fpw.d()).a(10);
      fmd $$1 = fmd.a(xi.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fmm(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !baj.h($$1x));
      this.G = new fmm(this.p, 210, 20, c);
      $$0.a(fpo.a(this.p, this.F, b));
      $$0.a(fpo.a(this.p, this.G, c));
      fpw $$2 = this.E.b(fpw.e().a(10));
      $$2.a($$1);
      $$2.a(fmd.a(xi.k, $$0x -> this.aO_()).a());
      this.E.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aF_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fgi $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fqp(() -> {
            $$2.set(true);
            this.D.h();
            this.m.a(this.D);
         }, xj.c("mco.upload.preparing"), xj.i()));
         CompletableFuture.<fgi>supplyAsync(() -> a($$0), ae.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.D.h();
            xj $$3;
            if ($$0x.getCause() instanceof fhc $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xj.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fhu($$3, this.D));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fgi a(fgi $$0) {
      ffh $$1 = ffh.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fhc var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fgi $$0) {
      fjf $$1 = new fjf($$0.a, this.F.a(), this.G.a());
      fid $$2 = fid.a(this, $$0, $$1, () -> this.m.execute(() -> {
            ffc.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   @Override
   public void aO_() {
      this.m.a(this.D);
   }
}
