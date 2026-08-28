import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dqs extends dpq implements bpy, exs.a {
   private static final int b = 20;
   private cud c = cud.l;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dqs(ja $$0, dsl $$1) {
      super(dps.e, $$0, $$1);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cud.a($$1, (uu)$$0.p("RecordItem")).orElse(cud.l);
      } else {
         this.c = cud.l;
      }

      this.g = $$0.q("IsPlaying");
      this.f = $$0.i("RecordStartTick");
      this.e = $$0.i("TickCount");
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
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

   private void a(@Nullable bsh $$0, boolean $$1) {
      if (this.n.a_(this.az_()) == this.n()) {
         this.n.a(this.az_(), this.n().a(djl.b, Boolean.valueOf($$1)), 2);
         this.n.a(dxh.c, this.az_(), dxh.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.az_(), this.n().b());
      this.n.a(null, 1010, this.az_(), cty.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dxh.F, this.az_(), dxh.a.a(this.n()));
      this.n.a(this.az_(), this.n().b());
      this.n.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(dcg $$0, ja $$1, dsl $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cuy $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dxh.E, $$1, dxh.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cuy $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cud f() {
      return this.c;
   }

   @Override
   public cud c(int $$0) {
      cud $$1 = this.c;
      this.c = cud.l;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cud $$0) {
      if ($$0.a(awf.aR) && this.n != null) {
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
   public dpq v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cud $$1) {
      return $$1.a(awf.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bqa $$0, int $$1, cud $$2) {
      return $$0.a_(cud::e);
   }

   private void a(dcg $$0, ja $$1) {
      if ($$0 instanceof aqm $$2) {
         ewh $$3 = ewh.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(lj.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         ja $$0 = this.az_();
         cud $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            ewh $$2 = ewh.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cud $$3 = $$1.s();
            civ $$4 = new civ(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dqs $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cud $$0) {
      this.c = $$0;
      this.n.a(this.az_(), this.n().b());
      this.e();
   }
}
