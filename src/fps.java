import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fps extends fra {
   private static final xi a = xi.c("accessibility.onboarding.screen.title");
   private static final xi b = xi.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fly s;
   private final fjm u;
   private final boolean v;
   private boolean w;
   private float x;
   private final Runnable y;
   @Nullable
   private fls z;
   private final fow A = new fow(this, this.m(), 33);

   public fps(fjm $$0, Runnable $$1) {
      super(a);
      this.u = $$0;
      this.y = $$1;
      this.s = new fly(true);
      this.v = fji.Q().aZ().a();
   }

   @Override
   public void aR_() {
      fpa $$0 = this.A.c(fpa.d());
      $$0.c().b().a(4);
      this.z = $$0.a(new fls(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      if (this.u.au().a(this.u) instanceof flo $$1) {
         this.q = $$1;
         this.q.j = this.v;
         $$0.a(this.q);
      }

      $$0.a(fll.b(150, $$0x -> this.a(new ftw(this, this.m.n)), false));
      $$0.a(fll.a(150, $$0x -> this.a(new ftz(this, this.m.n, this.m.ah())), false));
      this.A.b(flh.a(xh.j, $$0x -> this.d()).a());
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
   public void d() {
      this.a(true, this.y);
   }

   private void a(fra $$0) {
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
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D();
      this.s.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fku $$0, float $$1) {
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
