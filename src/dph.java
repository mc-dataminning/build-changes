import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dph extends dog implements bpl, evv.a {
   private static final int b = 20;
   private cto c = cto.i;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dph(io $$0, drb $$1) {
      super(doi.e, $$0, $$1);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cto.a($$1, (va)$$0.p("RecordItem")).orElse(cto.i);
      } else {
         this.c = cto.i;
      }

      this.g = $$0.q("IsPlaying");
      this.f = $$0.i("RecordStartTick");
      this.e = $$0.i("TickCount");
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.f().e()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      $$0.a("IsPlaying", this.g);
      $$0.a("RecordStartTick", this.f);
      $$0.a("TickCount", this.e);
   }

   public boolean j() {
      return !this.f().e() && this.g;
   }

   private void a(@Nullable bru $$0, boolean $$1) {
      if (this.n.a_(this.az_()) == this.n()) {
         this.n.a(this.az_(), this.n().a(dib.b, Boolean.valueOf($$1)), 2);
         this.n.a(dvu.c, this.az_(), dvu.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.az_(), this.n().b());
      this.n.a(null, 1010, this.az_(), ctj.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dvu.F, this.az_(), dvu.a.a(this.n()));
      this.n.a(this.az_(), this.n().b());
      this.n.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(dax $$0, io $$1, drb $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cuj $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dvu.E, $$1, dvu.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cuj $$0) {
      return this.e >= this.f + (long)$$0.l() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cto f() {
      return this.c;
   }

   @Override
   public cto c(int $$0) {
      cto $$1 = this.c;
      this.c = cto.i;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cto $$0) {
      if ($$0.a(awe.aR) && this.n != null) {
         this.c = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.e()) {
         this.c(1);
      }
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public dog v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cto $$1) {
      return $$1.a(awe.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bpn $$0, int $$1, cto $$2) {
      return $$0.a_(cto::e);
   }

   private void a(dax $$0, io $$1) {
      if ($$0 instanceof aqm $$2) {
         euk $$3 = euk.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(ky.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         io $$0 = this.az_();
         cto $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            euk $$2 = euk.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cto $$3 = $$1.s();
            cig $$4 = new cig(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dax $$0, io $$1, drb $$2, dph $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cto $$0) {
      this.c = $$0;
      this.n.a(this.az_(), this.n().b());
      this.e();
   }
}
