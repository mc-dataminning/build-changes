import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class don extends dnm implements bpd, eva.a {
   private static final int b = 20;
   private csz c = csz.i;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public don(in $$0, dqh $$1) {
      super(dno.e, $$0, $$1);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = csz.a($$1, (ux)$$0.p("RecordItem")).orElse(csz.i);
      } else {
         this.c = csz.i;
      }

      this.g = $$0.q("IsPlaying");
      this.f = $$0.i("RecordStartTick");
      this.e = $$0.i("TickCount");
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.f().d()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      $$0.a("IsPlaying", this.g);
      $$0.a("RecordStartTick", this.f);
      $$0.a("TickCount", this.e);
   }

   public boolean j() {
      return !this.f().d() && this.g;
   }

   private void a(@Nullable brh $$0, boolean $$1) {
      if (this.n.a_(this.az_()) == this.n()) {
         this.n.a(this.az_(), this.n().a(dhh.b, Boolean.valueOf($$1)), 2);
         this.n.a(dva.c, this.az_(), dva.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.az_(), this.n().b());
      this.n.a(null, 1010, this.az_(), csu.a(this.f().f()));
      this.e();
   }

   private void t() {
      this.g = false;
      this.n.a(dva.F, this.az_(), dva.a.a(this.n()));
      this.n.a(this.az_(), this.n().b());
      this.n.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(dad $$0, in $$1, dqh $$2) {
      this.d++;
      if (this.j() && this.f().f() instanceof cts $$3) {
         if (this.a($$3)) {
            this.t();
         } else if (this.v()) {
            this.d = 0;
            $$0.a(dva.E, $$1, dva.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cts $$0) {
      return this.e >= this.f + (long)$$0.k() + 20L;
   }

   private boolean v() {
      return this.d >= 20;
   }

   @Override
   public csz f() {
      return this.c;
   }

   @Override
   public csz c(int $$0) {
      csz $$1 = this.c;
      this.c = csz.i;
      if (!$$1.d()) {
         this.a(null, false);
         this.t();
      }

      return $$1;
   }

   @Override
   public void b(csz $$0) {
      if ($$0.a(avz.aR) && this.n != null) {
         this.c = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.d()) {
         this.c(1);
      }
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public dnm u() {
      return this;
   }

   @Override
   public boolean b(int $$0, csz $$1) {
      return $$1.a(avz.aR) && this.a($$0).d();
   }

   @Override
   public boolean a(bpf $$0, int $$1, csz $$2) {
      return $$0.a_(csz::d);
   }

   private void a(dad $$0, in $$1) {
      if ($$0 instanceof aqh $$2) {
         etp $$3 = etp.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(kx.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         in $$0 = this.az_();
         csz $$1 = this.f();
         if (!$$1.d()) {
            this.h();
            etp $$2 = etp.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            csz $$3 = $$1.r();
            chr $$4 = new chr(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dad $$0, in $$1, dqh $$2, don $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(csz $$0) {
      this.c = $$0;
      this.n.a(this.az_(), this.n().b());
      this.e();
   }
}
