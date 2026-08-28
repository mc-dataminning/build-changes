import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fsj extends ftr {
   private static final xv a = xv.c("accessibility.onboarding.screen.title");
   private static final xv b = xv.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fop s;
   private final fmd u;
   private final boolean v;
   private boolean w;
   private float x;
   private final Runnable y;
   @Nullable
   private foj z;
   private final frn A = new frn(this, this.l(), 33);

   public fsj(fmd $$0, Runnable $$1) {
      super(a);
      this.u = $$0;
      this.y = $$1;
      this.s = new fop(true);
      this.v = flz.Q().aZ().a();
   }

   @Override
   public void aT_() {
      frr $$0 = this.A.c(frr.d());
      $$0.c().b().a(4);
      this.z = $$0.a(new foj(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      if (this.u.av().a(this.u) instanceof fof $$1) {
         this.q = $$1;
         this.q.j = this.v;
         $$0.a(this.q);
      }

      $$0.a(foc.b(150, $$0x -> this.a(new fwo(this, this.m.n)), false));
      $$0.a(foc.a(150, $$0x -> this.a(new fwr(this, this.m.n, this.m.ah())), false));
      this.A.b(fny.a(xu.j, $$0x -> this.aP_()).a());
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

   private int l() {
      return 90;
   }

   @Override
   public void aP_() {
      this.a(true, this.y);
   }

   private void a(ftr $$0) {
      this.a(false, () -> this.m.a($$0));
   }

   private void a(boolean $$0, Runnable $$1) {
      if ($$0) {
         this.u.ax();
      }

      Narrator.getNarrator().clear();
      $$1.run();
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E();
      this.s.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fnl $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, 0.0F);
   }

   private void E() {
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
