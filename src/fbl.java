import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fbl extends fda {
   private static final vf a = vf.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fti k = new fti(fdf.b);
   private final exw l;
   private final evl m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private exq r;

   public fbl(evl $$0, Runnable $$1) {
      super(vf.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new exw(true);
      this.n = evh.O().aV().a();
   }

   @Override
   public void aN_() {
      int $$0 = this.n();
      fan $$1 = new fan(this.g, this.h - $$0);
      $$1.c().d().a(4);
      fat $$2 = $$1.a(fat.d());
      $$2.c().b().a(2);
      this.r = new exq(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      exd $$3 = this.m.ap().a(this.m, 0, 0, 150);
      $$3.j = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(exj.b(150, $$0x -> this.a(new fbm(this, this.f.m)), false));
      $$2.a(exj.a(150, $$0x -> this.a(new fcj(this, this.f.m, this.f.ae())), false));
      $$1.a(exf.a(ve.j, $$0x -> this.aE_()).a(), $$1.b().f().a(8));
      $$1.a();
      fan.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int n() {
      return 90;
   }

   @Override
   public void aE_() {
      this.a(this.q);
   }

   private void a(fda $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      this.k.a(0.0F, 1.0F);
      $$0.a(0, 0, this.g, this.h, -1877995504);
   }

   private void D() {
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
