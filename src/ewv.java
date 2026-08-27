import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class ewv extends eyk {
   private static final tm a = tm.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fog k = new fog(eyp.b);
   private final eth l;
   private final eqz m;
   private final boolean n;
   private boolean o;
   private float p;
   private final Runnable q;
   @Nullable
   private etb s;

   public ewv(eqz $$0, Runnable $$1) {
      super(tm.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.q = $$1;
      this.l = new eth(true);
      this.n = eqv.O().aV().a();
   }

   @Override
   public void aI_() {
      int $$0 = this.l();
      evx $$1 = new evx(this.g, this.h - $$0);
      $$1.c().d().a(4);
      ewd $$2 = $$1.a(ewd.d());
      $$2.c().b().a(2);
      this.s = new etb(this.g - 16, this.e, this.i);
      $$2.a(this.s, $$0x -> $$0x.e(16));
      eso $$3 = this.m.ao().a(this.m, 0, 0, 150);
      $$3.i = this.n;
      $$2.a($$3);
      if (this.n) {
         this.c($$3);
      }

      $$2.a(esu.b(150, $$0x -> this.a(new eww(this, this.f.m)), false));
      $$2.a(esu.a(150, $$0x -> this.a(new ext(this, this.f.m, this.f.ae())), false));
      $$1.a(esq.a(tl.j, $$0x -> this.az_()).a(), $$1.b().f().a(8));
      $$1.a();
      evx.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int l() {
      return 90;
   }

   @Override
   public void az_() {
      this.a(this.q);
   }

   private void a(eyk $$0) {
      this.a(() -> this.f.a($$0));
   }

   private void a(Runnable $$0) {
      this.m.ae = false;
      this.m.ar();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D();
      this.l.a($$0, this.g, 1.0F);
      if (this.s != null) {
         this.s.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
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
