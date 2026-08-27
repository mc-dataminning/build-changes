import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class djy extends dix implements bln, epk {
   private static final int c = 20;
   private cpd d = cpd.h;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public djy(hz $$0, dlj $$1) {
      super(diz.e, $$0, $$1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = cpd.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.x().b()) {
         $$0.a("RecordItem", this.x().b(new sw()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.x().b() && this.h;
   }

   private void a(@Nullable bnq $$0, boolean $$1) {
      if (this.o.a_(this.aE_()) == this.r()) {
         this.o.a(this.aE_(), this.r().a(dcu.b, Boolean.valueOf($$1)), 2);
         this.o.a(dpw.c, this.aE_(), dpw.a.a($$0, this.r()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aE_(), this.r().b());
      this.o.a(null, 1010, this.aE_(), coy.a(this.x().d()));
      this.e();
   }

   private void l() {
      this.h = false;
      this.o.a(dpw.F, this.aE_(), dpw.a.a(this.r()));
      this.o.a(this.aE_(), this.r().b());
      this.o.c(1011, this.aE_(), 0);
      this.e();
   }

   private void b(cvr $$0, hz $$1, dlj $$2) {
      this.e++;
      if (this.f() && this.x().d() instanceof cpv $$3) {
         if (this.a($$3)) {
            this.l();
         } else if (this.m()) {
            this.e = 0;
            $$0.a(dpw.E, $$1, dpw.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cpv $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean m() {
      return this.e >= 20;
   }

   @Override
   public cpd x() {
      return this.d;
   }

   @Override
   public cpd c(int $$0) {
      cpd $$1 = this.d;
      this.d = cpd.h;
      if (!$$1.b()) {
         this.a(null, false);
         this.l();
      }

      return $$1;
   }

   @Override
   public void b(cpd $$0) {
      if ($$0.a(aui.aq) && this.o != null) {
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
   public dix y() {
      return this;
   }

   @Override
   public boolean b(int $$0, cpd $$1) {
      return $$1.a(aui.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(blp $$0, int $$1, cpd $$2) {
      return $$0.a_(cpd::b);
   }

   private void a(cvr $$0, hz $$1) {
      if ($$0 instanceof aow $$2) {
         enz $$3 = enz.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(jz.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void k() {
      if (this.o != null && !this.o.B) {
         hz $$0 = this.aE_();
         cpd $$1 = this.x();
         if (!$$1.b()) {
            this.h();
            enz $$2 = enz.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cpd $$3 = $$1.q();
            cdw $$4 = new cdw(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, djy $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cpd $$0) {
      this.d = $$0;
      this.o.a(this.aE_(), this.r().b());
      this.e();
   }
}
