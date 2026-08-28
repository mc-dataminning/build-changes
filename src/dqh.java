import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dqh extends dpg implements bqk, exb.a {
   private static final int b = 20;
   private cuo c = cuo.l;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dqh(iz $$0, dsb $$1) {
      super(dpi.e, $$0, $$1);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cuo.a($$1, (vo)$$0.p("RecordItem")).orElse(cuo.l);
      } else {
         this.c = cuo.l;
      }

      this.g = $$0.q("IsPlaying");
      this.f = $$0.i("RecordStartTick");
      this.e = $$0.i("TickCount");
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
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

   private void a(@Nullable bst $$0, boolean $$1) {
      if (this.n.a_(this.ay_()) == this.n()) {
         this.n.a(this.ay_(), this.n().a(djb.b, Boolean.valueOf($$1)), 2);
         this.n.a(dwu.c, this.ay_(), dwu.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.ay_(), this.n().b());
      this.n.a(null, 1010, this.ay_(), cuj.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dwu.F, this.ay_(), dwu.a.a(this.n()));
      this.n.a(this.ay_(), this.n().b());
      this.n.c(1011, this.ay_(), 0);
      this.e();
   }

   private void b(dbx $$0, iz $$1, dsb $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cvj $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dwu.E, $$1, dwu.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cvj $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cuo f() {
      return this.c;
   }

   @Override
   public cuo c(int $$0) {
      cuo $$1 = this.c;
      this.c = cuo.l;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cuo $$0) {
      if ($$0.a(awx.aR) && this.n != null) {
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
   public dpg v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cuo $$1) {
      return $$1.a(awx.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bqm $$0, int $$1, cuo $$2) {
      return $$0.a_(cuo::e);
   }

   private void a(dbx $$0, iz $$1) {
      if ($$0 instanceof are $$2) {
         evq $$3 = evq.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(li.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         iz $$0 = this.ay_();
         cuo $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            evq $$2 = evq.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cuo $$3 = $$1.s();
            cjg $$4 = new cjg(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dqh $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cuo $$0) {
      this.c = $$0;
      this.n.a(this.ay_(), this.n().b());
      this.e();
   }
}
