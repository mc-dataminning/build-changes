import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dhp extends dgo implements bjm, emx {
   private static final int c = 20;
   private cmr d = cmr.f;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dhp(hx $$0, dja $$1) {
      super(dgq.e, $$0, $$1);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = cmr.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      if (!this.x().b()) {
         $$0.a("RecordItem", this.x().b(new sl()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.x().b() && this.h;
   }

   private void a(@Nullable blp $$0, boolean $$1) {
      if (this.o.a_(this.aB_()) == this.r()) {
         this.o.a(this.aB_(), this.r().a(dal.b, Boolean.valueOf($$1)), 2);
         this.o.a(dnk.c, this.aB_(), dnk.a.a($$0, this.r()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aB_(), this.r().b());
      this.o.a(null, 1010, this.aB_(), cmm.a(this.x().d()));
      this.e();
   }

   private void l() {
      this.h = false;
      this.o.a(dnk.F, this.aB_(), dnk.a.a(this.r()));
      this.o.a(this.aB_(), this.r().b());
      this.o.c(1011, this.aB_(), 0);
      this.e();
   }

   private void b(cti $$0, hx $$1, dja $$2) {
      this.e++;
      if (this.f() && this.x().d() instanceof cnj $$3) {
         if (this.a($$3)) {
            this.l();
         } else if (this.m()) {
            this.e = 0;
            $$0.a(dnk.E, $$1, dnk.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cnj $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean m() {
      return this.e >= 20;
   }

   @Override
   public cmr x() {
      return this.d;
   }

   @Override
   public cmr c(int $$0) {
      cmr $$1 = this.d;
      this.d = cmr.f;
      if (!$$1.b()) {
         this.a(null, false);
         this.l();
      }

      return $$1;
   }

   @Override
   public void b(cmr $$0) {
      if ($$0.a(asj.aq) && this.o != null) {
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
   public dgo y() {
      return this;
   }

   @Override
   public boolean b(int $$0, cmr $$1) {
      return $$1.a(asj.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bjo $$0, int $$1, cmr $$2) {
      return $$0.a_(cmr::b);
   }

   private void a(cti $$0, hx $$1) {
      if ($$0 instanceof amz $$2) {
         elm $$3 = elm.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(jx.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void k() {
      if (this.o != null && !this.o.B) {
         hx $$0 = this.aB_();
         cmr $$1 = this.x();
         if (!$$1.b()) {
            this.h();
            elm $$2 = elm.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cmr $$3 = $$1.p();
            cbo $$4 = new cbo(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(cti $$0, hx $$1, dja $$2, dhp $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cmr $$0) {
      this.d = $$0;
      this.o.a(this.aB_(), this.r().b());
      this.e();
   }
}
