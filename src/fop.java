import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class fop extends hrm {
   private static final xa a = xa.c("mco.selectServer.create");
   private static final xa b = xa.c("mco.configure.world.name");
   private static final xa c = xa.c("mco.configure.world.description");
   private static final int C = 10;
   private static final int D = 210;
   private final fly E;
   private final fxz F = new fxz(this);
   private fuu G;
   private fuu H;
   private final Runnable I;

   public fop(fly $$0, fne $$1, boolean $$2) {
      super(a);
      this.E = $$0;
      this.I = () -> this.a($$1, $$2);
   }

   @Override
   public void aS_() {
      this.F.a(this.l, this.p);
      fyd $$0 = this.F.c(fyd.d()).a(10);
      ful $$1 = ful.a(wz.j, $$0x -> this.I.run()).a();
      $$1.j = false;
      this.G = new fuu(this.p, 210, 20, b);
      this.G.b($$1x -> $$1.j = !ban.h($$1x));
      this.H = new fuu(this.p, 210, 20, c);
      $$0.a(fxv.a(this.p, this.G, b));
      $$0.a(fxv.a(this.p, this.H, c));
      fyd $$2 = this.F.b(fyd.e().a(10));
      $$2.a($$1);
      $$2.a(ful.a(wz.k, $$0x -> this.aP_()).a());
      this.F.a($$1x -> {
         fuj var10000 = this.c($$1x);
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

   private void a(fne $$0, boolean $$1) {
      if (!$$0.h() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.m.a(new fyw(() -> {
            $$2.set(true);
            this.E.h();
            this.m.a(this.E);
         }, xa.c("mco.upload.preparing"), xa.i()));
         CompletableFuture.<fne>supplyAsync(() -> a($$0), ag.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.m).exceptionallyAsync($$0x -> {
            this.E.h();
            xa $$3;
            if ($$0x.getCause() instanceof fnz $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xa.c("mco.errorMessage.initialize.failed");
            }

            this.m.a(new fos($$3, this.E));
            return null;
         }, this.m);
      } else {
         this.b($$0);
      }
   }

   private static fne a(fne $$0) {
      fmd $$1 = fmd.a();

      try {
         return $$1.a(Long.valueOf($$0.a));
      } catch (fnz var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fne $$0) {
      fqd $$1 = new fqd($$0.a, this.G.a(), this.H.a());
      fpb $$2 = fpb.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fly.g();
            this.m.a(this.E);
         }));
      this.m.a($$2);
   }

   @Override
   public void aP_() {
      this.m.a(this.E);
   }
}
