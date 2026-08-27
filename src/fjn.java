import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fjn extends fld {
   private static final wu a = wu.c("accessibility.onboarding.screen.title");
   private static final wu b = wu.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final ffv r;
   private final fdi s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private ffp y;
   @Nullable
   private ffc z;
   private final fir A = new fir(this, this.m(), 33);

   public fjn(fdi $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new ffv(true);
      this.u = fde.Q().aZ().a();
   }

   @Override
   public void aM_() {
      fiv $$0 = this.A.c(fiv.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new ffp(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(ffi.b(150, $$0x -> this.a(new fjo(this, this.m.m)), false));
      $$0.a(ffi.a(150, $$0x -> this.a(new fkm(this, this.m.m, this.m.ag())), false));
      this.A.b(ffe.a(wt.j, $$0x -> this.d()).a());
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

   private int m() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.x);
   }

   private void a(fld $$0) {
      this.a(() -> this.m.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.ae = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.r.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fer $$0, float $$1) {
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
