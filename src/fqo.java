import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fqo extends frw {
   private static final xj a = xj.c("accessibility.onboarding.screen.title");
   private static final xj b = xj.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fmu s;
   private final fki u;
   private final boolean v;
   private boolean w;
   private float x;
   private final Runnable y;
   @Nullable
   private fmo z;
   private final fps A = new fps(this, this.m(), 33);

   public fqo(fki $$0, Runnable $$1) {
      super(a);
      this.u = $$0;
      this.y = $$1;
      this.s = new fmu(true);
      this.v = fke.Q().aZ().a();
   }

   @Override
   public void aR_() {
      fpw $$0 = this.A.c(fpw.d());
      $$0.c().b().a(4);
      this.z = $$0.a(new fmo(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      if (this.u.au().a(this.u) instanceof fmk $$1) {
         this.q = $$1;
         this.q.j = this.v;
         $$0.a(this.q);
      }

      $$0.a(fmh.b(150, $$0x -> this.a(new fut(this, this.m.n)), false));
      $$0.a(fmh.a(150, $$0x -> this.a(new fuw(this, this.m.n, this.m.ah())), false));
      this.A.b(fmd.a(xi.j, $$0x -> this.aO_()).a());
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
   protected void aF_() {
      if (this.v && this.q != null) {
         this.b(this.q);
      } else {
         super.aF_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void aO_() {
      this.a(true, this.y);
   }

   private void a(frw $$0) {
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
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F();
      this.s.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(flq $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, 0.0F);
   }

   private void F() {
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
