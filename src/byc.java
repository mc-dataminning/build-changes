import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class byc extends blr {
   protected static final int bW = 6000;
   private int bU;
   @Nullable
   private UUID bV;

   protected byc(bmc<? extends byc> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.n, 16.0F);
      this.a(efk.o, -1.0F);
   }

   @Override
   protected void aa() {
      if (this.h() != 0) {
         this.bU = 0;
      }

      super.aa();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.h() != 0) {
         this.bU = 0;
      }

      if (this.bU > 0) {
         this.bU--;
         if (this.bU % 10 == 0) {
            double $$0 = this.ag.k() * 0.02;
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            this.dL().a(jx.O, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bU = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return $$1.a_($$0.d()).a(cxa.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("InLove", this.bU);
      if (this.bV != null) {
         $$0.a("LoveCause", this.bV);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.bU = $$0.h("InLove");
      this.bV = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bmc<? extends byc> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      boolean $$5 = bms.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(asi.bP) && $$5;
   }

   protected static boolean a(cta $$0, hx $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int ee() {
      return 1 + this.dL().z.a(3);
   }

   public boolean m(cng $$0) {
      return $$0.a(cnj.pv);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dL().B && $$3 == 0 && this.gg()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bkc.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bkc.a(this.dL().B);
         }

         if (this.dL().B) {
            return bkc.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cfq $$0, bkb $$1, cng $$2) {
      if (!$$0.fT().d) {
         $$2.h(1);
      }
   }

   public boolean gg() {
      return this.bU <= 0;
   }

   public void g(@Nullable cfq $$0) {
      this.bU = 600;
      if ($$0 != null) {
         this.bV = $$0.cw();
      }

      this.dL().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bU = $$0;
   }

   public int gh() {
      return this.bU;
   }

   @Nullable
   public anf gi() {
      if (this.bV == null) {
         return null;
      } else {
         cfq $$0 = this.dL().b(this.bV);
         return $$0 instanceof anf ? (anf)$$0 : null;
      }
   }

   public boolean gj() {
      return this.bU > 0;
   }

   public void gk() {
      this.bU = 0;
   }

   public boolean a(byc $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gj() && $$0.gj();
      }
   }

   public void a(ane $$0, byc $$1) {
      blr $$2 = this.a($$0, (blr)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dq(), this.ds(), this.dw(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ane $$0, byc $$1, @Nullable blr $$2) {
      Optional.ofNullable(this.gi()).or(() -> Optional.ofNullable($$1.gi())).ifPresent($$2x -> {
         $$2x.a(asd.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gk();
      $$1.gk();
      $$0.a(this, (byte)18);
      if ($$0.Z().b(ctt.f)) {
         $$0.b(new bme($$0, this.dq(), this.ds(), this.dw(), this.eg().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dL().a(jx.O, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
