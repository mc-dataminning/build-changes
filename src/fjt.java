import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fjt extends hhv {
   private static final xv a = xv.c("mco.selectServer.create");
   private static final xv b = xv.c("mco.configure.world.name");
   private static final xv c = xv.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fhc E;
   private final frt F = new frt(this);
   private fon G;
   private fon H;
   private final Runnable I;

   public fjt(fhc $$0, fii $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aT_() {
      this.F.a(this.l, this.p);
      frx $$0 = this.F.c(frx.d()).a(10);
      foe $$1 = foe.a(xu.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fon(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bbb.h($$1x));
      this.H = new fon(this.p, 210, 20, c);
      $$0.a(frp.a(this.p, this.G, b));
      $$0.a(frp.a(this.p, this.H, c));
      frx $$2 = this.F.b(frx.e().a(10));
      $$2.a($$1);
      $$2.a(foe.a(xu.k, $$0x -> this.aP_()).a());
      this.F.a($$1x -> {
         foc var10000 = this.c($$1x);
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

   private void a(fii $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fsq(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, xv.c("mco.upload.preparing"), xv.i()));
         CompletableFuture.<fii>supplyAsync(() -> a($$0), ae.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            xv $$3;
            if ($$0x.getCause() instanceof fjd $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xv.c("mco.errorMessage.initialize.failed");
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
   public void aP_() {
      this.m.a(this.E);
   }
}
