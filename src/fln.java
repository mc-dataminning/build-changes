import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fln extends fnd {
   private static final xp a = xp.c("accessibility.onboarding.screen.title");
   private static final xp b = xp.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fhv r;
   private final ffj s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private fhp y;
   @Nullable
   private fhc z;
   private final fkr A = new fkr(this, this.m(), 33);

   public fln(ffj $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new fhv(true);
      this.u = fff.Q().aX().a();
   }

   @Override
   public void aM_() {
      fkv $$0 = this.A.c(fkv.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new fhp(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(fhi.b(150, $$0x -> this.a(new flo(this, this.m.m)), false));
      $$0.a(fhi.a(150, $$0x -> this.a(new fmm(this, this.m.m, this.m.ag())), false));
      this.A.b(fhe.a(xo.j, $$0x -> this.d()).a());
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
   protected void aB_() {
      if (this.u && this.z != null) {
         this.b(this.z);
      } else {
         super.aB_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.x);
   }

   private void a(fnd $$0) {
      this.a(() -> this.m.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.ad = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E();
      this.r.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fgr $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, 0.0F);
   }

   private void E() {
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
