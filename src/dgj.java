import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dgj extends dfi implements bis, elf {
   private static final int c = 20;
   private clo d = clo.b;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dgj(hx $$0, dhn $$1) {
      super(dfk.e, $$0, $$1);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = clo.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (!this.x().b()) {
         $$0.a("RecordItem", this.x().b(new sd()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.x().b() && this.h;
   }

   private void a(@Nullable bkv $$0, boolean $$1) {
      if (this.o.a_(this.aC_()) == this.r()) {
         this.o.a(this.aC_(), this.r().a(czh.b, Boolean.valueOf($$1)), 2);
         this.o.a(dlx.c, this.aC_(), dlx.a.a($$0, this.r()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aC_(), this.r().b());
      this.o.a(null, 1010, this.aC_(), clj.a(this.x().d()));
      this.e();
   }

   private void l() {
      this.h = false;
      this.o.a(dlx.F, this.aC_(), dlx.a.a(this.r()));
      this.o.a(this.aC_(), this.r().b());
      this.o.c(1011, this.aC_(), 0);
      this.e();
   }

   private void b(csf $$0, hx $$1, dhn $$2) {
      this.e++;
      if (this.f() && this.x().d() instanceof cmg $$3) {
         if (this.a($$3)) {
            this.l();
         } else if (this.m()) {
            this.e = 0;
            $$0.a(dlx.E, $$1, dlx.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cmg $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean m() {
      return this.e >= 20;
   }

   @Override
   public clo x() {
      return this.d;
   }

   @Override
   public clo c(int $$0) {
      clo $$1 = this.d;
      this.d = clo.b;
      if (!$$1.b()) {
         this.a(null, false);
         this.l();
      }

      return $$1;
   }

   @Override
   public void b(clo $$0) {
      if ($$0.a(ars.aq) && this.o != null) {
         this.d = $$0;
         this.a(null, true);
         this.g();
      } else if ($$0.b()) {
         this.c(1);
      }
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public dfi y() {
      return this;
   }

   @Override
   public boolean b(int $$0, clo $$1) {
      return $$1.a(ars.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(biu $$0, int $$1, clo $$2) {
      return $$0.a_(clo::b);
   }

   private void a(csf $$0, hx $$1) {
      if ($$0 instanceof ami $$2) {
         ejz $$3 = ejz.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(jw.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void k() {
      if (this.o != null && !this.o.B) {
         hx $$0 = this.aC_();
         clo $$1 = this.x();
         if (!$$1.b()) {
            this.h();
            ejz $$2 = ejz.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            clo $$3 = $$1.p();
            cas $$4 = new cas(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dgj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(clo $$0) {
      this.d = $$0;
      this.o.a(this.aC_(), this.r().b());
      this.e();
   }
}
