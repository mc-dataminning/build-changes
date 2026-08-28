import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fna extends hpw {
   private static final wy a = wy.c("mco.selectServer.create");
   private static final wy b = wy.c("mco.configure.world.name");
   private static final wy c = wy.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fkj E;
   private final fwj F = new fwj(this);
   private fte G;
   private fte H;
   private final Runnable I;

   public fna(fkj $$0, flp $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aO_() {
      this.F.a(this.l, this.p);
      fwn $$0 = this.F.c(fwn.d()).a(10);
      fsv $$1 = fsv.a(wx.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fte(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bal.h($$1x));
      this.H = new fte(this.p, 210, 20, c);
      $$0.a(fwf.a(this.p, this.G, b));
      $$0.a(fwf.a(this.p, this.H, c));
      fwn $$2 = this.F.b(fwn.e().a(10));
      $$2.a($$1);
      $$2.a(fsv.a(wx.k, $$0x -> this.aL_()).a());
      this.F.a($$1x -> {
         fst var10000 = this.c($$1x);
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

   private void a(flp $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fxg(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wy.c("mco.upload.preparing"), wy.i()));
         CompletableFuture.<flp>supplyAsync(() -> a($$0), ag.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wy $$3;
            if ($$0x.getCause() instanceof fmk $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wy.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fnc($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static flp a(flp $$0) {
      fko $$1 = fko.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fmk var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(flp $$0) {
      fon $$1 = new fon($$0.a, this.G.a(), this.H.a());
      fnl $$2 = fnl.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fkj.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aL_() {
      this.m.a(this.E);
   }
}
