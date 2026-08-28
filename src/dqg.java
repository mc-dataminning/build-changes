import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dqg extends dpf implements bqj, exa.a {
   private static final int b = 20;
   private cun c = cun.l;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dqg(iz $$0, dsa $$1) {
      super(dph.e, $$0, $$1);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cun.a($$1, (vo)$$0.p("RecordItem")).orElse(cun.l);
      } else {
         this.c = cun.l;
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

   private void a(@Nullable bss $$0, boolean $$1) {
      if (this.n.a_(this.az_()) == this.n()) {
         this.n.a(this.az_(), this.n().a(dja.b, Boolean.valueOf($$1)), 2);
         this.n.a(dwt.c, this.az_(), dwt.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.az_(), this.n().b());
      this.n.a(null, 1010, this.az_(), cui.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dwt.F, this.az_(), dwt.a.a(this.n()));
      this.n.a(this.az_(), this.n().b());
      this.n.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(dbw $$0, iz $$1, dsa $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cvi $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dwt.E, $$1, dwt.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cvi $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cun f() {
      return this.c;
   }

   @Override
   public cun c(int $$0) {
      cun $$1 = this.c;
      this.c = cun.l;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cun $$0) {
      if ($$0.a(awx.aR) && this.n != null) {
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
   public dpf v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cun $$1) {
      return $$1.a(awx.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bql $$0, int $$1, cun $$2) {
      return $$0.a_(cun::e);
   }

   private void a(dbw $$0, iz $$1) {
      if ($$0 instanceof are $$2) {
         evp $$3 = evp.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(li.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         iz $$0 = this.az_();
         cun $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            evp $$2 = evp.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cun $$3 = $$1.s();
            cjf $$4 = new cjf(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dqg $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cun $$0) {
      this.c = $$0;
      this.n.a(this.az_(), this.n().b());
      this.e();
   }
}
