import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fbx extends fdm {
   private static final vg a = vg.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final ftv k = new ftv(fdr.b);
   private final eyi l;
   private final evv m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private eyc r;

   public fbx(evv $$0, Runnable $$1) {
      super(vg.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new eyi(true);
      this.n = evr.O().aW().a();
   }

   @Override
   public void aP_() {
      int $$0 = this.o();
      faz $$1 = new faz(this.g, this.h - $$0);
      $$1.c().d().a(4);
      fbf $$2 = $$1.a(fbf.d());
      $$2.c().b().a(2);
      this.r = new eyc(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      exp $$3 = this.m.ap().a(this.m, 0, 0, 150);
      $$3.j = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(exv.b(150, $$0x -> this.a(new fby(this, this.f.m)), false));
      $$2.a(exv.a(150, $$0x -> this.a(new fcv(this, this.f.m, this.f.ae())), false));
      $$1.a(exr.a(vf.j, $$0x -> this.d()).a(), $$1.b().f().a(8));
      $$1.a();
      faz.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int o() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.q);
   }

   private void a(fdm $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      this.k.a(0.0F, 1.0F);
      $$0.a(0, 0, this.g, this.h, -1877995504);
   }

   private void E() {
      if (!this.o && this.n) {
         if (this.p < 40.0F) {
            this.p++;
         } else if (this.f.aA()) {
            Narrator.getNarrator().say(a.getString(), true);
            this.o = true;
         }
      }
   }
}
