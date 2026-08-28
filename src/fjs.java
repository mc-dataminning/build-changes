import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fjs extends hhu {
   private static final xv a = xv.c("mco.selectServer.create");
   private static final xv b = xv.c("mco.configure.world.name");
   private static final xv c = xv.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fhb E;
   private final frs F = new frs(this);
   private fom G;
   private fom H;
   private final Runnable I;

   public fjs(fhb $$0, fih $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aT_() {
      this.F.a(this.l, this.p);
      frw $$0 = this.F.c(frw.d()).a(10);
      fod $$1 = fod.a(xu.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fom(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bbb.h($$1x));
      this.H = new fom(this.p, 210, 20, c);
      $$0.a(fro.a(this.p, this.G, b));
      $$0.a(fro.a(this.p, this.H, c));
      frw $$2 = this.F.b(frw.e().a(10));
      $$2.a($$1);
      $$2.a(fod.a(xu.k, $$0x -> this.aP_()).a());
      this.F.a($$1x -> {
         fob var10000 = this.c($$1x);
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

   private void a(fih $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fsp(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, xv.c("mco.upload.preparing"), xv.i()));
         CompletableFuture.<fih>supplyAsync(() -> a($$0), ae.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            xv $$3;
            if ($$0x.getCause() instanceof fjc $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xv.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fju($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fih a(fih $$0) {
      fhg $$1 = fhg.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fjc var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fih $$0) {
      flf $$1 = new flf($$0.a, this.G.a(), this.H.a());
      fkd $$2 = fkd.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fhb.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aP_() {
      this.m.a(this.E);
   }
}
