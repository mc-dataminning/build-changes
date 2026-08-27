import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dhe extends dgd implements bjc, emh {
   private static final int c = 20;
   private cmh d = cmh.f;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dhe(hv $$0, dip $$1) {
      super(dgf.e, $$0, $$1);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = cmh.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (!this.x().b()) {
         $$0.a("RecordItem", this.x().b(new sj()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.x().b() && this.h;
   }

   private void a(@Nullable blf $$0, boolean $$1) {
      if (this.o.a_(this.aB_()) == this.r()) {
         this.o.a(this.aB_(), this.r().a(dab.b, Boolean.valueOf($$1)), 2);
         this.o.a(dmz.c, this.aB_(), dmz.a.a($$0, this.r()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aB_(), this.r().b());
      this.o.a(null, 1010, this.aB_(), cmc.a(this.x().d()));
      this.e();
   }

   private void l() {
      this.h = false;
      this.o.a(dmz.F, this.aB_(), dmz.a.a(this.r()));
      this.o.a(this.aB_(), this.r().b());
      this.o.c(1011, this.aB_(), 0);
      this.e();
   }

   private void b(csy $$0, hv $$1, dip $$2) {
      this.e++;
      if (this.f() && this.x().d() instanceof cmz $$3) {
         if (this.a($$3)) {
            this.l();
         } else if (this.m()) {
            this.e = 0;
            $$0.a(dmz.E, $$1, dmz.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cmz $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean m() {
      return this.e >= 20;
   }

   @Override
   public cmh x() {
      return this.d;
   }

   @Override
   public cmh c(int $$0) {
      cmh $$1 = this.d;
      this.d = cmh.f;
      if (!$$1.b()) {
         this.a(null, false);
         this.l();
      }

      return $$1;
   }

   @Override
   public void b(cmh $$0) {
      if ($$0.a(arz.aq) && this.o != null) {
         this.d = $$0;
         this.a(null, true);
         this.g();
      } else if ($$0.b()) {
         this.c(1);
      }
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public dgd y() {
      return this;
   }

   @Override
   public boolean b(int $$0, cmh $$1) {
      return $$1.a(arz.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bje $$0, int $$1, cmh $$2) {
      return $$0.a_(cmh::b);
   }

   private void a(csy $$0, hv $$1) {
      if ($$0 instanceof amp $$2) {
         elb $$3 = elb.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(jv.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void k() {
      if (this.o != null && !this.o.B) {
         hv $$0 = this.aB_();
         cmh $$1 = this.x();
         if (!$$1.b()) {
            this.h();
            elb $$2 = elb.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cmh $$3 = $$1.p();
            cbe $$4 = new cbe(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(csy $$0, hv $$1, dip $$2, dhe $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cmh $$0) {
      this.d = $$0;
      this.o.a(this.aB_(), this.r().b());
      this.e();
   }
}
