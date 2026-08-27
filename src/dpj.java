import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dpj extends doi implements bpn, evx.a {
   private static final int b = 20;
   private ctq c = ctq.i;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dpj(io $$0, drd $$1) {
      super(dok.e, $$0, $$1);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = ctq.a($$1, (va)$$0.p("RecordItem")).orElse(ctq.i);
      } else {
         this.c = ctq.i;
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

   private void a(@Nullable brw $$0, boolean $$1) {
      if (this.n.a_(this.aA_()) == this.n()) {
         this.n.a(this.aA_(), this.n().a(did.b, Boolean.valueOf($$1)), 2);
         this.n.a(dvw.c, this.aA_(), dvw.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.aA_(), this.n().b());
      this.n.a(null, 1010, this.aA_(), ctl.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dvw.F, this.aA_(), dvw.a.a(this.n()));
      this.n.a(this.aA_(), this.n().b());
      this.n.c(1011, this.aA_(), 0);
      this.e();
   }

   private void b(daz $$0, io $$1, drd $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cul $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dvw.E, $$1, dvw.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cul $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public ctq f() {
      return this.c;
   }

   @Override
   public ctq c(int $$0) {
      ctq $$1 = this.c;
      this.c = ctq.i;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(ctq $$0) {
      if ($$0.a(awf.aR) && this.n != null) {
         this.c = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.e()) {
         this.c(1);
      }
   }

   @Override
   public int ai_() {
      return 1;
   }

   @Override
   public doi v() {
      return this;
   }

   @Override
   public boolean b(int $$0, ctq $$1) {
      return $$1.a(awf.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bpp $$0, int $$1, ctq $$2) {
      return $$0.a_(ctq::e);
   }

   private void a(daz $$0, io $$1) {
      if ($$0 instanceof aqn $$2) {
         eum $$3 = eum.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(ky.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         io $$0 = this.aA_();
         ctq $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            eum $$2 = eum.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            ctq $$3 = $$1.s();
            cii $$4 = new cii(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(daz $$0, io $$1, drd $$2, dpj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(ctq $$0) {
      this.c = $$0;
      this.n.a(this.aA_(), this.n().b());
      this.e();
   }
}
