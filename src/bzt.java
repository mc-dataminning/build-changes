import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bzt extends bnj {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected bzt(bnu<? extends bzt> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.n, 16.0F);
      this.a(eha.o, -1.0F);
   }

   @Override
   protected void aa() {
      if (this.h() != 0) {
         this.bT = 0;
      }

      super.aa();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.h() != 0) {
         this.bT = 0;
      }

      if (this.bT > 0) {
         this.bT--;
         if (this.bT % 10 == 0) {
            double $$0 = this.af.k() * 0.02;
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            this.dM().a(jz.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return $$1.a_($$0.d()).a(cyq.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bnu<? extends bzt> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      boolean $$5 = bok.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(atz.bP) && $$5;
   }

   protected static boolean a(cuq $$0, hz $$1) {
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
   public int ef() {
      return 1 + this.dM().z.a(3);
   }

   public boolean m(coz $$0) {
      return $$0.a(cpc.pv);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dM().B && $$3 == 0 && this.gh()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return blu.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return blu.a(this.dM().B);
         }

         if (this.dM().B) {
            return blu.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(chh $$0, blt $$1, coz $$2) {
      if (!$$0.fU().d) {
         $$2.h(1);
      }
   }

   public boolean gh() {
      return this.bT <= 0;
   }

   public void g(@Nullable chh $$0) {
      this.bT = 600;
      if ($$0 != null) {
         this.bU = $$0.cw();
      }

      this.dM().a(this, (byte)18);
   }

   public void t(int $$0) {
      this.bT = $$0;
   }

   public int gi() {
      return this.bT;
   }

   @Nullable
   public aow gj() {
      if (this.bU == null) {
         return null;
      } else {
         chh $$0 = this.dM().b(this.bU);
         return $$0 instanceof aow ? (aow)$$0 : null;
      }
   }

   public boolean gk() {
      return this.bT > 0;
   }

   public void gl() {
      this.bT = 0;
   }

   public boolean a(bzt $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gk() && $$0.gk();
      }
   }

   public void a(aov $$0, bzt $$1) {
      bnj $$2 = this.a($$0, (bnj)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dr(), this.dt(), this.dx(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aov $$0, bzt $$1, @Nullable bnj $$2) {
      Optional.ofNullable(this.gj()).or(() -> Optional.ofNullable($$1.gj())).ifPresent($$2x -> {
         $$2x.a(atu.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gl();
      $$1.gl();
      $$0.a(this, (byte)18);
      if ($$0.Z().b(cvj.f)) {
         $$0.b(new bnw($$0, this.dr(), this.dt(), this.dx(), this.eh().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            this.dM().a(jz.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
