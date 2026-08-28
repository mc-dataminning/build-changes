import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fjn extends hhs {
   private static final xk a = xk.c("mco.selectServer.create");
   private static final xk b = xk.c("mco.configure.world.name");
   private static final xk c = xk.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fgw E;
   private final frn F = new frn(this);
   private foh G;
   private foh H;
   private final Runnable I;

   public fjn(fgw $$0, fic $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aT_() {
      this.F.a(this.l, this.p);
      frr $$0 = this.F.c(frr.d()).a(10);
      fny $$1 = fny.a(xj.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new foh(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bar.h($$1x));
      this.H = new foh(this.p, 210, 20, c);
      $$0.a(frj.a(this.p, this.G, b));
      $$0.a(frj.a(this.p, this.H, c));
      frr $$2 = this.F.b(frr.e().a(10));
      $$2.a($$1);
      $$2.a(fny.a(xj.k, $$0x -> this.aP_()).a());
      this.F.a($$1x -> {
         fnw var10000 = this.c($$1x);
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

   private void a(fic $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fsk(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, xk.c("mco.upload.preparing"), xk.i()));
         CompletableFuture.<fic>supplyAsync(() -> a($$0), ae.g()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            xk $$3;
            if ($$0x.getCause() instanceof fix $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xk.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fjp($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fic a(fic $$0) {
      fhb $$1 = fhb.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fix var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fic $$0) {
      fla $$1 = new fla($$0.a, this.G.a(), this.H.a());
      fjy $$2 = fjy.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fgw.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aP_() {
      this.m.a(this.E);
   }
}
