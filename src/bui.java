import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bui extends bib {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected bui(bik<? extends bui> $$0, cpk $$1) {
      super($$0, $$1);
      this.a(eam.n, 16.0F);
      this.a(eam.o, -1.0F);
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
            this.dK().a(iw.M, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return $$1.a_($$0.d()).a(csl.i) ? 10.0F : $$1.v($$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bik<? extends bui> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bP) && a($$1, $$3);
   }

   protected static boolean a(com $$0, gv $$1) {
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

   public boolean m(ciw $$0) {
      return $$0.a(ciz.oI);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dK().B && $$3 == 0 && this.ga()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bgo.a;
         }

         if (this.i_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bgo.a(this.dK().B);
         }

         if (this.dK().B) {
            return bgo.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cbl $$0, bgn $$1, ciw $$2) {
      if (!$$0.fR().d) {
         $$2.h(1);
      }
   }

   public boolean ga() {
      return this.bT <= 0;
   }

   public void g(@Nullable cbl $$0) {
      this.bT = 600;
      if ($$0 != null) {
         this.bU = $$0.cv();
      }

      this.dK().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bT = $$0;
   }

   public int gb() {
      return this.bT;
   }

   @Nullable
   public akj gc() {
      if (this.bU == null) {
         return null;
      } else {
         cbl $$0 = this.dK().b(this.bU);
         return $$0 instanceof akj ? (akj)$$0 : null;
      }
   }

   public boolean gd() {
      return this.bT > 0;
   }

   public void ge() {
      this.bT = 0;
   }

   public boolean a(bui $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gd() && $$0.gd();
      }
   }

   public void a(aki $$0, bui $$1) {
      bib $$2 = this.a($$0, (bib)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dp(), this.dr(), this.dv(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aki $$0, bui $$1, @Nullable bib $$2) {
      Optional.ofNullable(this.gc()).or(() -> Optional.ofNullable($$1.gc())).ifPresent($$2x -> {
         $$2x.a(ape.P);
         ai.o.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.ge();
      $$1.ge();
      $$0.a(this, (byte)18);
      if ($$0.X().b(cpg.f)) {
         $$0.b(new bim($$0, this.dp(), this.dr(), this.dv(), this.ee().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dK().a(iw.M, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
