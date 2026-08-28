import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class cra extends coz implements egn {
   private static final int bI = 40;
   private static final int bJ = 200;
   private static final int bK = 500;
   private static final float bL = 0.3F;
   private static final float bM = 1.0F;
   private static final float bN = 1.5F;
   private static final int bO = 30;
   private static final int bP = 24;
   private static final akl<Integer> bQ = akp.a(cra.class, akn.b);
   private static final int bR = 200;
   private static final int bS = 260;
   private static final int bT = 20;
   private static final int bU = 120;
   private static final int bV = 20;
   private static final int bW = 35;
   private static final int bX = 10;
   private static final int bY = 20;
   private static final int bZ = 100;
   private static final int ca = 20;
   private static final int cb = 30;
   private static final float cc = 4.5F;
   private static final float cd = 0.7F;
   private static final int ce = 30;
   private int cf;
   private int cg;
   private int ch;
   private int ci;
   public bwk a = new bwk();
   public bwk b = new bwk();
   public bwk c = new bwk();
   public bwk d = new bwk();
   public bwk e = new bwk();
   public bwk f = new bwk();
   private final egb<egn.b> cj;
   private final egn.d ck;
   private egn.a cl;
   cqz cm = new cqz(this::b, Collections.emptyList());

   public cra(bxc<? extends coz> $$0, djx $$1) {
      super($$0, $$1);
      this.ck = new cra.a();
      this.cl = new egn.a();
      this.cj = new egb<>(new egn.b(this));
      this.bA = 5;
      this.O().a(true);
      this.a(eyf.m, 0.0F);
      this.a(eyf.q, 8.0F);
      this.a(eyf.f, 8.0F);
      this.a(eyf.i, 8.0F);
      this.a(eyf.o, 0.0F);
      this.a(eyf.n, 0.0F);
   }

   @Override
   public zh<abw> a(arq $$0) {
      return new abx(this, $$0, this.c(byg.n) ? 1 : 0);
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(byg.n);
      }
   }

   @Override
   public boolean a(dka $$0) {
      return super.a($$0) && $$0.a(this, this.an().n().a(this.dt()));
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ars $$0, bvi $$1) {
      return this.gv() && !$$1.a(axf.d) ? true : super.a($$0, $$1);
   }

   boolean gv() {
      return this.c(byg.o) || this.c(byg.n);
   }

   @Override
   protected boolean o(bwt $$0) {
      return false;
   }

   @Override
   public float fU() {
      return 5.0F;
   }

   @Override
   protected float aT() {
      return this.X + 0.55F;
   }

   public static byz.a j() {
      return coz.gx().a(bza.s, 500.0).a(bza.v, 0.3F).a(bza.p, 1.0).a(bza.d, 1.5).a(bza.c, 30.0).a(bza.m, 24.0);
   }

   @Override
   public boolean bg() {
      return true;
   }

   @Override
   protected float fe() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awo u() {
      return !this.c(byg.l) && !this.gv() ? this.n().b() : null;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.CS;
   }

   @Override
   protected awo l_() {
      return awp.CO;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.Dc, 10.0F, 1.0F);
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      $$0.a(this, (byte)4);
      this.a(awp.CN, 10.0F, this.ff());
      cdl.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   public int m() {
      return this.al.a(bQ);
   }

   private void gy() {
      this.al.a(bQ, this.gB());
   }

   @Override
   public void h() {
      if (this.dV() instanceof ars $$0) {
         egn.c.a($$0, this.cl, this.ck);
         if (this.gd() || this.Z()) {
            crb.a((bxu)this);
         }
      }

      super.h();
      if (this.dV().A_()) {
         if (this.af % this.gz() == 0) {
            this.ch = 10;
            if (!this.ba()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awp.CR, this.dm(), 5.0F, this.ff(), false);
            }
         }

         this.cg = this.cf;
         if (this.cf > 0) {
            this.cf--;
         }

         this.ci = this.ch;
         if (this.ch > 0) {
            this.ch--;
         }

         switch (this.at()) {
            case n:
               this.a(this.c);
               break;
            case o:
               this.a(this.d);
         }
      }
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("wardenBrain");
      this.ec().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ao()) % 120 == 0) {
         a($$0, this.dt(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cm.a($$0, this::b);
         this.gy();
      }

      crb.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.e.a(this.af);
      } else if ($$0 == 61) {
         this.cf = 10;
      } else if ($$0 == 62) {
         this.f.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gz() {
      float $$0 = (float)this.m() / (float)cqy.c.a();
      return 40 - azo.d(azo.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azo.h($$0, (float)this.cg, (float)this.cf) / 10.0F;
   }

   public float K(float $$0) {
      return azo.h($$0, (float)this.ci, (float)this.ch) / 10.0F;
   }

   private void a(bwk $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azx $$1 = this.dY();
         ebe $$2 = this.bs();
         if ($$2.o() != dtp.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azo.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azo.b($$1, -0.7F, 0.7F);
               this.dV().a(new lq(ly.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      if (aq.equals($$0)) {
         switch (this.at()) {
            case n:
               this.c.a(this.af);
               break;
            case o:
               this.d.a(this.af);
               break;
            case l:
               this.a.a(this.af);
               break;
            case m:
               this.b.a(this.af);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(djq $$0) {
      return this.gv();
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return crb.a(this, $$0);
   }

   @Override
   public byu<cra> ec() {
      return (byu<cra>)super.ec();
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public void a(BiConsumer<egb<?>, ars> $$0) {
      if (this.dV() instanceof ars $$1) {
         $$0.accept(this.cj, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bwt $$0) {
      if ($$0 instanceof bxu $$1
         && this.dV() == $$0.dV()
         && bxa.e.test($$0)
         && !this.s($$0)
         && $$1.an() != bxc.g
         && $$1.an() != bxc.bH
         && !$$1.cC()
         && !$$1.eH()
         && this.dV().E_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(ars $$0, ffq $$1, @Nullable bwt $$2, int $$3) {
      bvx $$4 = new bvx(bvz.G, 260, 0, false, false);
      bvy.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      $$0.a("anger", cqz.a(this::b), $$1, this.cm);
      $$0.a("listener", egn.a.a, $$1, this.cl);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      this.cm = $$0.<cqz>a("anger", cqz.a(this::b), $$1).orElseGet(() -> new cqz(this::b, Collections.emptyList()));
      this.gy();
      this.cl = $$0.<egn.a>a("listener", egn.a.a, $$1).orElseGet(egn.a::new);
   }

   private void gA() {
      if (!this.c(byg.l)) {
         this.a(this.n().c(), 10.0F, this.ff());
      }
   }

   public cqy n() {
      return cqy.a(this.gB());
   }

   private int gB() {
      return this.cm.b(this.f());
   }

   @Override
   public void c(bwt $$0) {
      this.cm.a($$0);
   }

   public void d(@Nullable bwt $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bwt $$0, int $$1, boolean $$2) {
      if (!this.gj() && this.b($$0)) {
         crb.a((bxu)this);
         boolean $$3 = !(this.f() instanceof crx);
         int $$4 = this.cm.a($$0, $$1);
         if ($$0 instanceof crx && $$3 && cqy.a($$4).d()) {
            this.ec().b(cgw.p);
         }

         if ($$2) {
            this.gA();
         }
      }
   }

   public Optional<bxu> q() {
      return this.n().d() ? this.cm.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bxu f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.ec().a(cgw.aF, baw.a, 1200L);
      if ($$2 == bxb.k) {
         this.b(byg.n);
         this.ec().a(cgw.aD, baw.a, (long)crb.a);
         this.a(awp.CK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gj() && !this.gv()) {
         bwt $$4 = $$1.d();
         this.a($$4, cqy.c.a() + 20, false);
         if (this.bs.c(cgw.p).isEmpty() && $$4 instanceof bxu $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(bxu $$0) {
      this.ec().b(cgw.az);
      this.ec().a(cgw.p, $$0);
      this.ec().b(cgw.F);
      cdl.a(this, 200);
   }

   @Override
   public bww e(byg $$0) {
      bww $$1 = super.e($$0);
      return this.gv() ? bww.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bG() {
      return !this.gv() && super.bG();
   }

   @Override
   protected void D(bwt $$0) {
      if (!this.gj() && !this.ec().a(cgw.aI)) {
         this.ec().a(cgw.aI, baw.a, 20L);
         this.d($$0);
         crb.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cqz t() {
      return this.cm;
   }

   @Override
   protected che b(djx $$0) {
      return new chd(this, $$0) {
         @Override
         protected eye a(int $$0) {
            this.o = new eyk();
            return new eye(this.o, $$0) {
               @Override
               protected float a(eya $$0, eya $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public egn.a x() {
      return this.cl;
   }

   @Override
   public egn.d gu() {
      return this.ck;
   }

   class a implements egn.d {
      private static final int b = 16;
      private final egi c = new egc(cra.this, cra.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public egi b() {
         return this.c;
      }

      @Override
      public axt<ege> c() {
         return axk.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ars $$0, iv $$1, jf<ege> $$2, ege.a $$3) {
         if (!cra.this.gj() && !cra.this.eH() && !cra.this.ec().a(cgw.aJ) && !cra.this.gv() && $$0.E_().a($$1)) {
            if ($$3.a() instanceof bxu $$4 && !cra.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ars $$0, iv $$1, jf<ege> $$2, @Nullable bwt $$3, @Nullable bwt $$4, float $$5) {
         if (!cra.this.eH()) {
            cra.this.bs.a(cgw.aJ, baw.a, 40L);
            $$0.a(cra.this, (byte)61);
            cra.this.a(awp.Dd, 5.0F, cra.this.ff());
            iv $$6 = $$1;
            if ($$4 != null) {
               if (cra.this.a($$4, 30.0)) {
                  if (cra.this.ec().a(cgw.aB)) {
                     if (cra.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cra.this.d($$4);
                  } else {
                     cra.this.a($$4, 10, true);
                  }
               }

               cra.this.ec().a(cgw.aB, baw.a, 100L);
            } else {
               cra.this.d($$3);
            }

            if (!cra.this.n().d()) {
               Optional<bxu> $$7 = cra.this.cm.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  crb.a(cra.this, $$6);
               }
            }
         }
      }
   }
}
