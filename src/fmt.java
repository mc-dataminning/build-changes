import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class fmt extends fob {
   private static final wz a = wz.c("accessibility.onboarding.screen.title");
   private static final wz b = wz.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int r = 16;
   private final fjb s;
   private final fgq u;
   private final boolean v;
   private boolean w;
   private float x;
   private final Runnable y;
   @Nullable
   private fiv z;
   private final flx A = new flx(this, this.m(), 33);

   public fmt(fgq $$0, Runnable $$1) {
      super(a);
      this.u = $$0;
      this.y = $$1;
      this.s = new fjb(true);
      this.v = fgm.Q().aV().a();
   }

   @Override
   public void aT_() {
      fmb $$0 = this.A.c(fmb.d());
      $$0.c().b().a(4);
      this.z = $$0.a(new fiv(this.m, this.k, this.o), $$0x -> $$0x.a(8));
      if (this.u.as().a(this.u) instanceof fir $$1) {
         this.p = $$1;
         this.p.j = this.v;
         $$0.a(this.p);
      }

      $$0.a(fio.b(150, $$0x -> this.a(new fqy(this, this.l.m)), false));
      $$0.a(fio.a(150, $$0x -> this.a(new frb(this, this.l.m, this.l.ag())), false));
      this.A.b(fik.a(wy.j, $$0x -> this.d()).a());
      this.A.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.b(this.m);
      }

      this.A.a();
   }

   @Override
   protected void aI_() {
      if (this.v && this.p != null) {
         this.b(this.p);
      } else {
         super.aI_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void d() {
      this.a(this.y);
   }

   private void a(fob $$0) {
      this.a(() -> this.l.a($$0));
   }

   private void a(Runnable $$0) {
      this.u.ad = false;
      this.u.av();
      Narrator.getNarrator().clear();
      $$0.run();
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C();
      this.s.a($$0, this.m, 1.0F);
   }

   @Override
   protected void a(fhx $$0, float $$1) {
      e.a($$0, this.m, this.n, 1.0F, 0.0F);
   }

   private void C() {
      if (!this.w && this.v) {
         if (this.x < 40.0F) {
            this.x++;
         } else if (this.l.aA()) {
            Narrator.getNarrator().say(b.getString(), true);
            this.w = true;
         }
      }
   }
}
