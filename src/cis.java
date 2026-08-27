import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cis extends bof implements bpv {
   @Nullable
   private UUID b;
   @Nullable
   private bof c;
   private boolean d;
   private boolean e;
   protected boolean f;

   cis(bol<? extends cis> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bof $$0) {
      if ($$0 != null) {
         this.b = $$0.ct();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bof w() {
      if (this.c != null && !this.c.dE()) {
         return this.c;
      } else if (this.b != null && this.dJ() instanceof apa $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bof I() {
      return (bof)MoreObjects.firstNonNull(this.w(), this);
   }

   @Override
   protected void b(sy $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bof $$0) {
      return $$0.ct().equals(this.b);
   }

   @Override
   protected void a(sy $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void v(bof $$0) {
      super.v($$0);
      if ($$0 instanceof cis $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dqr.K, this.w());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      bof $$0 = this.w();
      if ($$0 != null) {
         for (bof $$1 : this.dJ().a(this, this.cE().b(this.dm()).g(1.0), $$0x -> !$$0x.P_() && $$0x.bt())) {
            if ($$1.cT() == $$0.cT()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      eov $$5 = new eov($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(awm.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(awm.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.M = this.dz();
      this.N = this.dB();
   }

   public void a(bof $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -awm.a($$2 * (float) (Math.PI / 180.0)) * awm.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -awm.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = awm.b($$2 * (float) (Math.PI / 180.0)) * awm.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      eov $$9 = $$0.dm();
      this.g(this.dm().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(eot $$0) {
      eot.a $$1 = $$0.c();
      if ($$1 == eot.a.c) {
         eos $$2 = (eos)$$0;
         if (!this.f) {
            cit $$3 = $$2.a().a(this);
            if ($$3 != cit.a) {
               $$3.deflect(this, $$2.a(), this.af);
               this.f = true;
               return;
            }
         }

         this.a($$2);
         this.dJ().a(dqr.J, $$0.e(), dqr.a.a(this, null));
      } else if ($$1 == eot.a.b) {
         eor $$4 = (eor)$$0;
         this.a($$4);
         ib $$5 = $$4.a();
         this.dJ().a(dqr.J, $$5, dqr.a.a(this, this.dJ().a_($$5)));
      }
   }

   protected void a(eos $$0) {
   }

   protected void a(eor $$0) {
      dme $$1 = this.dJ().a_($$0.a());
      $$1.a(this.dJ(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(awm.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(awm.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dB();
         this.M = this.dz();
         this.b(this.do(), this.dq(), this.du(), this.dz(), this.dB());
      }
   }

   protected boolean a(bof $$0) {
      if (!$$0.bs()) {
         return false;
      } else {
         bof $$1 = this.w();
         return $$1 == null || this.d || !$$1.x($$0);
      }
   }

   protected void J() {
      eov $$0 = this.dm();
      double $$1 = $$0.h();
      this.s(d(this.N, (float)(awm.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.M, (float)(awm.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return awm.i(0.2F, $$0, $$1);
   }

   @Override
   public xz<aai> df() {
      bof $$0 = this.w();
      return new aaj(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      bof $$1 = this.dJ().a($$0.p());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cwe $$0, ib $$1) {
      bof $$2 = this.w();
      return $$2 instanceof cia ? $$2.a($$0, $$1) : $$2 == null || $$0.Z().b(cwa.c);
   }

   public boolean b(cwe $$0) {
      return this.ai().a(auh.g) && $$0.Z().b(cwa.g);
   }
}
