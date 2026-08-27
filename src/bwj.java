import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bwj extends bkd {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected bwj(bkm<? extends bwj> $$0, crs $$1) {
      super($$0, $$1);
      this.a(ecr.n, 16.0F);
      this.a(ecr.o, -1.0F);
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
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(ht $$0, crv $$1) {
      return $$1.a_($$0.d()).a(cuv.i) ? 10.0F : $$1.v($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bkm<? extends bwj> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bP) && a($$1, $$3);
   }

   protected static boolean a(cqv $$0, ht $$1) {
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

   public boolean m(clb $$0) {
      return $$0.a(cle.oI);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dL().B && $$3 == 0 && this.gf()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return biq.a;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return biq.a(this.dL().B);
         }

         if (this.dL().B) {
            return biq.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cdm $$0, bip $$1, clb $$2) {
      if (!$$0.fT().d) {
         $$2.h(1);
      }
   }

   public boolean gf() {
      return this.bT <= 0;
   }

   public void g(@Nullable cdm $$0) {
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
   public amb gh() {
      if (this.bU == null) {
         return null;
      } else {
         cdm $$0 = this.dL().b(this.bU);
         return $$0 instanceof amb ? (amb)$$0 : null;
      }
   }

   public boolean gi() {
      return this.bT > 0;
   }

   public void gj() {
      this.bT = 0;
   }

   public boolean a(bwj $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gi() && $$0.gi();
      }
   }

   public void a(ama $$0, bwj $$1) {
      bkd $$2 = this.a($$0, (bkd)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dq(), this.ds(), this.dw(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ama $$0, bwj $$1, @Nullable bkd $$2) {
      Optional.ofNullable(this.gh()).or(() -> Optional.ofNullable($$1.gh())).ifPresent($$2x -> {
         $$2x.a(aqx.P);
         al.o.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gj();
      $$1.gj();
      $$0.a(this, (byte)18);
      if ($$0.X().b(cro.f)) {
         $$0.b(new bko($$0, this.dq(), this.ds(), this.dw(), this.ef().a(7) + 1));
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
