import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class btv extends ceo implements btg {
   protected static final ajp<Byte> ca = ajt.a(btv.class, ajr.a);
   protected static final ajp<Optional<UUID>> cb = ajt.a(btv.class, ajr.r);
   private boolean cd;

   protected btv(bsj<? extends btv> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, (byte)0);
      $$0.a(cb, Optional.empty());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      $$0.a("Sitting", this.cd);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aug.a(this.cO(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.cd = $$0.q("Sitting");
      this.x(this.cd);
   }

   @Override
   public boolean a(cmh $$0) {
      return !this.fZ();
   }

   protected void w(boolean $$0) {
      lh $$1 = lj.Q;
      if (!$$0) {
         $$1 = lj.ae;
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
      return (this.ao.a(ca) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.ao.a(ca);
      if ($$0) {
         this.ao.a(ca, (byte)($$2 | 4));
      } else {
         this.ao.a(ca, (byte)($$2 & -5));
      }

      if ($$1) {
         this.u();
      }
   }

   protected void u() {
   }

   public boolean y() {
      return (this.ao.a(ca) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(ca);
      if ($$0) {
         this.ao.a(ca, (byte)($$1 | 1));
      } else {
         this.ao.a(ca, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID W_() {
      return this.ao.a(cb).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.ao.a(cb, Optional.ofNullable($$0));
   }

   public void f(cmh $$0) {
      this.b(true, true);
      this.b($$0.cz());
      if ($$0 instanceof aql $$1) {
         am.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bsy $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bsy $$0) {
      return $$0 == this.P_();
   }

   public boolean a(bsy $$0, bsy $$1) {
      return true;
   }

   @Override
   public ewy cj() {
      if (this.s()) {
         bsy $$0 = this.P_();
         if ($$0 != null) {
            return $$0.cj();
         }
      }

      return super.cj();
   }

   @Override
   public boolean s(bsd $$0) {
      if (this.s()) {
         bsy $$1 = this.P_();
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
   public void a(bqw $$0) {
      if (!this.dP().B && this.dP().ab().b(dbz.n) && this.P_() instanceof aql) {
         this.P_().a(this.eL().a());
      }

      super.a($$0);
   }

   public boolean gn() {
      return this.cd;
   }

   public void y(boolean $$0) {
      this.cd = $$0;
   }
}
