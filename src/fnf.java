import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fnf extends hqd {
   private static final wy a = wy.c("mco.selectServer.create");
   private static final wy b = wy.c("mco.configure.world.name");
   private static final wy c = wy.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fko E;
   private final fwo F = new fwo(this);
   private ftj G;
   private ftj H;
   private final Runnable I;

   public fnf(fko $$0, flu $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aO_() {
      this.F.a(this.l, this.p);
      fws $$0 = this.F.c(fws.d()).a(10);
      fta $$1 = fta.a(wx.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new ftj(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bal.h($$1x));
      this.H = new ftj(this.p, 210, 20, c);
      $$0.a(fwk.a(this.p, this.G, b));
      $$0.a(fwk.a(this.p, this.H, c));
      fws $$2 = this.F.b(fws.e().a(10));
      $$2.a($$1);
      $$2.a(fta.a(wx.k, $$0x -> this.aL_()).a());
      this.F.a($$1x -> {
         fsy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.G);
   }

   @Override
   protected void c() {
      this.F.a();
   }

   private void a(flu $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fxl(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wy.c("mco.upload.preparing"), wy.i()));
         CompletableFuture.<flu>supplyAsync(() -> a($$0), ag.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wy $$3;
            if ($$0x.getCause() instanceof fmp $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wy.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fnh($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static flu a(flu $$0) {
      fkt $$1 = fkt.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fmp var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(flu $$0) {
      fot $$1 = new fot($$0.a, this.G.a(), this.H.a());
      fnq $$2 = fnq.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fko.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aL_() {
      this.m.a(this.E);
   }
}
