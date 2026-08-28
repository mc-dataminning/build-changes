import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fml extends hpj {
   private static final wy a = wy.c("mco.selectServer.create");
   private static final wy b = wy.c("mco.configure.world.name");
   private static final wy c = wy.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fju E;
   private final fvx F = new fvx(this);
   private fss G;
   private fss H;
   private final Runnable I;

   public fml(fju $$0, fla $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aO_() {
      this.F.a(this.l, this.p);
      fwb $$0 = this.F.c(fwb.d()).a(10);
      fsj $$1 = fsj.a(wx.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fss(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !bal.h($$1x));
      this.H = new fss(this.p, 210, 20, c);
      $$0.a(fvt.a(this.p, this.G, b));
      $$0.a(fvt.a(this.p, this.H, c));
      fwb $$2 = this.F.b(fwb.e().a(10));
      $$2.a($$1);
      $$2.a(fsj.a(wx.k, $$0x -> this.aL_()).a());
      this.F.a($$1x -> {
         fsh var10000 = this.c($$1x);
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

   private void a(fla $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fwu(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, wy.c("mco.upload.preparing"), wy.i()));
         CompletableFuture.<fla>supplyAsync(() -> a($$0), af.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            wy $$3;
            if ($$0x.getCause() instanceof flv $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = wy.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fmn($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fla a(fla $$0) {
      fjz $$1 = fjz.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (flv var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fla $$0) {
      fny $$1 = new fny($$0.a, this.G.a(), this.H.a());
      fmw $$2 = fmw.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fju.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aL_() {
      this.m.a(this.E);
   }
}
