import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fdw extends ffl {
   private static final vq a = vq.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fvv k = new fvv(ffq.b);
   private final faf l;
   private final exs m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private ezz r;
   @Nullable
   private ezm t;

   public fdw(exs $$0, Runnable $$1) {
      super(vq.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new faf(true);
      this.n = exo.P().aX().a();
   }

   @Override
   public void aQ_() {
      int $$0 = this.o();
      fcy $$1 = new fcy(this.g, this.h - $$0);
      $$1.c().d().a(4);
      fde $$2 = $$1.a(fde.d());
      $$2.c().b().a(2);
      this.r = new ezz(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      this.t = this.m.ap().a(this.m, 0, 0, 150);
      this.t.j = this.n;
      $$2.a(this.t);
      $$2.a(ezs.b(150, $$0x -> this.a(new fdx(this, this.f.m)), false));
      $$2.a(ezs.a(150, $$0x -> this.a(new feu(this, this.f.m, this.f.af())), false));
      $$1.a(ezo.a(vp.j, $$0x -> this.d()).a(), $$1.b().f().a(8));
      $$1.a();
      fcy.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::c);
   }

   @Override
   protected void aH_() {
      if (this.n && this.t != null) {
         this.b(this.t);
      } else {
         super.aH_();
      }
   }

   private int o() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.q);
   }

   private void a(ffl $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.k.a(0.0F, 1.0F);
      $$0.a(0, 0, this.g, this.h, -1877995504);
   }

   private void E() {
      if (!this.o && this.n) {
         if (this.p < 40.0F) {
            this.p++;
         } else if (this.f.aB()) {
            Narrator.getNarrator().say(a.getString(), true);
            this.o = true;
         }
      }
   }
}
