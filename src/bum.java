import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bum extends big {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected bum(bip<? extends bum> $$0, cpq $$1) {
      super($$0, $$1);
      this.a(eas.n, 16.0F);
      this.a(eas.o, -1.0F);
   }

   @Override
   protected void V() {
      if (this.h() != 0) {
         this.bT = 0;
      }

      super.V();
   }

   @Override
   public void b_() {
      super.b_();
      if (this.h() != 0) {
         this.bT = 0;
      }

      if (this.bT > 0) {
         this.bT--;
         if (this.bT % 10 == 0) {
            double $$0 = this.ag.k() * 0.02;
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            this.dK().a(ix.M, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return $$1.a_($$0.d()).a(csr.i) ? 10.0F : $$1.v($$0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bip<? extends bum> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bP) && a($$1, $$3);
   }

   protected static boolean a(cot $$0, gw $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int L() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int ec() {
      return 1 + this.dK().z.a(3);
   }

   public boolean m(cja $$0) {
      return $$0.a(cjd.oI);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dK().B && $$3 == 0 && this.gb()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bgt.a;
         }

         if (this.i_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bgt.a(this.dK().B);
         }

         if (this.dK().B) {
            return bgt.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cbp $$0, bgs $$1, cja $$2) {
      if (!$$0.fR().d) {
         $$2.h(1);
      }
   }

   public boolean gb() {
      return this.bT <= 0;
   }

   public void g(@Nullable cbp $$0) {
      this.bT = 600;
      if ($$0 != null) {
         this.bU = $$0.cv();
      }

      this.dK().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bT = $$0;
   }

   public int gc() {
      return this.bT;
   }

   @Nullable
   public ako gd() {
      if (this.bU == null) {
         return null;
      } else {
         cbp $$0 = this.dK().b(this.bU);
         return $$0 instanceof ako ? (ako)$$0 : null;
      }
   }

   public boolean ge() {
      return this.bT > 0;
   }

   public void gf() {
      this.bT = 0;
   }

   public boolean a(bum $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.ge() && $$0.ge();
      }
   }

   public void a(akn $$0, bum $$1) {
      big $$2 = this.a($$0, (big)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dp(), this.dr(), this.dv(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(akn $$0, bum $$1, @Nullable big $$2) {
      Optional.ofNullable(this.gd()).or(() -> Optional.ofNullable($$1.gd())).ifPresent($$2x -> {
         $$2x.a(apj.P);
         al.o.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gf();
      $$1.gf();
      $$0.a(this, (byte)18);
      if ($$0.X().b(cpm.f)) {
         $$0.b(new bir($$0, this.dp(), this.dr(), this.dv(), this.ee().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dK().a(ix.M, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
