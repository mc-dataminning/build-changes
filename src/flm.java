import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class flm extends fnc {
   private static final xo a = xo.c("accessibility.onboarding.screen.title");
   private static final xo b = xo.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fhu r;
   private final ffi s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private fho y;
   @Nullable
   private fhb z;
   private final fkq A = new fkq(this, this.m(), 33);

   public flm(ffi $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new fhu(true);
      this.u = ffe.Q().aX().a();
   }

   @Override
   public void aM_() {
      fku $$0 = this.A.c(fku.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new fho(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(fhh.b(150, $$0x -> this.a(new fln(this, this.m.m)), false));
      $$0.a(fhh.a(150, $$0x -> this.a(new fml(this, this.m.m, this.m.ag())), false));
      this.A.b(fhd.a(xn.j, $$0x -> this.d()).a());
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

   private void a(fnc $$0) {
      this.a(() -> this.m.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.ad = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E();
      this.r.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fgq $$0, float $$1) {
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
