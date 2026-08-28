import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fqh extends frp {
   private static final xl a = xl.c("accessibility.onboarding.screen.title");
   private static final xl b = xl.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fmn s;
   private final fkb u;
   private final boolean v;
   private boolean w;
   private float x;
   private final Runnable y;
   @Nullable
   private fmh z;
   private final fpl A = new fpl(this, this.m(), 33);

   public fqh(fkb $$0, Runnable $$1) {
      super(a);
      this.u = $$0;
      this.y = $$1;
      this.s = new fmn(true);
      this.v = fjx.Q().aZ().a();
   }

   @Override
   public void aS_() {
      fpp $$0 = this.A.c(fpp.d());
      $$0.c().b().a(4);
      this.z = $$0.a(new fmh(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      if (this.u.au().a(this.u) instanceof fmd $$1) {
         this.q = $$1;
         this.q.j = this.v;
         $$0.a(this.q);
      }

      $$0.a(fma.b(150, $$0x -> this.a(new ful(this, this.m.n)), false));
      $$0.a(fma.a(150, $$0x -> this.a(new fuo(this, this.m.n, this.m.ah())), false));
      this.A.b(flw.a(xk.j, $$0x -> this.aP_()).a());
      this.A.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.b(this.n);
      }

      this.A.a();
   }

   @Override
   protected void aG_() {
      if (this.v && this.q != null) {
         this.b(this.q);
      } else {
         super.aG_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void aP_() {
      this.a(true, this.y);
   }

   private void a(frp $$0) {
      this.a(false, () -> this.m.a($$0));
   }

   private void a(boolean $$0, Runnable $$1) {
      if ($$0) {
         this.u.aw();
      }

      Narrator.getNarrator().clear();
      $$1.run();
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D();
      this.s.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(flj $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, 0.0F);
   }

   private void D() {
      if (!this.w && this.v) {
         if (this.x < 40.0F) {
            this.x++;
         } else if (this.m.aC()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.w = true;
         }
      }
   }
}
