import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bww extends bkq {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected bww(bkz<? extends bww> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.n, 16.0F);
      this.a(edi.o, -1.0F);
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
            this.dN().a(jw.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return $$1.a_($$0.d()).a(cvh.i) ? 10.0F : $$1.v($$0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bkz<? extends bww> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bP) && a($$1, $$3);
   }

   protected static boolean a(cri $$0, hx $$1) {
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
      return 1 + this.dN().z.a(3);
   }

   public boolean m(clo $$0) {
      return $$0.a(clr.pt);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dN().B && $$3 == 0 && this.gg()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bjb.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bjb.a(this.dN().B);
         }

         if (this.dN().B) {
            return bjb.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cdz $$0, bja $$1, clo $$2) {
      if (!$$0.fU().d) {
         $$2.h(1);
      }
   }

   public boolean gg() {
      return this.bT <= 0;
   }

   public void g(@Nullable cdz $$0) {
      this.bT = 600;
      if ($$0 != null) {
         this.bU = $$0.cw();
      }

      this.dN().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bT = $$0;
   }

   public int gh() {
      return this.bT;
   }

   @Nullable
   public amj gi() {
      if (this.bU == null) {
         return null;
      } else {
         cdz $$0 = this.dN().b(this.bU);
         return $$0 instanceof amj ? (amj)$$0 : null;
      }
   }

   public boolean gj() {
      return this.bT > 0;
   }

   public void gk() {
      this.bT = 0;
   }

   public boolean a(bww $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gj() && $$0.gj();
      }
   }

   public void a(ami $$0, bww $$1) {
      bkq $$2 = this.a($$0, (bkq)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.ds(), this.du(), this.dy(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ami $$0, bww $$1, @Nullable bkq $$2) {
      Optional.ofNullable(this.gi()).or(() -> Optional.ofNullable($$1.gi())).ifPresent($$2x -> {
         $$2x.a(arf.P);
         al.o.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gk();
      $$1.gk();
      $$0.a(this, (byte)18);
      if ($$0.Y().b(csb.f)) {
         $$0.b(new blb($$0, this.ds(), this.du(), this.dy(), this.eh().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dN().a(jw.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
