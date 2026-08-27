import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fan extends fcc {
   private static final vb a = vb.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fsk k = new fsk(fch.b);
   private final ewy l;
   private final euo m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private ews r;

   public fan(euo $$0, Runnable $$1) {
      super(vb.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new ewy(true);
      this.n = euk.N().aU().a();
   }

   @Override
   public void aP_() {
      int $$0 = this.l();
      ezp $$1 = new ezp(this.g, this.h - $$0);
      $$1.c().d().a(4);
      ezv $$2 = $$1.a(ezv.d());
      $$2.c().b().a(2);
      this.r = new ews(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      ewf $$3 = this.m.ap().a(this.m, 0, 0, 150);
      $$3.i = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(ewl.b(150, $$0x -> this.a(new fao(this, this.f.m)), false));
      $$2.a(ewl.a(150, $$0x -> this.a(new fbl(this, this.f.m, this.f.ad())), false));
      $$1.a(ewh.a(va.j, $$0x -> this.aF_()).a(), $$1.b().f().a(8));
      $$1.a();
      ezp.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int l() {
      return 90;
   }

   @Override
   public void aF_() {
      this.a(this.q);
   }

   private void a(fcc $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
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
