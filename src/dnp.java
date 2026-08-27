import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dnp extends dmo implements bnw, etu.a {
   private static final int c = 20;
   private crs d = crs.i;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dnp(id $$0, dpi $$1) {
      super(dmq.e, $$0, $$1);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = crs.a($$1, (ul)$$0.p("RecordItem")).orElse(crs.i);
      } else {
         this.d = crs.i;
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
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

   private void a(@Nullable bqa $$0, boolean $$1) {
      if (this.o.a_(this.az_()) == this.n()) {
         this.o.a(this.az_(), this.n().a(dgj.b, Boolean.valueOf($$1)), 2);
         this.o.a(dub.c, this.az_(), dub.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.az_(), this.n().b());
      this.o.a(null, 1010, this.az_(), crn.a(this.f().f()));
      this.e();
   }

   private void t() {
      this.h = false;
      this.o.a(dub.F, this.az_(), dub.a.a(this.n()));
      this.o.a(this.az_(), this.n().b());
      this.o.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(czg $$0, id $$1, dpi $$2) {
      this.e++;
      if (this.j() && this.f().f() instanceof csk $$3) {
         if (this.a($$3)) {
            this.t();
         } else if (this.v()) {
            this.e = 0;
            $$0.a(dub.E, $$1, dub.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(csk $$0) {
      return this.f >= this.g + (long)$$0.k() + 20L;
   }

   private boolean v() {
      return this.e >= 20;
   }

   @Override
   public crs f() {
      return this.d;
   }

   @Override
   public crs c(int $$0) {
      crs $$1 = this.d;
      this.d = crs.i;
      if (!$$1.d()) {
         this.a(null, false);
         this.t();
      }

      return $$1;
   }

   @Override
   public void a(crs $$0) {
      if ($$0.a(avm.aq) && this.o != null) {
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
   public dmo u() {
      return this;
   }

   @Override
   public boolean b(int $$0, crs $$1) {
      return $$1.a(avm.aq) && this.a($$0).d();
   }

   @Override
   public boolean a(bny $$0, int $$1, crs $$2) {
      return $$0.a_(crs::d);
   }

   private void a(czg $$0, id $$1) {
      if ($$0 instanceof apu $$2) {
         esj $$3 = esj.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(kn.Y, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.o != null && !this.o.B) {
         id $$0 = this.az_();
         crs $$1 = this.f();
         if (!$$1.d()) {
            this.h();
            esj $$2 = esj.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            crs $$3 = $$1.r();
            cgk $$4 = new cgk(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.o.b($$4);
         }
      }
   }

   public static void a(czg $$0, id $$1, dpi $$2, dnp $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void b(crs $$0) {
      this.d = $$0;
      this.o.a(this.az_(), this.n().b());
      this.e();
   }
}
