import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class cqf extends cod implements efq {
   private static final int bI = 40;
   private static final int bJ = 200;
   private static final int bK = 500;
   private static final float bL = 0.3F;
   private static final float bM = 1.0F;
   private static final float bN = 1.5F;
   private static final int bO = 30;
   private static final int bP = 24;
   private static final akj<Integer> bQ = akn.a(cqf.class, akl.b);
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
   public bvw a = new bvw();
   public bvw b = new bvw();
   public bvw c = new bvw();
   public bvw d = new bvw();
   public bvw bG = new bvw();
   public bvw bH = new bvw();
   private final efe<efq.b> cj;
   private final efq.d ck;
   private efq.a cl;
   cqe cm = new cqe(this::b, Collections.emptyList());

   public cqf(bwo<? extends cod> $$0, dja $$1) {
      super($$0, $$1);
      this.ck = new cqf.a();
      this.cl = new efq.a();
      this.cj = new efe<>(new efq.b(this));
      this.by = 5;
      this.O().a(true);
      this.a(exf.m, 0.0F);
      this.a(exf.q, 8.0F);
      this.a(exf.f, 8.0F);
      this.a(exf.i, 8.0F);
      this.a(exf.o, 0.0F);
      this.a(exf.n, 0.0F);
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, $$0, this.c(bxq.n) ? 1 : 0);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bxq.n);
      }
   }

   @Override
   public boolean a(djd $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(iu $$0, djd $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(arq $$0, buu $$1) {
      return this.gs() && !$$1.a(axd.d) ? true : super.a($$0, $$1);
   }

   boolean gs() {
      return this.c(bxq.o) || this.c(bxq.n);
   }

   @Override
   protected boolean o(bwf $$0) {
      return false;
   }

   @Override
   public float fU() {
      return 5.0F;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static byj.a j() {
      return cod.gu().a(byk.s, 500.0).a(byk.v, 0.3F).a(byk.p, 1.0).a(byk.d, 1.5).a(byk.c, 30.0).a(byk.m, 24.0);
   }

   @Override
   public boolean bh() {
      return true;
   }

   @Override
   protected float fe() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awm u() {
      return !this.c(bxq.l) && !this.gs() ? this.n().b() : null;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.CS;
   }

   @Override
   protected awm l_() {
      return awn.CO;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.Dc, 10.0F, 1.0F);
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      $$0.a(this, (byte)4);
      this.a(awn.CN, 10.0F, this.ff());
      ccv.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   public int m() {
      return this.al.a(bQ);
   }

   private void gv() {
      this.al.a(bQ, this.gy());
   }

   @Override
   public void h() {
      if (this.dV() instanceof arq $$0) {
         efq.c.a($$0, this.cl, this.ck);
         if (this.ga() || this.Z()) {
            cqg.a((bxe)this);
         }
      }

      super.h();
      if (this.dV().w_()) {
         if (this.af % this.gw() == 0) {
            this.ch = 10;
            if (!this.bb()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awn.CR, this.dm(), 5.0F, this.ff(), false);
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

         switch (this.aw()) {
            case n:
               this.a(this.c);
               break;
            case o:
               this.a(this.d);
         }
      }
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("wardenBrain");
      this.ec().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.dt(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cm.a($$0, this::b);
         this.gv();
      }

      cqg.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bG.a(this.af);
      } else if ($$0 == 61) {
         this.cf = 10;
      } else if ($$0 == 62) {
         this.bH.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gw() {
      float $$0 = (float)this.m() / (float)cqd.c.a();
      return 40 - azm.d(azm.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.cg, (float)this.cf) / 10.0F;
   }

   public float K(float $$0) {
      return azm.h($$0, (float)this.ci, (float)this.ch) / 10.0F;
   }

   private void a(bvw $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azv $$1 = this.dY();
         eah $$2 = this.bt();
         if ($$2.o() != dss.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azm.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azm.b($$1, -0.7F, 0.7F);
               this.dV().a(new lp(lx.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (aq.equals($$0)) {
         switch (this.aw()) {
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
   public boolean a(dit $$0) {
      return this.gs();
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cqg.a(this, $$0);
   }

   @Override
   public bye<cqf> ec() {
      return (bye<cqf>)super.ec();
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void a(BiConsumer<efe<?>, arq> $$0) {
      if (this.dV() instanceof arq $$1) {
         $$0.accept(this.cj, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bwf $$0) {
      if ($$0 instanceof bxe $$1
         && this.dV() == $$0.dV()
         && bwm.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bwo.f
         && $$1.aq() != bwo.bG
         && !$$1.cC()
         && !$$1.eH()
         && this.dV().A_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(arq $$0, feq $$1, @Nullable bwf $$2, int $$3) {
      bvj $$4 = new bvj(bvl.G, 260, 0, false, false);
      bvk.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ale<uw> $$1 = this.dX().a(un.a);
      $$0.a("anger", cqe.a(this::b), $$1, this.cm);
      $$0.a("listener", efq.a.a, $$1, this.cl);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dX().a(un.a);
      this.cm = $$0.<cqe>a("anger", cqe.a(this::b), $$1).orElseGet(() -> new cqe(this::b, Collections.emptyList()));
      this.gv();
      this.cl = $$0.<efq.a>a("listener", efq.a.a, $$1).orElseGet(efq.a::new);
   }

   private void gx() {
      if (!this.c(bxq.l)) {
         this.a(this.n().c(), 10.0F, this.ff());
      }
   }

   public cqd n() {
      return cqd.a(this.gy());
   }

   private int gy() {
      return this.cm.b(this.f());
   }

   @Override
   public void c(bwf $$0) {
      this.cm.a($$0);
   }

   public void d(@Nullable bwf $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bwf $$0, int $$1, boolean $$2) {
      if (!this.gg() && this.b($$0)) {
         cqg.a((bxe)this);
         boolean $$3 = !(this.f() instanceof crc);
         int $$4 = this.cm.a($$0, $$1);
         if ($$0 instanceof crc && $$3 && cqd.a($$4).d()) {
            this.ec().b(cgg.p);
         }

         if ($$2) {
            this.gx();
         }
      }
   }

   public Optional<bxe> q() {
      return this.n().d() ? this.cm.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bxe f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.ec().a(cgg.aF, bau.a, 1200L);
      if ($$2 == bwn.k) {
         this.b(bxq.n);
         this.ec().a(cgg.aD, bau.a, (long)cqg.a);
         this.a(awn.CK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gg() && !this.gs()) {
         bwf $$4 = $$1.d();
         this.a($$4, cqd.c.a() + 20, false);
         if (this.bs.c(cgg.p).isEmpty() && $$4 instanceof bxe $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(bxe $$0) {
      this.ec().b(cgg.az);
      this.ec().a(cgg.p, $$0);
      this.ec().b(cgg.F);
      ccv.a(this, 200);
   }

   @Override
   public bwi e(bxq $$0) {
      bwi $$1 = super.e($$0);
      return this.gs() ? bwi.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bH() {
      return !this.gs() && super.bH();
   }

   @Override
   protected void D(bwf $$0) {
      if (!this.gg() && !this.ec().a(cgg.aI)) {
         this.ec().a(cgg.aI, bau.a, 20L);
         this.d($$0);
         cqg.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cqe t() {
      return this.cm;
   }

   @Override
   protected cgo b(dja $$0) {
      return new cgn(this, $$0) {
         @Override
         protected exe a(int $$0) {
            this.o = new exk();
            return new exe(this.o, $$0) {
               @Override
               protected float a(exa $$0, exa $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public efq.a x() {
      return this.cl;
   }

   @Override
   public efq.d gr() {
      return this.ck;
   }

   class a implements efq.d {
      private static final int b = 16;
      private final efl c = new eff(cqf.this, cqf.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public efl b() {
         return this.c;
      }

      @Override
      public axr<efh> c() {
         return axi.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<efh> $$2, efh.a $$3) {
         if (!cqf.this.gg() && !cqf.this.eH() && !cqf.this.ec().a(cgg.aJ) && !cqf.this.gs() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof bxe $$4 && !cqf.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arq $$0, iu $$1, je<efh> $$2, @Nullable bwf $$3, @Nullable bwf $$4, float $$5) {
         if (!cqf.this.eH()) {
            cqf.this.bs.a(cgg.aJ, bau.a, 40L);
            $$0.a(cqf.this, (byte)61);
            cqf.this.a(awn.Dd, 5.0F, cqf.this.ff());
            iu $$6 = $$1;
            if ($$4 != null) {
               if (cqf.this.a($$4, 30.0)) {
                  if (cqf.this.ec().a(cgg.aB)) {
                     if (cqf.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cqf.this.d($$4);
                  } else {
                     cqf.this.a($$4, 10, true);
                  }
               }

               cqf.this.ec().a(cgg.aB, bau.a, 100L);
            } else {
               cqf.this.d($$3);
            }

            if (!cqf.this.n().d()) {
               Optional<bxe> $$7 = cqf.this.cm.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cqg.a(cqf.this, $$6);
               }
            }
         }
      }
   }
}
