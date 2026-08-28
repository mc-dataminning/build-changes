import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dqo extends dpn implements bpu, exk.a {
   private static final int b = 20;
   private cua c = cua.l;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dqo(ja $$0, dsh $$1) {
      super(dpp.e, $$0, $$1);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cua.a($$1, (uu)$$0.p("RecordItem")).orElse(cua.l);
      } else {
         this.c = cua.l;
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

   private void a(@Nullable bsd $$0, boolean $$1) {
      if (this.n.a_(this.az_()) == this.n()) {
         this.n.a(this.az_(), this.n().a(dji.b, Boolean.valueOf($$1)), 2);
         this.n.a(dxa.c, this.az_(), dxa.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.az_(), this.n().b());
      this.n.a(null, 1010, this.az_(), ctv.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dxa.F, this.az_(), dxa.a.a(this.n()));
      this.n.a(this.az_(), this.n().b());
      this.n.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(dcd $$0, ja $$1, dsh $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cuv $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dxa.E, $$1, dxa.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cuv $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cua f() {
      return this.c;
   }

   @Override
   public cua c(int $$0) {
      cua $$1 = this.c;
      this.c = cua.l;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cua $$0) {
      if ($$0.a(awd.aR) && this.n != null) {
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
   public dpn v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cua $$1) {
      return $$1.a(awd.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bpw $$0, int $$1, cua $$2) {
      return $$0.a_(cua::e);
   }

   private void a(dcd $$0, ja $$1) {
      if ($$0 instanceof aqk $$2) {
         evz $$3 = evz.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(lj.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         ja $$0 = this.az_();
         cua $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            evz $$2 = evz.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cua $$3 = $$1.s();
            cir $$4 = new cir(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, dqo $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cua $$0) {
      this.c = $$0;
      this.n.a(this.az_(), this.n().b());
      this.e();
   }
}
