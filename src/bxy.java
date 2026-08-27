import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bxy extends blq {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected bxy(blz<? extends bxy> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.n, 16.0F);
      this.a(efc.o, -1.0F);
   }

   @Override
   protected void Z() {
      if (this.h() != 0) {
         this.bT = 0;
      }

      super.Z();
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
            double $$0 = this.ag.k() * 0.02;
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            this.dM().a(jx.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(hx $$0, cts $$1) {
      return $$1.a_($$0.d()).a(cws.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(blz<? extends bxy> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      boolean $$5 = bmp.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(ash.bP) && $$5;
   }

   protected static boolean a(css $$0, hx $$1) {
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
      return 1 + this.dM().z.a(3);
   }

   public boolean m(cmy $$0) {
      return $$0.a(cnb.pt);
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dM().B && $$3 == 0 && this.gf()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bkb.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bkb.a(this.dM().B);
         }

         if (this.dM().B) {
            return bkb.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cfi $$0, bka $$1, cmy $$2) {
      if (!$$0.fT().d) {
         $$2.h(1);
      }
   }

   public boolean gf() {
      return this.bT <= 0;
   }

   public void g(@Nullable cfi $$0) {
      this.bT = 600;
      if ($$0 != null) {
         this.bU = $$0.cw();
      }

      this.dM().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bT = $$0;
   }

   public int gg() {
      return this.bT;
   }

   @Nullable
   public ane gh() {
      if (this.bU == null) {
         return null;
      } else {
         cfi $$0 = this.dM().b(this.bU);
         return $$0 instanceof ane ? (ane)$$0 : null;
      }
   }

   public boolean gi() {
      return this.bT > 0;
   }

   public void gj() {
      this.bT = 0;
   }

   public boolean a(bxy $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gi() && $$0.gi();
      }
   }

   public void a(and $$0, bxy $$1) {
      blq $$2 = this.a($$0, (blq)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dr(), this.dt(), this.dx(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(and $$0, bxy $$1, @Nullable blq $$2) {
      Optional.ofNullable(this.gh()).or(() -> Optional.ofNullable($$1.gh())).ifPresent($$2x -> {
         $$2x.a(asc.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gj();
      $$1.gj();
      $$0.a(this, (byte)18);
      if ($$0.Z().b(ctl.f)) {
         $$0.b(new bmb($$0, this.dr(), this.dt(), this.dx(), this.eg().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dM().a(jx.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
