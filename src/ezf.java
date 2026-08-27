import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class ezf extends fau {
   private static final ur a = ur.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fqw k = new fqw(faz.b);
   private final evq l;
   private final eth m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private evk r;

   public ezf(eth $$0, Runnable $$1) {
      super(ur.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new evq(true);
      this.n = etd.N().aU().a();
   }

   @Override
   public void aP_() {
      int $$0 = this.l();
      eyh $$1 = new eyh(this.g, this.h - $$0);
      $$1.c().d().a(4);
      eyn $$2 = $$1.a(eyn.d());
      $$2.c().b().a(2);
      this.r = new evk(this.g - 16, this.e, this.i);
      $$2.a(this.r, $$0x -> $$0x.e(16));
      eux $$3 = this.m.ap().a(this.m, 0, 0, 150);
      $$3.i = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(evd.b(150, $$0x -> this.a(new ezg(this, this.f.m)), false));
      $$2.a(evd.a(150, $$0x -> this.a(new fad(this, this.f.m, this.f.ad())), false));
      $$1.a(euz.a(uq.j, $$0x -> this.aF_()).a(), $$1.b().f().a(8));
      $$1.a();
      eyh.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int l() {
      return 90;
   }

   @Override
   public void aF_() {
      this.a(this.q);
   }

   private void a(fau $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.as();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.l.a($$0, this.g, 1.0F);
      if (this.r != null) {
         this.r.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
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
