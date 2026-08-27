import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fbk extends fcz {
   private static final vf a = vf.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fth k = new fth(fde.b);
   private final exv l;
   private final evk m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private exp r;

   public fbk(evk $$0, Runnable $$1) {
      super(vf.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new exv(true);
      this.n = evg.O().aV().a();
   }

   @Override
   public void aN_() {
      int $$0 = this.n();
      fam $$1 = new fam(this.g, this.h - $$0);
      $$1.c().d().a(4);
      fas $$2 = $$1.a(fas.d());
      $$2.c().b().a(2);
      this.r = new exp(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      exc $$3 = this.m.ap().a(this.m, 0, 0, 150);
      $$3.j = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(exi.b(150, $$0x -> this.a(new fbl(this, this.f.m)), false));
      $$2.a(exi.a(150, $$0x -> this.a(new fci(this, this.f.m, this.f.ae())), false));
      $$1.a(exe.a(ve.j, $$0x -> this.aE_()).a(), $$1.b().f().a(8));
      $$1.a();
      fam.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int n() {
      return 90;
   }

   @Override
   public void aE_() {
      this.a(this.q);
   }

   private void a(fcz $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.k.a(0.0F, 1.0F);
      $$0.a(0, 0, this.g, this.h, -1877995504);
   }

   private void C() {
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
