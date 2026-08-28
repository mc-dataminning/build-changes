import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class ftc extends fuk {
   private static final wo a = wo.c("accessibility.onboarding.screen.title");
   private static final wo b = wo.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private final fpj s;
   private final fln u;
   private final boolean v;
   private boolean w;
   private float x;
   private final Runnable y;
   @Nullable
   private fpd z;
   private final fsg A = new fsg(this, this.m(), 33);

   public ftc(fln $$0, Runnable $$1) {
      super(a);
      this.u = $$0;
      this.y = $$1;
      this.s = new fpj(true);
      this.v = flj.Q().aY().a();
   }

   @Override
   public void aR_() {
      fsk $$0 = this.A.c(fsk.d());
      $$0.c().b().a(4);
      this.z = $$0.a(new fpd(this.n, this.l, this.p), $$0x -> $$0x.a(8));
      if (this.u.av().a(this.u) instanceof foz $$1) {
         this.q = $$1;
         this.q.j = this.v;
         $$0.a(this.q);
      }

      $$0.a(fow.b(150, $$0x -> this.a(new fxh(this, this.m.n)), false));
      $$0.a(fow.a(150, $$0x -> this.a(new fxk(this, this.m.n, this.m.ah())), false));
      this.A.b(fos.a(wn.j, $$0x -> this.aO_()).a());
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
   protected void aF_() {
      if (this.v && this.q != null) {
         this.b(this.q);
      } else {
         super.aF_();
      }
   }

   private int m() {
      return 90;
   }

   @Override
   public void aO_() {
      this.a(true, this.y);
   }

   private void a(fuk $$0) {
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
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E();
      this.s.a($$0, this.n, 1.0F);
   }

   @Override
   protected void a(fod $$0, float $$1) {
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
