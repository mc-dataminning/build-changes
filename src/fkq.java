import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fkq extends hne {
   private static final wv a = wv.c("mco.selectServer.create");
   private static final wv b = wv.c("mco.configure.world.name");
   private static final wv c = wv.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fhz E;
   private final fub F = new fub(this);
   private fqw G;
   private fqw H;
   private final Runnable I;

   public fkq(fhz $$0, fjf $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aN_() {
      this.F.a(this.l, this.p);
      fuf $$0 = this.F.c(fuf.d()).a(10);
      fqn $$1 = fqn.a(wu.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fqw(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bah.h($$1x));
      this.H = new fqw(this.p, 210, 20, c);
      $$0.a(ftx.a(this.p, this.G, b));
      $$0.a(ftx.a(this.p, this.H, c));
      fuf $$2 = this.F.b(fuf.e().a(10));
      $$2.a($$1);
      $$2.a(fqn.a(wu.k, $$0x -> this.aK_()).a());
      this.F.a($$1x -> {
         fql var10000 = this.c($$1x);
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

   private void a(fjf $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fuy(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wv.c("mco.upload.preparing"), wv.i()));
         CompletableFuture.<fjf>supplyAsync(() -> a($$0), af.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wv $$3;
            if ($$0x.getCause() instanceof fka $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wv.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fks($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fjf a(fjf $$0) {
      fie $$1 = fie.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fka var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fjf $$0) {
      fmd $$1 = new fmd($$0.a, this.G.a(), this.H.a());
      flb $$2 = flb.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fhz.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aK_() {
      this.m.a(this.E);
   }
}
