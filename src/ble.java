import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ble extends bvu implements bkr {
   protected static final afc<Byte> bT = aff.a(ble.class, afe.a);
   protected static final afc<Optional<UUID>> bU = aff.a(ble.class, afe.q);
   private boolean bW;

   protected ble(bjx<? extends ble> $$0, cqz $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, (byte)0);
      this.an.a(bU, Optional.empty());
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.bW);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = apf.a(this.cK(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.x(true);
         } catch (Throwable var4) {
            this.x(false);
         }
      }

      this.bW = $$0.q("Sitting");
      this.y(this.bW);
   }

   @Override
   public boolean a(ccx $$0) {
      return !this.fS();
   }

   protected void w(boolean $$0) {
      jq $$1 = js.M;
      if (!$$0) {
         $$1 = js.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
      return (this.an.b(bT) & 4) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 4));
      } else {
         this.an.b(bT, (byte)($$1 & -5));
      }

      this.t();
   }

   protected void t() {
   }

   public boolean y() {
      return (this.an.b(bT) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 1));
      } else {
         this.an.b(bT, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID d() {
      return this.an.b(bU).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   public void f(ccx $$0) {
      this.x(true);
      this.b($$0.cv());
      if ($$0 instanceof alr) {
         al.x.a((alr)$$0, this);
      }
   }

   @Override
   public boolean c(bkj $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bkj $$0) {
      return $$0 == this.P_();
   }

   public boolean a(bkj $$0, bkj $$1) {
      return true;
   }

   @Override
   public ejc cf() {
      if (this.s()) {
         bkj $$0 = this.P_();
         if ($$0 != null) {
            return $$0.cf();
         }
      }

      return super.cf();
   }

   @Override
   public boolean s(bjt $$0) {
      if (this.s()) {
         bkj $$1 = this.P_();
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
   public void a(bir $$0) {
      if (!this.dL().B && this.dL().X().b(cqv.m) && this.P_() instanceof alr) {
         this.P_().a(this.eJ().a());
      }

      super.a($$0);
   }

   public boolean ge() {
      return this.bW;
   }

   public void z(boolean $$0) {
      this.bW = $$0;
   }
}
