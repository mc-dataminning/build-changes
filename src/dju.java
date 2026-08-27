import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dju extends dit implements bll, epd {
   private static final int c = 20;
   private coz d = coz.h;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dju(hz $$0, dlf $$1) {
      super(div.e, $$0, $$1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = coz.a($$0.p("RecordItem"));
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

   private void a(@Nullable bno $$0, boolean $$1) {
      if (this.o.a_(this.aE_()) == this.r()) {
         this.o.a(this.aE_(), this.r().a(dcq.b, Boolean.valueOf($$1)), 2);
         this.o.a(dpp.c, this.aE_(), dpp.a.a($$0, this.r()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aE_(), this.r().b());
      this.o.a(null, 1010, this.aE_(), cou.a(this.x().d()));
      this.e();
   }

   private void l() {
      this.h = false;
      this.o.a(dpp.F, this.aE_(), dpp.a.a(this.r()));
      this.o.a(this.aE_(), this.r().b());
      this.o.c(1011, this.aE_(), 0);
      this.e();
   }

   private void b(cvn $$0, hz $$1, dlf $$2) {
      this.e++;
      if (this.f() && this.x().d() instanceof cpr $$3) {
         if (this.a($$3)) {
            this.l();
         } else if (this.m()) {
            this.e = 0;
            $$0.a(dpp.E, $$1, dpp.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cpr $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean m() {
      return this.e >= 20;
   }

   @Override
   public coz x() {
      return this.d;
   }

   @Override
   public coz c(int $$0) {
      coz $$1 = this.d;
      this.d = coz.h;
      if (!$$1.b()) {
         this.a(null, false);
         this.l();
      }

      return $$1;
   }

   @Override
   public void b(coz $$0) {
      if ($$0.a(auh.aq) && this.o != null) {
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
   public dit y() {
      return this;
   }

   @Override
   public boolean b(int $$0, coz $$1) {
      return $$1.a(auh.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bln $$0, int $$1, coz $$2) {
      return $$0.a_(coz::b);
   }

   private void a(cvn $$0, hz $$1) {
      if ($$0 instanceof aov $$2) {
         ens $$3 = ens.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(jz.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void k() {
      if (this.o != null && !this.o.B) {
         hz $$0 = this.aE_();
         coz $$1 = this.x();
         if (!$$1.b()) {
            this.h();
            ens $$2 = ens.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            coz $$3 = $$1.q();
            cds $$4 = new cds(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, dju $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(coz $$0) {
      this.d = $$0;
      this.o.a(this.aE_(), this.r().b());
      this.e();
   }
}
