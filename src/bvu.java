import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bvu extends bjo {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected bvu(bjx<? extends bvu> $$0, cqz $$1) {
      super($$0, $$1);
      this.a(ebp.n, 16.0F);
      this.a(ebp.o, -1.0F);
   }

   @Override
   protected void X() {
      if (this.h() != 0) {
         this.bT = 0;
      }

      super.X();
   }

   @Override
   public void c_() {
      super.c_();
      if (this.h() != 0) {
         this.bT = 0;
      }

      if (this.bT > 0) {
         this.bT--;
         if (this.bT % 10 == 0) {
            double $$0 = this.ag.k() * 0.02;
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            this.dL().a(js.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(ht $$0, crc $$1) {
      return $$1.a_($$0.d()).a(cuc.i) ? 10.0F : $$1.v($$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bjx<? extends bvu> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bP) && a($$1, $$3);
   }

   protected static boolean a(cqc $$0, ht $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int ed() {
      return 1 + this.dL().z.a(3);
   }

   public boolean m(ckj $$0) {
      return $$0.a(ckm.oI);
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dL().B && $$3 == 0 && this.gf()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bib.a;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bib.a(this.dL().B);
         }

         if (this.dL().B) {
            return bib.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(ccx $$0, bia $$1, ckj $$2) {
      if (!$$0.fT().d) {
         $$2.h(1);
      }
   }

   public boolean gf() {
      return this.bT <= 0;
   }

   public void g(@Nullable ccx $$0) {
      this.bT = 600;
      if ($$0 != null) {
         this.bU = $$0.cv();
      }

      this.dL().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bT = $$0;
   }

   public int gg() {
      return this.bT;
   }

   @Nullable
   public alr gh() {
      if (this.bU == null) {
         return null;
      } else {
         ccx $$0 = this.dL().b(this.bU);
         return $$0 instanceof alr ? (alr)$$0 : null;
      }
   }

   public boolean gi() {
      return this.bT > 0;
   }

   public void gj() {
      this.bT = 0;
   }

   public boolean a(bvu $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gi() && $$0.gi();
      }
   }

   public void a(alq $$0, bvu $$1) {
      bjo $$2 = this.a($$0, (bjo)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dq(), this.ds(), this.dw(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(alq $$0, bvu $$1, @Nullable bjo $$2) {
      Optional.ofNullable(this.gh()).or(() -> Optional.ofNullable($$1.gh())).ifPresent($$2x -> {
         $$2x.a(aqn.P);
         al.o.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gj();
      $$1.gj();
      $$0.a(this, (byte)18);
      if ($$0.X().b(cqv.f)) {
         $$0.b(new bjz($$0, this.dq(), this.ds(), this.dw(), this.ef().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dL().a(js.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
