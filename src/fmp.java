import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fmp extends fnx {
   private static final wy a = wy.c("accessibility.onboarding.screen.title");
   private static final wy b = wy.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int q = 16;
   private final fix r;
   private final fgm s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private fir y;
   @Nullable
   private fie z;
   private final flt A = new flt(this, this.m(), 33);

   public fmp(fgm $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new fix(true);
      this.u = fgi.Q().aV().a();
   }

   @Override
   public void aP_() {
      flx $$0 = this.A.c(flx.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new fir(this.m, this.k, this.o), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(fik.b(150, $$0x -> this.a(new fqu(this, this.l.m)), false));
      $$0.a(fik.a(150, $$0x -> this.a(new fqx(this, this.l.m, this.l.ag())), false));
      this.A.b(fig.a(wx.j, $$0x -> this.d()).a());
      this.A.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.y != null) {
         this.y.b(this.m);
      }

      this.A.a();
   }

   @Override
   protected void aE_() {
      if (this.u && this.z != null) {
         this.b(this.z);
      } else {
         super.aE_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.x);
   }

   private void a(fnx $$0) {
      this.a(() -> this.l.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.ad = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D();
      this.r.a($$0, this.m, 1.0F);
   }

   @Override
   protected void a(fht $$0, float $$1) {
      e.a($$0, this.m, this.n, 1.0F, 0.0F);
   }

   private void D() {
      if (!this.v && this.u) {
         if (this.w < 40.0F) {
            this.w++;
         } else if (this.l.aA()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.v = true;
         }
      }
   }

   public void h() {
      if (this.z instanceof fin) {
         ((fin)this.z).a(this.s.as().c());
      }
   }
}
