import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fmw extends fon {
   private static final xe a = xe.c("accessibility.onboarding.screen.title");
   private static final xe b = xe.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fje r;
   private final fgn s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private fiy y;
   @Nullable
   private fil z;
   private final fma A = new fma(this, this.B(), 33);

   public fmw(fgn $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new fje(true);
      this.u = fgj.Q().aZ().a();
   }

   @Override
   public void aN_() {
      fme $$0 = this.A.c(fme.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new fiy(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(fir.b(150, $$0x -> this.a(new fmx(this, this.m.m)), false));
      $$0.a(fir.a(150, $$0x -> this.a(new fnv(this, this.m.m, this.m.ag())), false));
      this.A.b(fin.a(xd.j, $$0x -> this.d()).a());
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
   protected void aC_() {
      if (this.u && this.z != null) {
         this.b(this.z);
      } else {
         super.aC_();
      }
   }

   private int B() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.x);
   }

   private void a(fon $$0) {
      this.a(() -> this.m.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.af = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.r.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fia $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, 0.0F);
   }

   private void C() {
      if (!this.v && this.u) {
         if (this.w < 40.0F) {
            this.w++;
         } else if (this.m.aC()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.v = true;
         }
      }
   }
}
