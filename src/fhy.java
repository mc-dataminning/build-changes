import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fhy extends fjo {
   private static final wg a = wg.c("accessibility.onboarding.screen.title");
   private static final wg b = wg.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final feg o;
   private final fbt p;
   private final boolean q;
   private boolean r;
   private float s;
   private final Runnable u;
   @Nullable
   private fea v;
   @Nullable
   private fdn w;
   private final fhc x = new fhc(this, this.m(), 33);

   public fhy(fbt $$0, Runnable $$1) {
      super(a);
      this.p = $$0;
      this.u = $$1;
      this.o = new feg(true);
      this.q = fbp.Q().aY().a();
   }

   @Override
   public void aN_() {
      fhg $$0 = this.x.c(fhg.d());
      $$0.c().b().a(4);
      this.v = $$0.a(new fea(this.k, this.i, this.m), $$0x -> $$0x.a(8));
      this.w = this.p.as().a(this.p);
      this.w.j = this.q;
      $$0.a(this.w);
      $$0.a(fdt.b(150, $$0x -> this.a(new fhz(this, this.j.m)), false));
      $$0.a(fdt.a(150, $$0x -> this.a(new fix(this, this.j.m, this.j.ag())), false));
      this.x.b(fdp.a(wf.j, $$0x -> this.d()).a());
      this.x.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.v != null) {
         this.v.b(this.k);
      }

      this.x.a();
   }

   @Override
   protected void aD_() {
      if (this.q && this.w != null) {
         this.b(this.w);
      } else {
         super.aD_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.u);
   }

   private void a(fjo $$0) {
      this.a(() -> this.j.a($$0));
   }

   private void a(Runnable $$0) {
      this.p.ae = false;
      this.p.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.o.a($$0, this.k, 1.0F);
   }

   @Override
   protected void a(fdc $$0, float $$1) {
      f.a(0.0F);
   }

   private void C() {
      if (!this.r && this.q) {
         if (this.s < 40.0F) {
            this.s++;
         } else if (this.j.aC()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.r = true;
         }
      }
   }
}
