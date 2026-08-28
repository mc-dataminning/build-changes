import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dqi extends dph implements bql, exc.a {
   private static final int b = 20;
   private cup c = cup.l;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dqi(iz $$0, dsc $$1) {
      super(dpj.e, $$0, $$1);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cup.a($$1, (vp)$$0.p("RecordItem")).orElse(cup.l);
      } else {
         this.c = cup.l;
      }

      this.g = $$0.q("IsPlaying");
      this.f = $$0.i("RecordStartTick");
      this.e = $$0.i("TickCount");
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
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

   private void a(@Nullable bsu $$0, boolean $$1) {
      if (this.n.a_(this.ay_()) == this.n()) {
         this.n.a(this.ay_(), this.n().a(djc.b, Boolean.valueOf($$1)), 2);
         this.n.a(dwv.c, this.ay_(), dwv.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.ay_(), this.n().b());
      this.n.a(null, 1010, this.ay_(), cuk.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dwv.F, this.ay_(), dwv.a.a(this.n()));
      this.n.a(this.ay_(), this.n().b());
      this.n.c(1011, this.ay_(), 0);
      this.e();
   }

   private void b(dby $$0, iz $$1, dsc $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cvk $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dwv.E, $$1, dwv.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cvk $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cup f() {
      return this.c;
   }

   @Override
   public cup c(int $$0) {
      cup $$1 = this.c;
      this.c = cup.l;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cup $$0) {
      if ($$0.a(awy.aR) && this.n != null) {
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
   public dph v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cup $$1) {
      return $$1.a(awy.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bqn $$0, int $$1, cup $$2) {
      return $$0.a_(cup::e);
   }

   private void a(dby $$0, iz $$1) {
      if ($$0 instanceof arf $$2) {
         evr $$3 = evr.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(li.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         iz $$0 = this.ay_();
         cup $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            evr $$2 = evr.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cup $$3 = $$1.s();
            cjh $$4 = new cjh(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dqi $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cup $$0) {
      this.c = $$0;
      this.n.a(this.ay_(), this.n().b());
      this.e();
   }
}
