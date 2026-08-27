import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class die extends dhd implements bjt, enn {
   private static final int c = 20;
   private cng d = cng.f;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public die(hx $$0, djp $$1) {
      super(dhf.e, $$0, $$1);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = cng.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      if (!this.x().b()) {
         $$0.a("RecordItem", this.x().b(new so()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.x().b() && this.h;
   }

   private void a(@Nullable blw $$0, boolean $$1) {
      if (this.o.a_(this.aE_()) == this.r()) {
         this.o.a(this.aE_(), this.r().a(dba.b, Boolean.valueOf($$1)), 2);
         this.o.a(dnz.c, this.aE_(), dnz.a.a($$0, this.r()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aE_(), this.r().b());
      this.o.a(null, 1010, this.aE_(), cnb.a(this.x().d()));
      this.e();
   }

   private void l() {
      this.h = false;
      this.o.a(dnz.F, this.aE_(), dnz.a.a(this.r()));
      this.o.a(this.aE_(), this.r().b());
      this.o.c(1011, this.aE_(), 0);
      this.e();
   }

   private void b(ctx $$0, hx $$1, djp $$2) {
      this.e++;
      if (this.f() && this.x().d() instanceof cny $$3) {
         if (this.a($$3)) {
            this.l();
         } else if (this.m()) {
            this.e = 0;
            $$0.a(dnz.E, $$1, dnz.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cny $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean m() {
      return this.e >= 20;
   }

   @Override
   public cng x() {
      return this.d;
   }

   @Override
   public cng c(int $$0) {
      cng $$1 = this.d;
      this.d = cng.f;
      if (!$$1.b()) {
         this.a(null, false);
         this.l();
      }

      return $$1;
   }

   @Override
   public void b(cng $$0) {
      if ($$0.a(asq.aq) && this.o != null) {
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
   public dhd y() {
      return this;
   }

   @Override
   public boolean b(int $$0, cng $$1) {
      return $$1.a(asq.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bjv $$0, int $$1, cng $$2) {
      return $$0.a_(cng::b);
   }

   private void a(ctx $$0, hx $$1) {
      if ($$0 instanceof ane $$2) {
         emc $$3 = emc.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(jx.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void k() {
      if (this.o != null && !this.o.B) {
         hx $$0 = this.aE_();
         cng $$1 = this.x();
         if (!$$1.b()) {
            this.h();
            emc $$2 = emc.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cng $$3 = $$1.p();
            ccb $$4 = new ccb(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(ctx $$0, hx $$1, djp $$2, die $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cng $$0) {
      this.d = $$0;
      this.o.a(this.aE_(), this.r().b());
      this.e();
   }
}
