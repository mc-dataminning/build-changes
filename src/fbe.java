import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fbe extends fct {
   private static final vd a = vd.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final ftb k = new ftb(fcy.b);
   private final exp l;
   private final eve m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private exj r;

   public fbe(eve $$0, Runnable $$1) {
      super(vd.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new exp(true);
      this.n = eva.N().aU().a();
   }

   @Override
   public void aN_() {
      int $$0 = this.n();
      fag $$1 = new fag(this.g, this.h - $$0);
      $$1.c().d().a(4);
      fam $$2 = $$1.a(fam.d());
      $$2.c().b().a(2);
      this.r = new exj(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      eww $$3 = this.m.ap().a(this.m, 0, 0, 150);
      $$3.j = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(exc.b(150, $$0x -> this.a(new fbf(this, this.f.m)), false));
      $$2.a(exc.a(150, $$0x -> this.a(new fcc(this, this.f.m, this.f.ad())), false));
      $$1.a(ewy.a(vc.j, $$0x -> this.aE_()).a(), $$1.b().f().a(8));
      $$1.a();
      fag.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int n() {
      return 90;
   }

   @Override
   public void aE_() {
      this.a(this.q);
   }

   private void a(fct $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      this.k.a(0.0F, 1.0F);
      $$0.a(0, 0, this.g, this.h, -1877995504);
   }

   private void C() {
      if (!this.o && this.n) {
         if (this.p < 40.0F) {
            this.p++;
         } else if (this.f.az()) {
            Narrator.getNarrator().say(a.getString(), true);
            this.o = true;
         }
      }
   }
}
