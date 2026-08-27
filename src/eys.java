import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class eys extends fah {
   private static final ur a = ur.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fqj k = new fqj(fam.b);
   private final evd l;
   private final esv m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private eux r;

   public eys(esv $$0, Runnable $$1) {
      super(ur.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new evd(true);
      this.n = esr.N().aU().a();
   }

   @Override
   public void aO_() {
      int $$0 = this.l();
      exu $$1 = new exu(this.g, this.h - $$0);
      $$1.c().d().a(4);
      eya $$2 = $$1.a(eya.d());
      $$2.c().b().a(2);
      this.r = new eux(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      euk $$3 = this.m.ap().a(this.m, 0, 0, 150);
      $$3.i = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(euq.b(150, $$0x -> this.a(new eyt(this, this.f.m)), false));
      $$2.a(euq.a(150, $$0x -> this.a(new ezq(this, this.f.m, this.f.ad())), false));
      $$1.a(eum.a(uq.j, $$0x -> this.aE_()).a(), $$1.b().f().a(8));
      $$1.a();
      exu.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int l() {
      return 90;
   }

   @Override
   public void aE_() {
      this.a(this.q);
   }

   private void a(fah $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
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
