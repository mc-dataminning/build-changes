import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dhv extends dgu implements bjr, end {
   private static final int c = 20;
   private cmx d = cmx.f;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dhv(hx $$0, djg $$1) {
      super(dgw.e, $$0, $$1);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = cmx.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.x().b()) {
         $$0.a("RecordItem", this.x().b(new sn()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.x().b() && this.h;
   }

   private void a(@Nullable blu $$0, boolean $$1) {
      if (this.o.a_(this.aB_()) == this.r()) {
         this.o.a(this.aB_(), this.r().a(dar.b, Boolean.valueOf($$1)), 2);
         this.o.a(dnq.c, this.aB_(), dnq.a.a($$0, this.r()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aB_(), this.r().b());
      this.o.a(null, 1010, this.aB_(), cms.a(this.x().d()));
      this.e();
   }

   private void l() {
      this.h = false;
      this.o.a(dnq.F, this.aB_(), dnq.a.a(this.r()));
      this.o.a(this.aB_(), this.r().b());
      this.o.c(1011, this.aB_(), 0);
      this.e();
   }

   private void b(cto $$0, hx $$1, djg $$2) {
      this.e++;
      if (this.f() && this.x().d() instanceof cnp $$3) {
         if (this.a($$3)) {
            this.l();
         } else if (this.m()) {
            this.e = 0;
            $$0.a(dnq.E, $$1, dnq.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cnp $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean m() {
      return this.e >= 20;
   }

   @Override
   public cmx x() {
      return this.d;
   }

   @Override
   public cmx c(int $$0) {
      cmx $$1 = this.d;
      this.d = cmx.f;
      if (!$$1.b()) {
         this.a(null, false);
         this.l();
      }

      return $$1;
   }

   @Override
   public void b(cmx $$0) {
      if ($$0.a(aso.aq) && this.o != null) {
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
   public dgu y() {
      return this;
   }

   @Override
   public boolean b(int $$0, cmx $$1) {
      return $$1.a(aso.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bjt $$0, int $$1, cmx $$2) {
      return $$0.a_(cmx::b);
   }

   private void a(cto $$0, hx $$1) {
      if ($$0 instanceof and $$2) {
         els $$3 = els.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(jx.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void k() {
      if (this.o != null && !this.o.B) {
         hx $$0 = this.aB_();
         cmx $$1 = this.x();
         if (!$$1.b()) {
            this.h();
            els $$2 = els.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cmx $$3 = $$1.p();
            cbt $$4 = new cbt(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(cto $$0, hx $$1, djg $$2, dhv $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cmx $$0) {
      this.d = $$0;
      this.o.a(this.aB_(), this.r().b());
      this.e();
   }
}
