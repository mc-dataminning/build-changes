import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class doe extends dnd implements boh, euq.a {
   private static final int c = 20;
   private csd d = csd.i;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public doe(im $$0, dpy $$1) {
      super(dnf.e, $$0, $$1);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = csd.a($$1, (uv)$$0.p("RecordItem")).orElse(csd.i);
      } else {
         this.d = csd.i;
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (!this.f().d()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean j() {
      return !this.f().d() && this.h;
   }

   private void a(@Nullable bql $$0, boolean $$1) {
      if (this.o.a_(this.az_()) == this.n()) {
         this.o.a(this.az_(), this.n().a(dgy.b, Boolean.valueOf($$1)), 2);
         this.o.a(dur.c, this.az_(), dur.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.az_(), this.n().b());
      this.o.a(null, 1010, this.az_(), cry.a(this.f().f()));
      this.e();
   }

   private void t() {
      this.h = false;
      this.o.a(dur.F, this.az_(), dur.a.a(this.n()));
      this.o.a(this.az_(), this.n().b());
      this.o.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(czu $$0, im $$1, dpy $$2) {
      this.e++;
      if (this.j() && this.f().f() instanceof csw $$3) {
         if (this.a($$3)) {
            this.t();
         } else if (this.v()) {
            this.e = 0;
            $$0.a(dur.E, $$1, dur.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(csw $$0) {
      return this.f >= this.g + (long)$$0.k() + 20L;
   }

   private boolean v() {
      return this.e >= 20;
   }

   @Override
   public csd f() {
      return this.d;
   }

   @Override
   public csd c(int $$0) {
      csd $$1 = this.d;
      this.d = csd.i;
      if (!$$1.d()) {
         this.a(null, false);
         this.t();
      }

      return $$1;
   }

   @Override
   public void a(csd $$0) {
      if ($$0.a(avw.aq) && this.o != null) {
         this.d = $$0;
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
   public dnd u() {
      return this;
   }

   @Override
   public boolean b(int $$0, csd $$1) {
      return $$1.a(avw.aq) && this.a($$0).d();
   }

   @Override
   public boolean a(boj $$0, int $$1, csd $$2) {
      return $$0.a_(csd::d);
   }

   private void a(czu $$0, im $$1) {
      if ($$0 instanceof aqe $$2) {
         etf $$3 = etf.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(kw.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.o != null && !this.o.B) {
         im $$0 = this.az_();
         csd $$1 = this.f();
         if (!$$1.d()) {
            this.h();
            etf $$2 = etf.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            csd $$3 = $$1.r();
            cgv $$4 = new cgv(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.o.b($$4);
         }
      }
   }

   public static void a(czu $$0, im $$1, dpy $$2, doe $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void b(csd $$0) {
      this.d = $$0;
      this.o.a(this.az_(), this.n().b());
      this.e();
   }
}
