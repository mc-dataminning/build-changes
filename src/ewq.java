import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class ewq extends eye {
   private static final tl a = tl.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final foc k = new foc(eyj.b);
   private final etb l;
   private final eqt m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private esv s;

   public ewq(eqt $$0, Runnable $$1) {
      super(tl.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new etb(true);
      this.n = eqp.O().aV().a();
   }

   @Override
   public void aH_() {
      int $$0 = this.l();
      evs $$1 = new evs(this.g, this.h - $$0);
      $$1.c().d().a(4);
      evy $$2 = $$1.a(evy.d());
      $$2.c().b().a(2);
      this.s = new esv(this.g - 16, this.e, this.i);
      $$2.a(this.s, $$0x -> $$0x.e(16));
      esi $$3 = this.m.ao().a(this.m, 0, 0, 150);
      $$3.i = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(eso.b(150, $$0x -> this.a(new ewr(this, this.f.m)), false));
      $$2.a(eso.a(150, $$0x -> this.a(new exo(this, this.f.m, this.f.ae())), false));
      $$1.a(esk.a(tk.j, $$0x -> this.az_()).a(), $$1.b().f().a(8));
      $$1.a();
      evs.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int l() {
      return 90;
   }

   @Override
   public void az_() {
      this.a(this.q);
   }

   private void a(eye $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.ar();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D();
      this.l.a($$0, this.g, 1.0F);
      if (this.s != null) {
         this.s.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
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
