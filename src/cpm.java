import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cpm extends cqc {
   private static final eye c = new eye(0.0, 0.0, 0.0);
   private static final akg<Integer> d = akk.a(cpm.class, aki.b);
   private static final akg<Integer> e = akk.a(cpm.class, aki.b);
   private static final akg<Boolean> i = akk.a(cpm.class, aki.k);
   private static final ImmutableMap<bur, ImmutableList<Integer>> j = ImmutableMap.of(
      bur.a, ImmutableList.of(0, 1, -1), bur.f, ImmutableList.of(0, 1, -1), bur.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private eye m = eye.c;
   private final cpt n;
   private static final Map<dve, Pair<ki, ki>> o = ad.a(Maps.newEnumMap(dve.class), $$0 -> {
      ki $$1 = jj.e.q();
      ki $$2 = jj.f.q();
      ki $$3 = jj.c.q();
      ki $$4 = jj.d.q();
      ki $$5 = $$1.p();
      ki $$6 = $$2.p();
      ki $$7 = $$3.p();
      ki $$8 = $$4.p();
      $$0.put(dve.a, Pair.of($$3, $$4));
      $$0.put(dve.b, Pair.of($$1, $$2));
      $$0.put(dve.c, Pair.of($$5, $$2));
      $$0.put(dve.d, Pair.of($$1, $$6));
      $$0.put(dve.e, Pair.of($$3, $$8));
      $$0.put(dve.f, Pair.of($$7, $$4));
      $$0.put(dve.g, Pair.of($$4, $$2));
      $$0.put(dve.h, Pair.of($$4, $$1));
      $$0.put(dve.i, Pair.of($$3, $$1));
      $$0.put(dve.j, Pair.of($$3, $$2));
   });

   protected cpm(btq<?> $$0, dds $$1) {
      super($$0, $$1);
      this.J = true;
      if (b($$1)) {
         this.n = new cqa(this);
      } else {
         this.n = new cqb(this);
      }
   }

   protected cpm(btq<?> $$0, dds $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cpm a(arg $$0, double $$1, double $$2, double $$3, cpm.a $$4, cvl $$5, @Nullable cnp $$6) {
      cpm $$7 = (cpm)(switch ($$4) {
         case b -> new cpu($$0, $$1, $$2, $$3);
         case c -> new cpw($$0, $$1, $$2, $$3);
         case d -> new cpz($$0, $$1, $$2, $$3);
         case e -> new cpy($$0, $$1, $$2, $$3);
         case f -> new cpx($$0, $$1, $$2, $$3);
         case g -> new cpv($$0, $$1, $$2, $$3);
         default -> new cps($$0, $$1, $$2, $$3);
      });
      btq.<cpm>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   public cpt m() {
      return this.n;
   }

   @Override
   protected btj.b bf() {
      return btj.b.c;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, dgv.j(dgx.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(btj $$0) {
      return cpo.a(this, $$0);
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public eye a(jj.a $$0, l.a $$1) {
      return buf.j(super.a($$0, $$1));
   }

   @Override
   protected eye a(btj $$0, btm $$1, float $$2) {
      boolean $$3 = $$0 instanceof cnc || $$0 instanceof cni;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public eye b(buf $$0) {
      jj $$1 = this.cM();
      if ($$1.o() == jj.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cpr.a($$1);
         je $$3 = this.ds();
         je.a $$4 = new je.a();
         ImmutableList<bur> $$5 = $$0.fI();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bur $$6 = (bur)$$14.next();
            btm $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dS().a(cpr.a(this.dS(), $$4), () -> cpr.a(this.dS(), $$4.e()));
                  if (cpr.a($$11)) {
                     exz $$12 = new exz((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     eye $$13 = eye.a($$4, $$11);
                     if (cpr.a(this.dS(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cO().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bur $$15 = (bur)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azc.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cpr.a($$4, $$17, $$0x -> this.dS().a_($$0x).g(this.dS(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aR() {
      dua $$0 = this.dS().a_(this.ds());
      return $$0.a(aws.O) ? 1.0F : super.aR();
   }

   @Override
   public void p(float $$0) {
      this.m(-this.S());
      this.d(10);
      this.b(this.Q() + this.Q() * 10.0F);
   }

   @Override
   public boolean bE() {
      return !this.dN();
   }

   public static Pair<ki, ki> a(dve $$0) {
      return o.get($$0);
   }

   @Override
   public jj cM() {
      return this.n.p();
   }

   @Override
   protected double bc() {
      return this.bi() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.R() > 0) {
         this.d(this.R() - 1);
      }

      if (this.Q() > 0.0F) {
         this.b(this.Q() - 1.0F);
      }

      this.az();
      this.bT();
      this.n.f();
      this.bp();
      if (this.bw()) {
         this.aD();
         this.aa *= 0.5F;
      }

      this.al = false;
   }

   public je o() {
      int $$0 = azc.a(this.dx());
      int $$1 = azc.a(this.dz());
      int $$2 = azc.a(this.dD());
      if (this.dS().a_(new je($$0, $$1 - 1, $$2)).a(aws.O)) {
         $$1--;
      }

      return new je($$0, $$1, $$2);
   }

   public boolean a(exz $$0, double $$1) {
      boolean $$2 = false;
      if (this.x() == cpm.a.a && this.dv().j() >= $$1) {
         List<btj> $$3 = this.dS().a(this, $$0, bto.a(this));
         if (!$$3.isEmpty()) {
            for (btj $$4 : $$3) {
               if (!($$4 instanceof cnp) && !($$4 instanceof cgh) && !($$4 instanceof cpm) && !this.bX() && !$$4.bW()) {
                  $$4.n(this);
                  $$2 = true;
               } else {
                  $$4.h(this);
               }
            }
         }
      } else {
         for (btj $$5 : this.dS().a_(this, $$0)) {
            if (!this.y($$5) && $$5.bF() && $$5 instanceof cpm) {
               $$5.h(this);
            }
         }
      }

      return $$2;
   }

   protected double q() {
      return this.n.q();
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void be() {
      super.be();
   }

   @Override
   public void ax() {
      super.ax();
   }

   @Override
   public boolean bp() {
      return super.bp();
   }

   @Override
   public eye ai() {
      return this.n.c(super.ai());
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.n.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public double c_() {
      return this.n.a();
   }

   @Override
   public double d_() {
      return this.n.b();
   }

   @Override
   public double N_() {
      return this.n.c();
   }

   @Override
   public float O_() {
      return this.n.d();
   }

   @Override
   public float e_() {
      return this.n.e();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n.a($$0, $$1, $$2);
   }

   protected void t() {
      this.n.h();
   }

   protected void v() {
      double $$0 = this.q();
      eye $$1 = this.dv();
      this.n(azc.a($$1.d, -$$0, $$0), $$1.e, azc.a($$1.f, -$$0, $$0));
      if (this.aH()) {
         this.h(this.dv().c(0.5));
      }

      this.a(buj.a, this.dv());
      if (!this.aH()) {
         this.h(this.dv().c(0.95));
      }
   }

   protected double a(je $$0, dve $$1, double $$2) {
      return this.n.a($$0, $$1, $$2);
   }

   @Override
   public void a(buj $$0, eye $$1) {
      if (b(this.dS())) {
         eye $$2 = this.dq().e($$1);
         super.a($$0, $$1);
         if (this.Q || this.R) {
            boolean $$3 = this.a(this.cO().g(1.0E-7), 0.0);
            if ($$3) {
               super.a($$0, $$2.d(this.dq()));
            }
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean cn() {
      return this.k;
   }

   public void a(boolean $$0) {
      this.k = $$0;
   }

   public boolean w() {
      return this.l;
   }

   public void b(boolean $$0) {
      this.l = $$0;
   }

   public eye a(je $$0) {
      dua $$1 = this.dS().a_($$0);
      if ($$1.a(dgx.bp) && $$1.c(dms.f)) {
         dve $$2 = $$1.c(((dgk)$$1.b()).c());
         if ($$2 == dve.b) {
            if (this.b($$0.h())) {
               return new eye(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new eye(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dve.a) {
            if (this.b($$0.f())) {
               return new eye(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new eye(0.0, 0.0, -1.0);
            }
         }

         return eye.c;
      } else {
         return eye.c;
      }
   }

   public boolean b(je $$0) {
      return this.dS().a_($$0).d(this.dS(), $$0);
   }

   @Override
   protected eye a(eye $$0) {
      double $$1 = this.n.r();
      eye $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bi()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(uf $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uu.a(this.dS().a(lv.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.l = $$0.q("FlippedRotation");
   }

   @Override
   protected void b(uf $$0) {
      if (this.C()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uu.a(this.y()));
         $$0.a("DisplayOffset", this.A());
      }

      $$0.a("FlippedRotation", this.l);
   }

   @Override
   public void h(btj $$0) {
      if (!this.dS().B) {
         if (!$$0.ae && !this.ae) {
            if (!this.y($$0)) {
               double $$1 = $$0.dx() - this.dx();
               double $$2 = $$0.dD() - this.dD();
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
                  if ($$0 instanceof cpm) {
                     double $$5 = $$0.dx() - this.dx();
                     double $$6 = $$0.dD() - this.dD();
                     eye $$7 = new eye($$5, 0.0, $$6).d();
                     eye $$8 = new eye((double)azc.b(this.dI() * (float) (Math.PI / 180.0)), 0.0, (double)azc.a(this.dI() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     eye $$10 = this.dv();
                     eye $$11 = $$0.dv();
                     if (((cpm)$$0).x() == cpm.a.c && this.x() != cpm.a.c) {
                        this.h($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.d - $$1, 0.0, $$11.f - $$2);
                        $$0.h($$11.d(0.95, 1.0, 0.95));
                     } else if (((cpm)$$0).x() != cpm.a.c && this.x() == cpm.a.c) {
                        $$0.h($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.d + $$1, 0.0, $$10.f + $$2);
                        this.h($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.d + $$10.d) / 2.0;
                        double $$13 = ($$11.f + $$10.f) / 2.0;
                        this.h($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.h($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$12 + $$1, 0.0, $$13 + $$2);
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

   public abstract cpm.a x();

   public dua y() {
      return !this.C() ? this.z() : dgv.a(this.at().a(d));
   }

   public dua z() {
      return dgx.a.o();
   }

   public int A() {
      return !this.C() ? this.B() : this.at().a(e);
   }

   public int B() {
      return 6;
   }

   public void c(dua $$0) {
      this.at().a(d, dgv.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.at().a(e, $$0);
      this.r(true);
   }

   public boolean C() {
      return this.at().a(i);
   }

   public void r(boolean $$0) {
      this.at().a(i, $$0);
   }

   @Override
   public cvl dF() {
      return new cvl(switch (this.x()) {
         case b -> cvo.nN;
         case c -> cvo.nO;
         case d -> cvo.nP;
         default -> cvo.nM;
         case f -> cvo.nQ;
         case g -> cvo.uO;
      });
   }

   public void a(buf $$0, eye $$1) {
      eye $$2 = a($$1, 1.0F, $$0.dI());
      this.j($$2);
   }

   public void j(eye $$0) {
      this.m = $$0;
   }

   public eye D() {
      return this.m;
   }

   public static boolean b(dds $$0) {
      return $$0.J().b(cqj.e);
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
