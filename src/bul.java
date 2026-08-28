import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bul extends cfe implements btv {
   public static final int ca = 144;
   private static final int ce = 2;
   private static final int cf = 3;
   private static final int cg = 1;
   protected static final ajw<Byte> cb = aka.a(bul.class, ajy.a);
   protected static final ajw<Optional<UUID>> cc = aka.a(bul.class, ajy.r);
   private boolean ch;

   protected bul(bsx<? extends bul> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
      $$0.a(cc, Optional.empty());
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.aa_() != null) {
         $$0.a("Owner", this.aa_());
      }

      $$0.a("Sitting", this.ch);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = auq.a(this.cP(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.ch = $$0.q("Sitting");
      this.x(this.ch);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public boolean a(bsr $$0, float $$1) {
      if (this.x()) {
         if ($$1 > 10.0F) {
            this.a(true, true);
         }

         return false;
      } else {
         return super.a($$0, $$1);
      }
   }

   protected void w(boolean $$0) {
      lk $$1 = lm.Q;
      if (!$$0) {
         $$1 = lm.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dP().a($$1, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.w(true);
      } else if ($$0 == 6) {
         this.w(false);
      } else {
         super.b($$0);
      }
   }

   public boolean s() {
      return (this.ao.a(cb) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.ao.a(cb);
      if ($$0) {
         this.ao.a(cb, (byte)($$2 | 4));
      } else {
         this.ao.a(cb, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.ao.a(cb) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(cb);
      if ($$0) {
         this.ao.a(cb, (byte)($$1 | 1));
      } else {
         this.ao.a(cb, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID aa_() {
      return this.ao.a(cc).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.ao.a(cc, Optional.ofNullable($$0));
   }

   public void a(cmx $$0) {
      this.b(true, true);
      this.b($$0.cA());
      if ($$0 instanceof aqv $$1) {
         an.y.a($$1, this);
      }
   }

   @Override
   public boolean c(btn $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(btn $$0) {
      return $$0 == this.T_();
   }

   public boolean a(btn $$0, btn $$1) {
      return true;
   }

   @Override
   public exz ck() {
      if (this.s()) {
         btn $$0 = this.T_();
         if ($$0 != null) {
            return $$0.ck();
         }
      }

      return super.ck();
   }

   @Override
   public boolean s(bsr $$0) {
      if (this.s()) {
         btn $$1 = this.T_();
         if ($$0 == $$1) {
            return true;
         }

         if ($$1 != null) {
            return $$1.s($$0);
         }
      }

      return super.s($$0);
   }

   @Override
   public void a(brk $$0) {
      if (!this.dP().B && this.dP().ab().b(dcs.n) && this.T_() instanceof aqv) {
         this.T_().a(this.eM().a());
      }

      super.a($$0);
   }

   public boolean gl() {
      return this.ch;
   }

   public void y(boolean $$0) {
      this.ch = $$0;
   }

   public void gm() {
      btn $$0 = this.T_();
      if ($$0 != null) {
         this.h($$0.dp());
      }
   }

   public boolean gn() {
      btn $$0 = this.T_();
      return $$0 != null && this.g((bsr)this.T_()) >= 144.0;
   }

   private void h(jd $$0) {
      for (int $$1 = 0; $$1 < 10; $$1++) {
         int $$2 = this.ah.a(-3, 3);
         int $$3 = this.ah.a(-3, 3);
         if (Math.abs($$2) >= 2 || Math.abs($$3) >= 2) {
            int $$4 = this.ah.a(-1, 1);
            if (this.a($$0.u() + $$2, $$0.v() + $$4, $$0.w() + $$3)) {
               return;
            }
         }
      }
   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (!this.i(new jd($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dF(), this.dH());
         this.bT.n();
         return true;
      }
   }

   private boolean i(jd $$0) {
      ept $$1 = epy.b(this, $$0);
      if ($$1 != ept.c) {
         return false;
      } else {
         dtc $$2 = this.dP().a_($$0.e());
         if (!this.gp() && $$2.b() instanceof dki) {
            return false;
         } else {
            jd $$3 = $$0.b(this.dp());
            return this.dP().a(this, this.cL().a($$3));
         }
      }
   }

   public final boolean go() {
      return this.gl() || this.bS() || this.O_() || this.T_() != null && this.T_().R_();
   }

   protected boolean gp() {
      return false;
   }

   public class a extends cbf {
      public a(final double param3, final awu<brm> bul.this) {
         super(bul.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bul.this, $$1);
      }

      @Override
      public void a() {
         if (!bul.this.go() && bul.this.gn()) {
            bul.this.gm();
         }

         super.a();
      }
   }
}
