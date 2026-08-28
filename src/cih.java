import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cih extends cjq implements bto, cju {
   private static final ajp<Integer> b = ajt.a(cih.class, ajr.b);
   private static final ajp<Integer> c = ajt.a(cih.class, ajr.b);
   private static final ajp<Integer> d = ajt.a(cih.class, ajr.b);
   private static final List<ajp<Integer>> e = ImmutableList.of(b, c, d);
   private static final ajp<Integer> ca = ajt.a(cih.class, ajr.b);
   private static final int cb = 220;
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final float[] ce = new float[2];
   private final float[] cf = new float[2];
   private final int[] cg = new int[2];
   private final int[] ch = new int[2];
   private int ci;
   private final aqj cj = (aqj)new aqj(this.O_(), bpw.a.f, bpw.b.a).a(true);
   private static final Predicate<btb> ck = $$0 -> !$$0.al().a(awa.y) && $$0.fE();
   private static final cds cl = cds.a().a(20.0).a(ck);

   public cih(bsm<? extends cih> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new byz(this, 10, false);
      this.u(this.eO());
      this.bP = 50;
   }

   @Override
   protected ccn b(dcf $$0) {
      ccl $$1 = new ccl(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cih.a());
      this.bU.a(2, new cay(this, 1.0, 40, 20.0F));
      this.bU.a(5, new cbl(this, 1.0));
      this.bU.a(6, new cah(this, cmk.class, 8.0F));
      this.bU.a(7, new cau(this));
      this.bV.a(1, new cbr(this));
      this.bV.a(2, new cbs<>(this, btb.class, 0, false, false, ck));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(ca, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ah()) {
         this.cj.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable wu $$0) {
      super.b($$0);
      this.cj.a(this.O_());
   }

   @Override
   protected avg v() {
      return avh.Cx;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.CA;
   }

   @Override
   protected avg o_() {
      return avh.Cz;
   }

   @Override
   public void n_() {
      ewf $$0 = this.dt().d(1.0, 0.6, 1.0);
      if (!this.dQ().B && this.t(0) > 0) {
         bsg $$1 = this.dQ().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dx() < $$1.dx() || !this.a() && this.dx() < $$1.dx() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ewf($$0.c, $$2, $$0.e);
            ewf $$3 = new ewf($$1.dv() - this.dv(), 0.0, $$1.dB() - this.dB());
            if ($$3.i() > 9.0) {
               ewf $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.i() > 0.05) {
         this.s((float)ayg.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cf[$$5] = this.cd[$$5];
         this.ce[$$5] = this.cc[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bsg $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dQ().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.dv() - $$9;
            double $$13 = $$8.dz() - $$10;
            double $$14 = $$8.dB() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(ayg.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ayg.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cc[$$6] = this.a(this.cc[$$6], $$17, 40.0F);
            this.cd[$$6] = this.a(this.cd[$$6], $$16, 10.0F);
         } else {
            this.cd[$$6] = this.a(this.cd[$$6], this.aY, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.u($$19);
         double $$21 = this.v($$19);
         double $$22 = this.w($$19);
         float $$23 = 0.3F * this.ec();
         this.dQ().a(lj.ae, $$20 + this.ah.k() * (double)$$23, $$21 + this.ah.k() * (double)$$23, $$22 + this.ah.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dQ().z.a(4) == 0) {
            this.dQ()
               .a(
                  lc.a(lj.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ah.k() * (double)$$23,
                  $$21 + this.ah.k() * (double)$$23,
                  $$22 + this.ah.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.y() > 0) {
         float $$24 = 3.3F * this.ec();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dQ()
               .a(lc.a(lj.u, 0.7F, 0.7F, 0.9F), this.dv() + this.ah.k(), this.dx() + (double)(this.ah.i() * $$24), this.dB() + this.ah.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void Z() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.cj.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dQ().a(this, this.dv(), this.dz(), this.dB(), 7.0F, false, dcf.a.c);
            if (!this.aX()) {
               this.dQ().b(1023, this.dq(), 0);
            }
         }

         this.s($$0);
         if (this.ai % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.Z();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ai >= this.cg[$$1 - 1]) {
               this.cg[$$1 - 1] = this.ai + 10 + this.ah.a(10);
               if ((this.dQ().al() == bqd.c || this.dQ().al() == bqd.d) && this.ch[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = ayg.a(this.ah, this.dv() - 10.0, this.dv() + 10.0);
                  double $$5 = ayg.a(this.ah, this.dx() - 5.0, this.dx() + 5.0);
                  double $$6 = ayg.a(this.ah, this.dB() - 10.0, this.dB() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ch[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  btb $$8 = (btb)this.dQ().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bsg)$$8) > 900.0) && this.F($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cg[$$1 - 1] = this.ai + 40 + this.ah.a(20);
                     this.ch[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<btb> $$9 = this.dQ().a(btb.class, cl, this, this.cL().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     btb $$10 = $$9.get(this.ah.a($$9.size()));
                     this.a($$1, $$10.am());
                  }
               }
            }
         }

         if (this.p() != null) {
            this.a(0, this.p().am());
         } else {
            this.a(0, 0);
         }

         if (this.ci > 0) {
            this.ci--;
            if (this.ci == 0 && this.dQ().ab().b(dcb.c)) {
               boolean $$11 = false;
               int $$12 = ayg.d(this.dk() / 2.0F + 1.0F);
               int $$13 = ayg.d(this.dl());

               for (ja $$14 : ja.b(this.du() - $$12, this.dw(), this.dA() - $$12, this.du() + $$12, this.dw() + $$13, this.dA() + $$12)) {
                  dsk $$15 = this.dQ().a_($$14);
                  if (c($$15)) {
                     $$11 = this.dQ().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dQ().a(null, 1022, this.dq(), 0);
               }
            }
         }

         if (this.ai % 20 == 0) {
            this.c(1.0F);
         }

         this.cj.a(this.ex() / this.eO());
      }
   }

   public static boolean c(dsk $$0) {
      return !$$0.i() && !$$0.a(avw.aE);
   }

   @Override
   public void s() {
      this.s(220);
      this.cj.a(0.0F);
      this.u(this.eO() / 3.0F);
   }

   @Override
   public void a(dsk $$0, ewf $$1) {
   }

   @Override
   public void c(aqn $$0) {
      super.c($$0);
      this.cj.a($$0);
   }

   @Override
   public void d(aqn $$0) {
      super.d($$0);
      this.cj.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dv();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayg.b($$1);
         return this.dv() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private double v(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dx() + (double)($$1 * this.ec());
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dB();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayg.a($$1);
         return this.dB() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayg.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, btb $$1) {
      this.a($$0, $$1.dv(), $$1.dx() + (double)$$1.cM() * 0.5, $$1.dB(), $$0 == 0 && this.ah.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aX()) {
         this.dQ().a(null, 1024, this.dq(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      ewf $$11 = new ewf($$8, $$9, $$10);
      cnq $$12 = new cnq(this.dQ(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.p($$5, $$6, $$7);
      this.dQ().b($$12);
   }

   @Override
   public void a(btb $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(avy.u) || $$0.d() instanceof cih) {
         return false;
      } else if (this.y() > 0 && !$$0.a(avy.e)) {
         return false;
      } else {
         if (this.a()) {
            bsg $$2 = $$0.c();
            if ($$2 instanceof cmq || $$2 instanceof cnu) {
               return false;
            }
         }

         bsg $$3 = $$0.d();
         if ($$3 != null && $$3.al().a(awa.y)) {
            return false;
         } else {
            if (this.ci <= 0) {
               this.ci = 20;
            }

            for (int $$4 = 0; $$4 < this.ch.length; $$4++) {
               this.ch[$$4] = this.ch[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);
      ciu $$2 = this.a(cuf.us);
      if ($$2 != null) {
         $$2.A();
      }
   }

   @Override
   public void dC() {
      if (this.dQ().al() == bqd.a && this.X()) {
         this.ap();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(bro $$0, @Nullable bsg $$1) {
      return false;
   }

   public static bui.a u() {
      return cjq.gu().a(buj.s, 300.0).a(buj.v, 0.6F).a(buj.l, 0.6F).a(buj.m, 40.0).a(buj.a, 4.0);
   }

   public float b(int $$0) {
      return this.cd[$$0];
   }

   public float c(int $$0) {
      return this.cc[$$0];
   }

   public int y() {
      return this.ao.a(ca);
   }

   public void s(int $$0) {
      this.ao.a(ca, $$0);
   }

   public int t(int $$0) {
      return this.ao.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.ao.a(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ex() <= this.eO() / 2.0F;
   }

   @Override
   protected boolean o(bsg $$0) {
      return false;
   }

   @Override
   public boolean cx() {
      return false;
   }

   @Override
   public boolean c(bro $$0) {
      return $$0.a(brq.t) ? false : super.c($$0);
   }

   class a extends bzz {
      public a() {
         this.a(EnumSet.of(bzz.a.a, bzz.a.c, bzz.a.b));
      }

      @Override
      public boolean a() {
         return cih.this.y() > 0;
      }
   }
}
