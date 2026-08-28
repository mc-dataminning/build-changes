import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fli extends fmy {
   private static final xl a = xl.c("accessibility.onboarding.screen.title");
   private static final xl b = xl.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fhq r;
   private final ffe s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private fhk y;
   @Nullable
   private fgx z;
   private final fkm A = new fkm(this, this.m(), 33);

   public fli(ffe $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new fhq(true);
      this.u = ffa.Q().aX().a();
   }

   @Override
   public void aN_() {
      fkq $$0 = this.A.c(fkq.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new fhk(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(fhd.b(150, $$0x -> this.a(new flj(this, this.m.m)), false));
      $$0.a(fhd.a(150, $$0x -> this.a(new fmh(this, this.m.m, this.m.ag())), false));
      this.A.b(fgz.a(xk.j, $$0x -> this.d()).a());
      this.A.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.y != null) {
         this.y.b(this.n);
      }

      this.A.a();
   }

   @Override
   protected void aD_() {
      if (this.u && this.z != null) {
         this.b(this.z);
      } else {
         super.aD_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.x);
   }

   private void a(fmy $$0) {
      this.a(() -> this.m.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.ad = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.r.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fgm $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, 0.0F);
   }

   private void C() {
      if (!this.v && this.u) {
         if (this.w < 40.0F) {
            this.w++;
         } else if (this.m.aB()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.v = true;
         }
      }
   }
}
