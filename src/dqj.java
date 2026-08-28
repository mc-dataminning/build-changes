import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dqj extends dpi implements bqm, exd.a {
   private static final int b = 20;
   private cuq c = cuq.l;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dqj(iz $$0, dsd $$1) {
      super(dpk.e, $$0, $$1);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cuq.a($$1, (vp)$$0.p("RecordItem")).orElse(cuq.l);
      } else {
         this.c = cuq.l;
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

   private void a(@Nullable bsv $$0, boolean $$1) {
      if (this.n.a_(this.ay_()) == this.n()) {
         this.n.a(this.ay_(), this.n().a(djd.b, Boolean.valueOf($$1)), 2);
         this.n.a(dww.c, this.ay_(), dww.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.ay_(), this.n().b());
      this.n.a(null, 1010, this.ay_(), cul.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dww.F, this.ay_(), dww.a.a(this.n()));
      this.n.a(this.ay_(), this.n().b());
      this.n.c(1011, this.ay_(), 0);
      this.e();
   }

   private void b(dbz $$0, iz $$1, dsd $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cvl $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dww.E, $$1, dww.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cvl $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cuq f() {
      return this.c;
   }

   @Override
   public cuq c(int $$0) {
      cuq $$1 = this.c;
      this.c = cuq.l;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cuq $$0) {
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
   public dpi v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cuq $$1) {
      return $$1.a(awy.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bqo $$0, int $$1, cuq $$2) {
      return $$0.a_(cuq::e);
   }

   private void a(dbz $$0, iz $$1) {
      if ($$0 instanceof arf $$2) {
         evs $$3 = evs.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(li.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         iz $$0 = this.ay_();
         cuq $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            evs $$2 = evs.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cuq $$3 = $$1.s();
            cji $$4 = new cji(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dqj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cuq $$0) {
      this.c = $$0;
      this.n.a(this.ay_(), this.n().b());
      this.e();
   }
}
