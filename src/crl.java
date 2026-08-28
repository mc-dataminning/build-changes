import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class crl extends cpk implements egz {
   private static final int bI = 40;
   private static final int bJ = 200;
   private static final int bK = 500;
   private static final float bL = 0.3F;
   private static final float bM = 1.0F;
   private static final float bN = 1.5F;
   private static final int bO = 30;
   private static final int bP = 24;
   private static final aku<Integer> bQ = aky.a(crl.class, akw.b);
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
   public bwv a = new bwv();
   public bwv b = new bwv();
   public bwv c = new bwv();
   public bwv d = new bwv();
   public bwv e = new bwv();
   public bwv f = new bwv();
   private final egn<egz.b> cj;
   private final egz.d ck;
   private egz.a cl;
   crk cm = new crk(this::b, Collections.emptyList());

   public crl(bxn<? extends cpk> $$0, dkj $$1) {
      super($$0, $$1);
      this.ck = new crl.a();
      this.cl = new egz.a();
      this.cj = new egn<>(new egz.b(this));
      this.bA = 5;
      this.O().a(true);
      this.a(eyr.m, 0.0F);
      this.a(eyr.q, 8.0F);
      this.a(eyr.f, 8.0F);
      this.a(eyr.i, 8.0F);
      this.a(eyr.o, 0.0F);
      this.a(eyr.n, 0.0F);
   }

   @Override
   public zo<acf> a(arz $$0) {
      return new acg(this, $$0, this.c(byr.n) ? 1 : 0);
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(byr.n);
      }
   }

   @Override
   public boolean a(dkm $$0) {
      return super.a($$0) && $$0.a(this, this.an().n().a(this.dt()));
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(asb $$0, bvt $$1) {
      return this.gv() && !$$1.a(axo.d) ? true : super.a($$0, $$1);
   }

   boolean gv() {
      return this.c(byr.o) || this.c(byr.n);
   }

   @Override
   protected boolean o(bxe $$0) {
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

   public static bzk.a j() {
      return cpk.gx().a(bzl.s, 500.0).a(bzl.v, 0.3F).a(bzl.p, 1.0).a(bzl.d, 1.5).a(bzl.c, 30.0).a(bzl.m, 24.0);
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
   protected awx u() {
      return !this.c(byr.l) && !this.gv() ? this.n().b() : null;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.CS;
   }

   @Override
   protected awx l_() {
      return awy.CO;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.Dc, 10.0F, 1.0F);
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      $$0.a(this, (byte)4);
      this.a(awy.CN, 10.0F, this.ff());
      cdw.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(aky.a $$0) {
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
      if (this.dV() instanceof asb $$0) {
         egz.c.a($$0, this.cl, this.ck);
         if (this.gd() || this.Z()) {
            crm.a((byf)this);
         }
      }

      super.h();
      if (this.dV().A_()) {
         if (this.af % this.gz() == 0) {
            this.ch = 10;
            if (!this.ba()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awy.CR, this.dm(), 5.0F, this.ff(), false);
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
   protected void a(asb $$0) {
      brm $$1 = brl.a();
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

      crm.a(this);
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
      float $$0 = (float)this.m() / (float)crj.c.a();
      return 40 - azz.d(azz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azz.h($$0, (float)this.cg, (float)this.cf) / 10.0F;
   }

   public float K(float $$0) {
      return azz.h($$0, (float)this.ci, (float)this.ch) / 10.0F;
   }

   private void a(bwv $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         bai $$1 = this.dY();
         ebq $$2 = this.bs();
         if ($$2.o() != dub.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azz.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azz.b($$1, -0.7F, 0.7F);
               this.dV().a(new lr(lz.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aku<?> $$0) {
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
   public boolean a(dkc $$0) {
      return this.gv();
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return crm.a(this, $$0);
   }

   @Override
   public bzf<crl> ec() {
      return (bzf<crl>)super.ec();
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   @Override
   public void a(BiConsumer<egn<?>, asb> $$0) {
      if (this.dV() instanceof asb $$1) {
         $$0.accept(this.cj, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bxe $$0) {
      if ($$0 instanceof byf $$1
         && this.dV() == $$0.dV()
         && bxl.e.test($$0)
         && !this.s($$0)
         && $$1.an() != bxn.g
         && $$1.an() != bxn.bH
         && !$$1.cC()
         && !$$1.eH()
         && this.dV().E_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(asb $$0, fgc $$1, @Nullable bxe $$2, int $$3) {
      bwi $$4 = new bwi(bwk.G, 260, 0, false, false);
      bwj.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("anger", crk.a(this::b), $$1, this.cm);
      $$0.a("listener", egz.a.a, $$1, this.cl);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      this.cm = $$0.<crk>a("anger", crk.a(this::b), $$1).orElseGet(() -> new crk(this::b, Collections.emptyList()));
      this.gy();
      this.cl = $$0.<egz.a>a("listener", egz.a.a, $$1).orElseGet(egz.a::new);
   }

   private void gA() {
      if (!this.c(byr.l)) {
         this.a(this.n().c(), 10.0F, this.ff());
      }
   }

   public crj n() {
      return crj.a(this.gB());
   }

   private int gB() {
      return this.cm.b(this.f());
   }

   @Override
   public void c(bxe $$0) {
      this.cm.a($$0);
   }

   public void d(@Nullable bxe $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bxe $$0, int $$1, boolean $$2) {
      if (!this.gj() && this.b($$0)) {
         crm.a((byf)this);
         boolean $$3 = !(this.f() instanceof csi);
         int $$4 = this.cm.a($$0, $$1);
         if ($$0 instanceof csi && $$3 && crj.a($$4).d()) {
            this.ec().b(chh.p);
         }

         if ($$2) {
            this.gA();
         }
      }
   }

   public Optional<byf> q() {
      return this.n().d() ? this.cm.a() : Optional.empty();
   }

   @Nullable
   @Override
   public byf f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.ec().a(chh.aF, bbh.a, 1200L);
      if ($$2 == bxm.k) {
         this.b(byr.n);
         this.ec().a(chh.aD, bbh.a, (long)crm.a);
         this.a(awy.CK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gj() && !this.gv()) {
         bxe $$4 = $$1.d();
         this.a($$4, crj.c.a() + 20, false);
         if (this.bs.c(chh.p).isEmpty() && $$4 instanceof byf $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(byf $$0) {
      this.ec().b(chh.az);
      this.ec().a(chh.p, $$0);
      this.ec().b(chh.F);
      cdw.a(this, 200);
   }

   @Override
   public bxh e(byr $$0) {
      bxh $$1 = super.e($$0);
      return this.gv() ? bxh.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bG() {
      return !this.gv() && super.bG();
   }

   @Override
   protected void D(bxe $$0) {
      if (!this.gj() && !this.ec().a(chh.aI)) {
         this.ec().a(chh.aI, bbh.a, 20L);
         this.d($$0);
         crm.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public crk t() {
      return this.cm;
   }

   @Override
   protected chp b(dkj $$0) {
      return new cho(this, $$0) {
         @Override
         protected eyq a(int $$0) {
            this.o = new eyw();
            return new eyq(this.o, $$0) {
               @Override
               protected float a(eym $$0, eym $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public egz.a x() {
      return this.cl;
   }

   @Override
   public egz.d gu() {
      return this.ck;
   }

   class a implements egz.d {
      private static final int b = 16;
      private final egu c = new ego(crl.this, crl.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public egu b() {
         return this.c;
      }

      @Override
      public ayc<egq> c() {
         return axt.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(asb $$0, iw $$1, jg<egq> $$2, egq.a $$3) {
         if (!crl.this.gj() && !crl.this.eH() && !crl.this.ec().a(chh.aJ) && !crl.this.gv() && $$0.E_().a($$1)) {
            if ($$3.a() instanceof byf $$4 && !crl.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(asb $$0, iw $$1, jg<egq> $$2, @Nullable bxe $$3, @Nullable bxe $$4, float $$5) {
         if (!crl.this.eH()) {
            crl.this.bs.a(chh.aJ, bbh.a, 40L);
            $$0.a(crl.this, (byte)61);
            crl.this.a(awy.Dd, 5.0F, crl.this.ff());
            iw $$6 = $$1;
            if ($$4 != null) {
               if (crl.this.a($$4, 30.0)) {
                  if (crl.this.ec().a(chh.aB)) {
                     if (crl.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     crl.this.d($$4);
                  } else {
                     crl.this.a($$4, 10, true);
                  }
               }

               crl.this.ec().a(chh.aB, bbh.a, 100L);
            } else {
               crl.this.d($$3);
            }

            if (!crl.this.n().d()) {
               Optional<byf> $$7 = crl.this.cm.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  crm.a(crl.this, $$6);
               }
            }
         }
      }
   }
}
