import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class crc extends cpb implements egp {
   private static final int bI = 40;
   private static final int bJ = 200;
   private static final int bK = 500;
   private static final float bL = 0.3F;
   private static final float bM = 1.0F;
   private static final float bN = 1.5F;
   private static final int bO = 30;
   private static final int bP = 24;
   private static final akn<Integer> bQ = akr.a(crc.class, akp.b);
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
   public bwm a = new bwm();
   public bwm b = new bwm();
   public bwm c = new bwm();
   public bwm d = new bwm();
   public bwm e = new bwm();
   public bwm f = new bwm();
   private final egd<egp.b> cj;
   private final egp.d ck;
   private egp.a cl;
   crb cm = new crb(this::b, Collections.emptyList());

   public crc(bxe<? extends cpb> $$0, djz $$1) {
      super($$0, $$1);
      this.ck = new crc.a();
      this.cl = new egp.a();
      this.cj = new egd<>(new egp.b(this));
      this.bA = 5;
      this.O().a(true);
      this.a(eyh.m, 0.0F);
      this.a(eyh.q, 8.0F);
      this.a(eyh.f, 8.0F);
      this.a(eyh.i, 8.0F);
      this.a(eyh.o, 0.0F);
      this.a(eyh.n, 0.0F);
   }

   @Override
   public zj<aby> a(ars $$0) {
      return new abz(this, $$0, this.c(byi.n) ? 1 : 0);
   }

   @Override
   public void a(abz $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(byi.n);
      }
   }

   @Override
   public boolean a(dkc $$0) {
      return super.a($$0) && $$0.a(this, this.an().n().a(this.dt()));
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(aru $$0, bvk $$1) {
      return this.gv() && !$$1.a(axh.d) ? true : super.a($$0, $$1);
   }

   boolean gv() {
      return this.c(byi.o) || this.c(byi.n);
   }

   @Override
   protected boolean o(bwv $$0) {
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

   public static bzb.a j() {
      return cpb.gx().a(bzc.s, 500.0).a(bzc.v, 0.3F).a(bzc.p, 1.0).a(bzc.d, 1.5).a(bzc.c, 30.0).a(bzc.m, 24.0);
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
   protected awq u() {
      return !this.c(byi.l) && !this.gv() ? this.n().b() : null;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.CS;
   }

   @Override
   protected awq l_() {
      return awr.CO;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.Dc, 10.0F, 1.0F);
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      $$0.a(this, (byte)4);
      this.a(awr.CN, 10.0F, this.ff());
      cdn.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akr.a $$0) {
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
      if (this.dV() instanceof aru $$0) {
         egp.c.a($$0, this.cl, this.ck);
         if (this.gd() || this.Z()) {
            crd.a((bxw)this);
         }
      }

      super.h();
      if (this.dV().A_()) {
         if (this.af % this.gz() == 0) {
            this.ch = 10;
            if (!this.ba()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awr.CR, this.dm(), 5.0F, this.ff(), false);
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
   protected void a(aru $$0) {
      brd $$1 = brc.a();
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

      crd.a(this);
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
      float $$0 = (float)this.m() / (float)cra.c.a();
      return 40 - azq.d(azq.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azq.h($$0, (float)this.cg, (float)this.cf) / 10.0F;
   }

   public float K(float $$0) {
      return azq.h($$0, (float)this.ci, (float)this.ch) / 10.0F;
   }

   private void a(bwm $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azz $$1 = this.dY();
         ebg $$2 = this.bs();
         if ($$2.o() != dtr.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azq.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azq.b($$1, -0.7F, 0.7F);
               this.dV().a(new lr(lz.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akn<?> $$0) {
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
   public boolean a(djs $$0) {
      return this.gv();
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return crd.a(this, $$0);
   }

   @Override
   public byw<crc> ec() {
      return (byw<crc>)super.ec();
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   public void a(BiConsumer<egd<?>, aru> $$0) {
      if (this.dV() instanceof aru $$1) {
         $$0.accept(this.cj, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bwv $$0) {
      if ($$0 instanceof bxw $$1
         && this.dV() == $$0.dV()
         && bxc.e.test($$0)
         && !this.s($$0)
         && $$1.an() != bxe.g
         && $$1.an() != bxe.bH
         && !$$1.cC()
         && !$$1.eH()
         && this.dV().E_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(aru $$0, ffs $$1, @Nullable bwv $$2, int $$3) {
      bvz $$4 = new bvz(bwb.G, 260, 0, false, false);
      bwa.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ali<va> $$1 = this.dX().a(uo.a);
      $$0.a("anger", crb.a(this::b), $$1, this.cm);
      $$0.a("listener", egp.a.a, $$1, this.cl);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      ali<va> $$1 = this.dX().a(uo.a);
      this.cm = $$0.<crb>a("anger", crb.a(this::b), $$1).orElseGet(() -> new crb(this::b, Collections.emptyList()));
      this.gy();
      this.cl = $$0.<egp.a>a("listener", egp.a.a, $$1).orElseGet(egp.a::new);
   }

   private void gA() {
      if (!this.c(byi.l)) {
         this.a(this.n().c(), 10.0F, this.ff());
      }
   }

   public cra n() {
      return cra.a(this.gB());
   }

   private int gB() {
      return this.cm.b(this.f());
   }

   @Override
   public void c(bwv $$0) {
      this.cm.a($$0);
   }

   public void d(@Nullable bwv $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bwv $$0, int $$1, boolean $$2) {
      if (!this.gj() && this.b($$0)) {
         crd.a((bxw)this);
         boolean $$3 = !(this.f() instanceof crz);
         int $$4 = this.cm.a($$0, $$1);
         if ($$0 instanceof crz && $$3 && cra.a($$4).d()) {
            this.ec().b(cgy.p);
         }

         if ($$2) {
            this.gA();
         }
      }
   }

   public Optional<bxw> q() {
      return this.n().d() ? this.cm.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bxw f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.ec().a(cgy.aF, bay.a, 1200L);
      if ($$2 == bxd.k) {
         this.b(byi.n);
         this.ec().a(cgy.aD, bay.a, (long)crd.a);
         this.a(awr.CK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gj() && !this.gv()) {
         bwv $$4 = $$1.d();
         this.a($$4, cra.c.a() + 20, false);
         if (this.bs.c(cgy.p).isEmpty() && $$4 instanceof bxw $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(bxw $$0) {
      this.ec().b(cgy.az);
      this.ec().a(cgy.p, $$0);
      this.ec().b(cgy.F);
      cdn.a(this, 200);
   }

   @Override
   public bwy e(byi $$0) {
      bwy $$1 = super.e($$0);
      return this.gv() ? bwy.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bG() {
      return !this.gv() && super.bG();
   }

   @Override
   protected void D(bwv $$0) {
      if (!this.gj() && !this.ec().a(cgy.aI)) {
         this.ec().a(cgy.aI, bay.a, 20L);
         this.d($$0);
         crd.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public crb t() {
      return this.cm;
   }

   @Override
   protected chg b(djz $$0) {
      return new chf(this, $$0) {
         @Override
         protected eyg a(int $$0) {
            this.o = new eym();
            return new eyg(this.o, $$0) {
               @Override
               protected float a(eyc $$0, eyc $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public egp.a x() {
      return this.cl;
   }

   @Override
   public egp.d gu() {
      return this.ck;
   }

   class a implements egp.d {
      private static final int b = 16;
      private final egk c = new ege(crc.this, crc.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public egk b() {
         return this.c;
      }

      @Override
      public axv<egg> c() {
         return axm.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aru $$0, iw $$1, jg<egg> $$2, egg.a $$3) {
         if (!crc.this.gj() && !crc.this.eH() && !crc.this.ec().a(cgy.aJ) && !crc.this.gv() && $$0.E_().a($$1)) {
            if ($$3.a() instanceof bxw $$4 && !crc.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aru $$0, iw $$1, jg<egg> $$2, @Nullable bwv $$3, @Nullable bwv $$4, float $$5) {
         if (!crc.this.eH()) {
            crc.this.bs.a(cgy.aJ, bay.a, 40L);
            $$0.a(crc.this, (byte)61);
            crc.this.a(awr.Dd, 5.0F, crc.this.ff());
            iw $$6 = $$1;
            if ($$4 != null) {
               if (crc.this.a($$4, 30.0)) {
                  if (crc.this.ec().a(cgy.aB)) {
                     if (crc.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     crc.this.d($$4);
                  } else {
                     crc.this.a($$4, 10, true);
                  }
               }

               crc.this.ec().a(cgy.aB, bay.a, 100L);
            } else {
               crc.this.d($$3);
            }

            if (!crc.this.n().d()) {
               Optional<bxw> $$7 = crc.this.cm.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  crd.a(crc.this, $$6);
               }
            }
         }
      }
   }
}
