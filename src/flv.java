import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class flv extends fnd {
   private static final wu a = wu.c("accessibility.onboarding.screen.title");
   private static final wu b = wu.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int q = 16;
   private final fid r;
   private final ffr s;
   private final boolean u;
   private boolean v;
   private float w;
   private final Runnable x;
   @Nullable
   private fhx y;
   @Nullable
   private fhk z;
   private final fkz A = new fkz(this, this.m(), 33);

   public flv(ffr $$0, Runnable $$1) {
      super(a);
      this.s = $$0;
      this.x = $$1;
      this.r = new fid(true);
      this.u = ffn.Q().aX().a();
   }

   @Override
   public void aO_() {
      fld $$0 = this.A.c(fld.d());
      $$0.c().b().a(4);
      this.y = $$0.a(new fhx(this.m, this.k, this.o), $$0x -> $$0x.a(8));
      this.z = this.s.as().a(this.s);
      this.z.j = this.u;
      $$0.a(this.z);
      $$0.a(fhq.b(150, $$0x -> this.a(new fpy(this, this.l.m)), false));
      $$0.a(fhq.a(150, $$0x -> this.a(new fqb(this, this.l.m, this.l.ag())), false));
      this.A.b(fhm.a(wt.j, $$0x -> this.d()).a());
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
   protected void aD_() {
      if (this.u && this.z != null) {
         this.b(this.z);
      } else {
         super.aD_();
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
      this.a(() -> this.l.a($$0));
   }

   private void a(Runnable $$0) {
      this.s.ad = false;
      this.s.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E();
      this.r.a($$0, this.m, 1.0F);
   }

   @Override
   protected void a(fgz $$0, float $$1) {
      e.a($$0, this.m, this.n, 1.0F, 0.0F);
   }

   private void E() {
      if (!this.v && this.u) {
         if (this.w < 40.0F) {
            this.w++;
         } else if (this.l.aB()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.v = true;
         }
      }
   }

   public void h() {
      if (this.z instanceof fht) {
         ((fht)this.z).a(this.s.as().c());
      }
   }
}
