import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class brl extends bfe {
   protected static final int bV = 6000;
   private int bT;
   @Nullable
   private UUID bU;

   protected brl(bfn<? extends brl> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.n, 16.0F);
      this.a(dxp.o, -1.0F);
   }

   @Override
   protected void W() {
      if (this.h() != 0) {
         this.bT = 0;
      }

      super.W();
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
            double $$0 = this.af.k() * 0.02;
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            this.dI().a(iv.M, this.d(1.0), this.dq() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bT = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      return $$1.a_($$0.d()).a(cpo.i) ? 10.0F : $$1.v($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("InLove", this.bT);
      if (this.bU != null) {
         $$0.a("LoveCause", this.bU);
      }
   }

   @Override
   public double bw() {
      return 0.14;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.bT = $$0.h("InLove");
      this.bU = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bfn<? extends brl> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.a_($$3.d()).a(amw.bN) && a($$1, $$3);
   }

   protected static boolean a(clp $$0, gu $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int M() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int ea() {
      return 1 + this.dI().z.a(3);
   }

   public boolean m(cfz $$0) {
      return $$0.a(cgc.oI);
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if (this.m($$2)) {
         int $$3 = this.h();
         if (!this.dI().B && $$3 == 0 && this.fZ()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bdx.a;
         }

         if (this.h_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bdx.a(this.dI().B);
         }

         if (this.dI().B) {
            return bdx.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(byo $$0, bdw $$1, cfz $$2) {
      if (!$$0.fO().d) {
         $$2.h(1);
      }
   }

   public boolean fZ() {
      return this.bT <= 0;
   }

   public void g(@Nullable byo $$0) {
      this.bT = 600;
      if ($$0 != null) {
         this.bU = $$0.ct();
      }

      this.dI().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bT = $$0;
   }

   public int ga() {
      return this.bT;
   }

   @Nullable
   public aig gb() {
      if (this.bU == null) {
         return null;
      } else {
         byo $$0 = this.dI().b(this.bU);
         return $$0 instanceof aig ? (aig)$$0 : null;
      }
   }

   public boolean gc() {
      return this.bT > 0;
   }

   public void gd() {
      this.bT = 0;
   }

   public boolean a(brl $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gc() && $$0.gc();
      }
   }

   public void a(aif $$0, brl $$1) {
      bfe $$2 = this.a($$0, (bfe)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dn(), this.dp(), this.dt(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aif $$0, brl $$1, @Nullable bfe $$2) {
      Optional.ofNullable(this.gb()).or(() -> Optional.ofNullable($$1.gb())).ifPresent($$2x -> {
         $$2x.a(amr.P);
         ai.o.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gd();
      $$1.gd();
      $$0.a(this, (byte)18);
      if ($$0.X().b(cmi.f)) {
         $$0.b(new bfp($$0, this.dn(), this.dp(), this.dt(), this.ec().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            this.dI().a(iv.M, this.d(1.0), this.dq() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
