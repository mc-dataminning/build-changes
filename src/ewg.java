import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class ewg extends exv {
   private static final te a = te.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fni k = new fni(eya.b);
   private final esz l;
   private final eqr m;
   private final boolean n;
   private boolean o;
   private float p;
   @Nullable
   private est q;

   public ewg(eqr $$0) {
      super(te.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.l = new esz(true);
      this.n = eqn.N().aU().a();
   }

   @Override
   public void aE_() {
      int $$0 = this.l();
      evi $$1 = new evi(this.g, this.h - $$0);
      $$1.c().d().a(4);
      evo $$2 = $$1.a(evo.d());
      $$2.c().b().a(2);
      this.q = new est(this.g - 16, this.e, this.i);
      $$2.a(this.q, $$0x -> $$0x.e(16));
      esg $$3 = this.m.an().a(this.m, 0, 0, 150);
      $$3.i = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(esm.b(150, $$0x -> this.a(new ewh(this, this.f.m)), false));
      $$2.a(esm.a(150, $$0x -> this.a(new exe(this, this.f.m, this.f.ad())), false));
      $$1.a(esi.a(td.j, $$0x -> this.au_()).a(), $$1.b().f().a(8));
      $$1.a();
      evi.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int l() {
      return 90;
   }

   @Override
   public void au_() {
      this.a(new eya(true, this.l));
   }

   private void a(exv $$0) {
      this.m.ah = false;
      this.m.aq();
      Narrator.getNarrator().clear();
      this.f.a($$0);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.B();
      this.l.a($$0, this.g, 1.0F);
      if (this.q != null) {
         this.q.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.k.a(0.0F, 1.0F);
      $$0.a(0, 0, this.g, this.h, -1877995504);
   }

   private void B() {
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
