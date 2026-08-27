import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cam extends boa {
   protected static final int bX = 6000;
   private int bV;
   @Nullable
   private UUID bW;

   protected cam(bol<? extends cam> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.n, 16.0F);
      this.a(eic.o, -1.0F);
   }

   @Override
   protected void aa() {
      if (this.h() != 0) {
         this.bV = 0;
      }

      super.aa();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.h() != 0) {
         this.bV = 0;
      }

      if (this.bV > 0) {
         this.bV--;
         if (this.bV % 10 == 0) {
            double $$0 = this.af.k() * 0.02;
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            this.dJ().a(kb.O, this.d(1.0), this.dr() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bV = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return $$1.a_($$0.d()).a(czh.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("InLove", this.bV);
      if (this.bW != null) {
         $$0.a("LoveCause", this.bW);
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.bV = $$0.h("InLove");
      this.bW = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bol<? extends cam> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      boolean $$5 = bpb.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(aue.bP) && $$5;
   }

   protected static boolean a(cvh $$0, ib $$1) {
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
   public int ed() {
      return 1 + this.dJ().z.a(3);
   }

   public boolean o(cpq $$0) {
      return $$0.a(cpt.pv);
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.h();
         if (!this.dJ().B && $$3 == 0 && this.gm()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bml.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bml.a(this.dJ().B);
         }

         if (this.dJ().B) {
            return bml.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cia $$0, bmk $$1, cpq $$2) {
      if (!$$0.fW().d) {
         $$2.h(1);
      }
   }

   public boolean gm() {
      return this.bV <= 0;
   }

   public void g(@Nullable cia $$0) {
      this.bV = 600;
      if ($$0 != null) {
         this.bW = $$0.ct();
      }

      this.dJ().a(this, (byte)18);
   }

   public void t(int $$0) {
      this.bV = $$0;
   }

   public int gn() {
      return this.bV;
   }

   @Nullable
   public apb go() {
      if (this.bW == null) {
         return null;
      } else {
         cia $$0 = this.dJ().b(this.bW);
         return $$0 instanceof apb ? (apb)$$0 : null;
      }
   }

   public boolean gp() {
      return this.bV > 0;
   }

   public void gq() {
      this.bV = 0;
   }

   public boolean a(cam $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gp() && $$0.gp();
      }
   }

   public void a(apa $$0, cam $$1) {
      boa $$2 = this.a($$0, (boa)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.do(), this.dq(), this.du(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(apa $$0, cam $$1, @Nullable boa $$2) {
      Optional.ofNullable(this.go()).or(() -> Optional.ofNullable($$1.go())).ifPresent($$2x -> {
         $$2x.a(atz.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gq();
      $$1.gq();
      $$0.a(this, (byte)18);
      if ($$0.Z().b(cwa.f)) {
         $$0.b(new bon($$0, this.do(), this.dq(), this.du(), this.ef().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            this.dJ().a(kb.O, this.d(1.0), this.dr() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
