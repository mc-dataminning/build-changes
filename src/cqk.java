import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cqk extends cra {
   private static final ezn c = new ezn(0.0, 0.0, 0.0);
   private static final akl<Integer> d = akp.a(cqk.class, akn.b);
   private static final akl<Integer> e = akp.a(cqk.class, akn.b);
   private static final akl<Boolean> i = akp.a(cqk.class, akn.k);
   private static final ImmutableMap<bvm, ImmutableList<Integer>> j = ImmutableMap.of(
      bvm.a, ImmutableList.of(0, 1, -1), bvm.f, ImmutableList.of(0, 1, -1), bvm.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private final cqr m;
   private static final Map<dwn, Pair<kl, kl>> n = ae.a(Maps.newEnumMap(dwn.class), $$0 -> {
      kl $$1 = jm.e.q();
      kl $$2 = jm.f.q();
      kl $$3 = jm.c.q();
      kl $$4 = jm.d.q();
      kl $$5 = $$1.p();
      kl $$6 = $$2.p();
      kl $$7 = $$3.p();
      kl $$8 = $$4.p();
      $$0.put(dwn.a, Pair.of($$3, $$4));
      $$0.put(dwn.b, Pair.of($$1, $$2));
      $$0.put(dwn.c, Pair.of($$5, $$2));
      $$0.put(dwn.d, Pair.of($$1, $$6));
      $$0.put(dwn.e, Pair.of($$3, $$8));
      $$0.put(dwn.f, Pair.of($$7, $$4));
      $$0.put(dwn.g, Pair.of($$4, $$2));
      $$0.put(dwn.h, Pair.of($$4, $$1));
      $$0.put(dwn.i, Pair.of($$3, $$1));
      $$0.put(dwn.j, Pair.of($$3, $$2));
   });

   protected cqk(bul<?> $$0, dfb $$1) {
      super($$0, $$1);
      this.J = true;
      if (b($$1)) {
         this.m = new cqy(this);
      } else {
         this.m = new cqz(this);
      }
   }

   protected cqk(bul<?> $$0, dfb $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cqk a(dfb $$0, double $$1, double $$2, double $$3, cqk.a $$4, cwb $$5, @Nullable com $$6) {
      cqk $$7 = (cqk)(switch ($$4) {
         case b -> new cqs($$0, $$1, $$2, $$3);
         case c -> new cqu($$0, $$1, $$2, $$3);
         case d -> new cqx($$0, $$1, $$2, $$3);
         case e -> new cqw($$0, $$1, $$2, $$3);
         case f -> new cqv($$0, $$1, $$2, $$3);
         case g -> new cqt($$0, $$1, $$2, $$3);
         default -> new cqq($$0, $$1, $$2, $$3);
      });
      bul.<cqk>a($$0, $$5, $$6).accept($$7);
      if ($$7.m() instanceof cqy $$8) {
         jh $$9 = $$7.q();
         dvj $$10 = $$0.a_($$9);
         $$8.a($$9, $$10, true);
      }

      return $$7;
   }

   public cqr m() {
      return this.m;
   }

   @Override
   protected bue.b bh() {
      return bue.b.c;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(d, die.j(dig.a.m()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bue $$0) {
      return cqm.a(this, $$0);
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   public ezn a(jm.a $$0, l.a $$1) {
      return bva.j(super.a($$0, $$1));
   }

   @Override
   protected ezn a(bue $$0, buh $$1, float $$2) {
      boolean $$3 = $$0 instanceof cny || $$0 instanceof coe;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ezn b(bva $$0) {
      jm $$1 = this.cQ();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqp.a($$1);
         jh $$3 = this.dx();
         jh.a $$4 = new jh.a();
         ImmutableList<bvm> $$5 = $$0.fQ();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bvm $$6 = (bvm)$$14.next();
            buh $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dX().a(cqp.a(this.dX(), $$4), () -> cqp.a(this.dX(), $$4.e()));
                  if (cqp.a($$11)) {
                     ezi $$12 = new ezi((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ezn $$13 = ezn.a($$4, $$11);
                     if (cqp.a(this.dX(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cS().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bvm $$15 = (bvm)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azk.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cqp.a($$4, $$17, $$0x -> this.dX().a_($$0x).g(this.dX(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aU() {
      dvj $$0 = this.dX().a_(this.dx());
      return $$0.a(axa.O) ? 1.0F : super.aU();
   }

   @Override
   public void p(float $$0) {
      this.m(-this.S());
      this.d(10);
      this.b(this.Q() + this.Q() * 10.0F);
   }

   @Override
   public boolean bI() {
      return !this.dS();
   }

   public static Pair<kl, kl> a(dwn $$0) {
      return n.get($$0);
   }

   @Override
   public jm cQ() {
      return this.m.q();
   }

   @Override
   protected double be() {
      return this.bk() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.R() > 0) {
         this.d(this.R() - 1);
      }

      if (this.Q() > 0.0F) {
         this.b(this.Q() - 1.0F);
      }

      this.aC();
      this.bX();
      this.m.f();
      this.br();
      if (this.by()) {
         this.aG();
         this.aa *= 0.5F;
      }

      this.al = false;
   }

   public boolean o() {
      return this.al;
   }

   public jh q() {
      int $$0 = azk.a(this.dC());
      int $$1 = azk.a(this.dE());
      int $$2 = azk.a(this.dI());
      if (b(this.dX())) {
         double $$3 = this.dE() - 0.1 - 1.0E-5F;
         if (this.dX().a_(jh.a((double)$$0, $$3, (double)$$2)).a(axa.O)) {
            $$1 = azk.a($$3);
         }
      } else if (this.dX().a_(new jh($$0, $$1 - 1, $$2)).a(axa.O)) {
         $$1--;
      }

      return new jh($$0, $$1, $$2);
   }

   protected double t() {
      return this.m.r();
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void bg() {
      super.bg();
   }

   @Override
   public void aA() {
      super.aA();
   }

   @Override
   public boolean br() {
      return super.br();
   }

   @Override
   public ezn ai() {
      return this.m.c(super.ai());
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.m.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public double d_() {
      return this.m.a();
   }

   @Override
   public double e_() {
      return this.m.b();
   }

   @Override
   public double P_() {
      return this.m.c();
   }

   @Override
   public float Q_() {
      return this.m.d();
   }

   @Override
   public float f_() {
      return this.m.e();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.m.a($$0, $$1, $$2);
   }

   protected void v() {
      this.m.h();
   }

   @Override
   protected void w() {
      double $$0 = this.t();
      ezn $$1 = this.dA();
      this.n(azk.a($$1.d, -$$0, $$0), $$1.e, azk.a($$1.f, -$$0, $$0));
      if (this.aK()) {
         this.h(this.dA().c(0.5));
      }

      this.a(bve.a, this.dA());
      if (!this.aK()) {
         this.h(this.dA().c(0.95));
      }
   }

   protected double a(jh $$0, dwn $$1, double $$2) {
      return this.m.a($$0, $$1, $$2);
   }

   @Override
   public void a(bve $$0, ezn $$1) {
      if (b(this.dX())) {
         ezn $$2 = this.dv().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.m.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dv()));
         }

         if ($$0.equals(bve.c)) {
            this.k = false;
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean cr() {
      return this.k;
   }

   public void a(boolean $$0) {
      this.k = $$0;
   }

   public boolean x() {
      return this.l;
   }

   public void b(boolean $$0) {
      this.l = $$0;
   }

   public ezn a(jh $$0) {
      dvj $$1 = this.dX().a_($$0);
      if ($$1.a(dig.bp) && $$1.c(doa.f)) {
         dwn $$2 = $$1.c(((dht)$$1.b()).c());
         if ($$2 == dwn.b) {
            if (this.b($$0.h())) {
               return new ezn(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new ezn(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dwn.a) {
            if (this.b($$0.f())) {
               return new ezn(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new ezn(0.0, 0.0, -1.0);
            }
         }

         return ezn.c;
      } else {
         return ezn.c;
      }
   }

   public boolean b(jh $$0) {
      return this.dX().a_($$0).d(this.dX(), $$0);
   }

   @Override
   protected ezn a(ezn $$0) {
      double $$1 = this.m.s();
      ezn $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bk()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(uk $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uz.a(this.dX().a(lz.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.l = $$0.q("FlippedRotation");
      this.al = $$0.q("HasTicked");
   }

   @Override
   protected void b(uk $$0) {
      if (this.D()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uz.a(this.z()));
         $$0.a("DisplayOffset", this.B());
      }

      $$0.a("FlippedRotation", this.l);
      $$0.a("HasTicked", this.al);
   }

   @Override
   public void h(bue $$0) {
      if (!this.dX().C) {
         if (!$$0.ae && !this.ae) {
            if (!this.y($$0)) {
               double $$1 = $$0.dC() - this.dC();
               double $$2 = $$0.dI() - this.dI();
               double $$3 = $$1 * $$1 + $$2 * $$2;
               if ($$3 >= 1.0E-4F) {
                  $$3 = Math.sqrt($$3);
                  $$1 /= $$3;
                  $$2 /= $$3;
                  double $$4 = 1.0 / $$3;
                  if ($$4 > 1.0) {
                     $$4 = 1.0;
                  }

                  $$1 *= $$4;
                  $$2 *= $$4;
                  $$1 *= 0.1F;
                  $$2 *= 0.1F;
                  $$1 *= 0.5;
                  $$2 *= 0.5;
                  if ($$0 instanceof cqk) {
                     double $$5;
                     double $$6;
                     if (b(this.dX())) {
                        $$5 = this.dA().d;
                        $$6 = this.dA().f;
                     } else {
                        $$5 = $$0.dC() - this.dC();
                        $$6 = $$0.dI() - this.dI();
                     }

                     ezn $$9 = new ezn($$5, 0.0, $$6).d();
                     ezn $$10 = new ezn((double)azk.b(this.dN() * (float) (Math.PI / 180.0)), 0.0, (double)azk.a(this.dN() * (float) (Math.PI / 180.0))).d();
                     double $$11 = Math.abs($$9.b($$10));
                     if ($$11 < 0.8F && !b(this.dX())) {
                        return;
                     }

                     ezn $$12 = this.dA();
                     ezn $$13 = $$0.dA();
                     if (((cqk)$$0).y() == cqk.a.c && this.y() != cqk.a.c) {
                        this.h($$12.d(0.2, 1.0, 0.2));
                        this.j($$13.d - $$1, 0.0, $$13.f - $$2);
                        $$0.h($$13.d(0.95, 1.0, 0.95));
                     } else if (((cqk)$$0).y() != cqk.a.c && this.y() == cqk.a.c) {
                        $$0.h($$13.d(0.2, 1.0, 0.2));
                        $$0.j($$12.d + $$1, 0.0, $$12.f + $$2);
                        this.h($$12.d(0.95, 1.0, 0.95));
                     } else {
                        double $$14 = ($$13.d + $$12.d) / 2.0;
                        double $$15 = ($$13.f + $$12.f) / 2.0;
                        this.h($$12.d(0.2, 1.0, 0.2));
                        this.j($$14 - $$1, 0.0, $$15 - $$2);
                        $$0.h($$13.d(0.2, 1.0, 0.2));
                        $$0.j($$14 + $$1, 0.0, $$15 + $$2);
                     }
                  } else {
                     this.j(-$$1, 0.0, -$$2);
                     $$0.j($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   public abstract cqk.a y();

   public dvj z() {
      return !this.D() ? this.A() : die.a(this.aw().a(d));
   }

   public dvj A() {
      return dig.a.m();
   }

   public int B() {
      return !this.D() ? this.C() : this.aw().a(e);
   }

   public int C() {
      return 6;
   }

   public void c(dvj $$0) {
      this.aw().a(d, die.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.aw().a(e, $$0);
      this.r(true);
   }

   public boolean D() {
      return this.aw().a(i);
   }

   public void r(boolean $$0) {
      this.aw().a(i, $$0);
   }

   @Override
   public cwb dK() {
      return new cwb(switch (this.y()) {
         case b -> cwf.nN;
         case c -> cwf.nO;
         case d -> cwf.nP;
         default -> cwf.nM;
         case f -> cwf.nQ;
         case g -> cwf.uO;
      });
   }

   public static boolean b(dfb $$0) {
      return $$0.J().b(crh.e);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
