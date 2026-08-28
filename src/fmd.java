import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fmd extends fnl {
   private static final wu a = wu.c("accessibility.onboarding.screen.title");
   private static final wu b = wu.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int q = 16;
   private final fil r;
   private final fga s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private fif y;
   @Nullable
   private fhs z;
   private final flh A = new flh(this, this.m(), 33);

   public fmd(fga $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new fil(true);
      this.u = ffw.Q().aV().a();
   }

   @Override
   public void aP_() {
      fll $$0 = this.A.c(fll.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new fif(this.m, this.k, this.o), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(fhy.b(150, $$0x -> this.a(new fqg(this, this.l.m)), false));
      $$0.a(fhy.a(150, $$0x -> this.a(new fqj(this, this.l.m, this.l.ag())), false));
      this.A.b(fhu.a(wt.j, $$0x -> this.d()).a());
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

   private void a(fnl $$0) {
      this.a(() -> this.l.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.ad = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D();
      this.r.a($$0, this.m, 1.0F);
   }

   @Override
   protected void a(fhh $$0, float $$1) {
      e.a($$0, this.m, this.n, 1.0F, 0.0F);
   }

   private void D() {
      if (!this.v && this.u) {
         if (this.w < 40.0F) {
            this.w++;
         } else if (this.l.ay()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.v = true;
         }
      }
   }

   public void h() {
      if (this.z instanceof fib) {
         ((fib)this.z).a(this.s.as().c());
      }
   }
}
