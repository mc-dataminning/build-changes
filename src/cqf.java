import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cqf extends cqv {
   private static final ezh c = new ezh(0.0, 0.0, 0.0);
   private static final akk<Integer> d = ako.a(cqf.class, akm.b);
   private static final akk<Integer> e = ako.a(cqf.class, akm.b);
   private static final akk<Boolean> i = ako.a(cqf.class, akm.k);
   private static final ImmutableMap<bvh, ImmutableList<Integer>> j = ImmutableMap.of(
      bvh.a, ImmutableList.of(0, 1, -1), bvh.f, ImmutableList.of(0, 1, -1), bvh.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private final cqm m;
   private static final Map<dwh, Pair<kk, kk>> n = ad.a(Maps.newEnumMap(dwh.class), $$0 -> {
      kk $$1 = jl.e.q();
      kk $$2 = jl.f.q();
      kk $$3 = jl.c.q();
      kk $$4 = jl.d.q();
      kk $$5 = $$1.p();
      kk $$6 = $$2.p();
      kk $$7 = $$3.p();
      kk $$8 = $$4.p();
      $$0.put(dwh.a, Pair.of($$3, $$4));
      $$0.put(dwh.b, Pair.of($$1, $$2));
      $$0.put(dwh.c, Pair.of($$5, $$2));
      $$0.put(dwh.d, Pair.of($$1, $$6));
      $$0.put(dwh.e, Pair.of($$3, $$8));
      $$0.put(dwh.f, Pair.of($$7, $$4));
      $$0.put(dwh.g, Pair.of($$4, $$2));
      $$0.put(dwh.h, Pair.of($$4, $$1));
      $$0.put(dwh.i, Pair.of($$3, $$1));
      $$0.put(dwh.j, Pair.of($$3, $$2));
   });

   protected cqf(bug<?> $$0, dev $$1) {
      super($$0, $$1);
      this.J = true;
      if (b($$1)) {
         this.m = new cqt(this);
      } else {
         this.m = new cqu(this);
      }
   }

   protected cqf(bug<?> $$0, dev $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cqf a(dev $$0, double $$1, double $$2, double $$3, cqf.a $$4, cvx $$5, @Nullable coh $$6) {
      cqf $$7 = (cqf)(switch ($$4) {
         case b -> new cqn($$0, $$1, $$2, $$3);
         case c -> new cqp($$0, $$1, $$2, $$3);
         case d -> new cqs($$0, $$1, $$2, $$3);
         case e -> new cqr($$0, $$1, $$2, $$3);
         case f -> new cqq($$0, $$1, $$2, $$3);
         case g -> new cqo($$0, $$1, $$2, $$3);
         default -> new cql($$0, $$1, $$2, $$3);
      });
      bug.<cqf>a($$0, $$5, $$6).accept($$7);
      if ($$7.m() instanceof cqt $$8) {
         jg $$9 = $$7.q();
         dvd $$10 = $$0.a_($$9);
         $$8.a($$9, $$10, true);
      }

      return $$7;
   }

   public cqm m() {
      return this.m;
   }

   @Override
   protected btz.b bh() {
      return btz.b.c;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, dhy.j(dia.a.m()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(btz $$0) {
      return cqh.a(this, $$0);
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   public ezh a(jl.a $$0, l.a $$1) {
      return buv.j(super.a($$0, $$1));
   }

   @Override
   protected ezh a(btz $$0, buc $$1, float $$2) {
      boolean $$3 = $$0 instanceof cnt || $$0 instanceof cnz;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ezh b(buv $$0) {
      jl $$1 = this.cQ();
      if ($$1.o() == jl.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqk.a($$1);
         jg $$3 = this.dx();
         jg.a $$4 = new jg.a();
         ImmutableList<bvh> $$5 = $$0.fQ();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bvh $$6 = (bvh)$$14.next();
            buc $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dX().a(cqk.a(this.dX(), $$4), () -> cqk.a(this.dX(), $$4.e()));
                  if (cqk.a($$11)) {
                     ezc $$12 = new ezc((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ezh $$13 = ezh.a($$4, $$11);
                     if (cqk.a(this.dX(), $$0, $$12.c($$13))) {
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
            bvh $$15 = (bvh)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azj.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cqk.a($$4, $$17, $$0x -> this.dX().a_($$0x).g(this.dX(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aT() {
      dvd $$0 = this.dX().a_(this.dx());
      return $$0.a(awz.O) ? 1.0F : super.aT();
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

   public static Pair<kk, kk> a(dwh $$0) {
      return n.get($$0);
   }

   @Override
   public jl cQ() {
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

      this.aB();
      this.bX();
      this.m.f();
      this.br();
      if (this.by()) {
         this.aF();
         this.aa *= 0.5F;
      }

      this.al = false;
   }

   public boolean o() {
      return this.al;
   }

   public jg q() {
      int $$0 = azj.a(this.dC());
      int $$1 = azj.a(this.dE());
      int $$2 = azj.a(this.dI());
      if (b(this.dX())) {
         double $$3 = this.dE() - 0.1 - 1.0E-5F;
         if (this.dX().a_(jg.a((double)$$0, $$3, (double)$$2)).a(awz.O)) {
            $$1 = azj.a($$3);
         }
      } else if (this.dX().a_(new jg($$0, $$1 - 1, $$2)).a(awz.O)) {
         $$1--;
      }

      return new jg($$0, $$1, $$2);
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
   public void az() {
      super.az();
   }

   @Override
   public boolean br() {
      return super.br();
   }

   @Override
   public ezh ai() {
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
      ezh $$1 = this.dA();
      this.n(azj.a($$1.d, -$$0, $$0), $$1.e, azj.a($$1.f, -$$0, $$0));
      if (this.aJ()) {
         this.h(this.dA().c(0.5));
      }

      this.a(buz.a, this.dA());
      if (!this.aJ()) {
         this.h(this.dA().c(0.95));
      }
   }

   protected double a(jg $$0, dwh $$1, double $$2) {
      return this.m.a($$0, $$1, $$2);
   }

   @Override
   public void a(buz $$0, ezh $$1) {
      if (b(this.dX())) {
         ezh $$2 = this.dv().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.m.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dv()));
         }

         if ($$0.equals(buz.c)) {
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

   public ezh a(jg $$0) {
      dvd $$1 = this.dX().a_($$0);
      if ($$1.a(dia.bp) && $$1.c(dnu.f)) {
         dwh $$2 = $$1.c(((dhn)$$1.b()).c());
         if ($$2 == dwh.b) {
            if (this.b($$0.h())) {
               return new ezh(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new ezh(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dwh.a) {
            if (this.b($$0.f())) {
               return new ezh(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new ezh(0.0, 0.0, -1.0);
            }
         }

         return ezh.c;
      } else {
         return ezh.c;
      }
   }

   public boolean b(jg $$0) {
      return this.dX().a_($$0).d(this.dX(), $$0);
   }

   @Override
   protected ezh a(ezh $$0) {
      double $$1 = this.m.s();
      ezh $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bk()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(uj $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uy.a(this.dX().a(ly.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.l = $$0.q("FlippedRotation");
      this.al = $$0.q("HasTicked");
   }

   @Override
   protected void b(uj $$0) {
      if (this.D()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uy.a(this.z()));
         $$0.a("DisplayOffset", this.B());
      }

      $$0.a("FlippedRotation", this.l);
      $$0.a("HasTicked", this.al);
   }

   @Override
   public void h(btz $$0) {
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
                  if ($$0 instanceof cqf) {
                     double $$5;
                     double $$6;
                     if (b(this.dX())) {
                        $$5 = this.dA().d;
                        $$6 = this.dA().f;
                     } else {
                        $$5 = $$0.dC() - this.dC();
                        $$6 = $$0.dI() - this.dI();
                     }

                     ezh $$9 = new ezh($$5, 0.0, $$6).d();
                     ezh $$10 = new ezh((double)azj.b(this.dN() * (float) (Math.PI / 180.0)), 0.0, (double)azj.a(this.dN() * (float) (Math.PI / 180.0))).d();
                     double $$11 = Math.abs($$9.b($$10));
                     if ($$11 < 0.8F && !b(this.dX())) {
                        return;
                     }

                     ezh $$12 = this.dA();
                     ezh $$13 = $$0.dA();
                     if (((cqf)$$0).y() == cqf.a.c && this.y() != cqf.a.c) {
                        this.h($$12.d(0.2, 1.0, 0.2));
                        this.j($$13.d - $$1, 0.0, $$13.f - $$2);
                        $$0.h($$13.d(0.95, 1.0, 0.95));
                     } else if (((cqf)$$0).y() != cqf.a.c && this.y() == cqf.a.c) {
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

   public abstract cqf.a y();

   public dvd z() {
      return !this.D() ? this.A() : dhy.a(this.av().a(d));
   }

   public dvd A() {
      return dia.a.m();
   }

   public int B() {
      return !this.D() ? this.C() : this.av().a(e);
   }

   public int C() {
      return 6;
   }

   public void c(dvd $$0) {
      this.av().a(d, dhy.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.av().a(e, $$0);
      this.r(true);
   }

   public boolean D() {
      return this.av().a(i);
   }

   public void r(boolean $$0) {
      this.av().a(i, $$0);
   }

   @Override
   public cvx dK() {
      return new cvx(switch (this.y()) {
         case b -> cwb.nN;
         case c -> cwb.nO;
         case d -> cwb.nP;
         default -> cwb.nM;
         case f -> cwb.nQ;
         case g -> cwb.uO;
      });
   }

   public static boolean b(dev $$0) {
      return $$0.J().b(crc.e);
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
