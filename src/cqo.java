import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cqo extends cre {
   private static final ezr c = new ezr(0.0, 0.0, 0.0);
   private static final ako<Integer> d = aks.a(cqo.class, akq.b);
   private static final ako<Integer> e = aks.a(cqo.class, akq.b);
   private static final ako<Boolean> i = aks.a(cqo.class, akq.k);
   private static final ImmutableMap<bvq, ImmutableList<Integer>> j = ImmutableMap.of(
      bvq.a, ImmutableList.of(0, 1, -1), bvq.f, ImmutableList.of(0, 1, -1), bvq.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private final cqv m;
   private static final Map<dwr, Pair<kl, kl>> n = ae.a(Maps.newEnumMap(dwr.class), $$0 -> {
      kl $$1 = jm.e.q();
      kl $$2 = jm.f.q();
      kl $$3 = jm.c.q();
      kl $$4 = jm.d.q();
      kl $$5 = $$1.p();
      kl $$6 = $$2.p();
      kl $$7 = $$3.p();
      kl $$8 = $$4.p();
      $$0.put(dwr.a, Pair.of($$3, $$4));
      $$0.put(dwr.b, Pair.of($$1, $$2));
      $$0.put(dwr.c, Pair.of($$5, $$2));
      $$0.put(dwr.d, Pair.of($$1, $$6));
      $$0.put(dwr.e, Pair.of($$3, $$8));
      $$0.put(dwr.f, Pair.of($$7, $$4));
      $$0.put(dwr.g, Pair.of($$4, $$2));
      $$0.put(dwr.h, Pair.of($$4, $$1));
      $$0.put(dwr.i, Pair.of($$3, $$1));
      $$0.put(dwr.j, Pair.of($$3, $$2));
   });

   protected cqo(bup<?> $$0, dff $$1) {
      super($$0, $$1);
      this.J = true;
      if (b($$1)) {
         this.m = new crc(this);
      } else {
         this.m = new crd(this);
      }
   }

   protected cqo(bup<?> $$0, dff $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.p($$2, $$3, $$4);
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
   }

   @Nullable
   public static <T extends cqo> T a(dff $$0, double $$1, double $$2, double $$3, bup<T> $$4, buo $$5, cwf $$6, @Nullable cor $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bup.a($$0, $$6, $$7).accept($$8);
         if ($$8.m() instanceof crc $$9) {
            jh $$10 = $$8.q();
            dvo $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public cqv m() {
      return this.m;
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, dij.j(dil.a.m()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bui $$0) {
      return cqq.a(this, $$0);
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public ezr a(jm.a $$0, l.a $$1) {
      return bve.j(super.a($$0, $$1));
   }

   @Override
   protected ezr a(bui $$0, bul $$1, float $$2) {
      boolean $$3 = $$0 instanceof coc || $$0 instanceof coi;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ezr b(bve $$0) {
      jm $$1 = this.cR();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqt.a($$1);
         jh $$3 = this.dy();
         jh.a $$4 = new jh.a();
         ImmutableList<bvq> $$5 = $$0.fR();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bvq $$6 = (bvq)$$14.next();
            bul $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dY().a(cqt.a(this.dY(), $$4), () -> cqt.a(this.dY(), $$4.e()));
                  if (cqt.a($$11)) {
                     ezm $$12 = new ezm((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ezr $$13 = ezr.a($$4, $$11);
                     if (cqt.a(this.dY(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cT().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bvq $$15 = (bvq)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azn.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cqt.a($$4, $$17, $$0x -> this.dY().a_($$0x).g(this.dY(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aV() {
      dvo $$0 = this.dY().a_(this.dy());
      return $$0.a(axd.O) ? 1.0F : super.aV();
   }

   @Override
   public void p(float $$0) {
      this.m(-this.T());
      this.d(10);
      this.b(this.R() + this.R() * 10.0F);
   }

   @Override
   public boolean bJ() {
      return !this.dT();
   }

   public static Pair<kl, kl> a(dwr $$0) {
      return n.get($$0);
   }

   @Override
   public jm cR() {
      return this.m.q();
   }

   @Override
   protected double bf() {
      return this.bl() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.S() > 0) {
         this.d(this.S() - 1);
      }

      if (this.R() > 0.0F) {
         this.b(this.R() - 1.0F);
      }

      this.aC();
      this.bY();
      this.m.f();
      this.bs();
      if (this.bz()) {
         this.aG();
         this.aa *= 0.5F;
      }

      this.al = false;
   }

   public boolean o() {
      return this.al;
   }

   public jh q() {
      int $$0 = azn.a(this.dD());
      int $$1 = azn.a(this.dF());
      int $$2 = azn.a(this.dJ());
      if (b(this.dY())) {
         double $$3 = this.dF() - 0.1 - 1.0E-5F;
         if (this.dY().a_(jh.a((double)$$0, $$3, (double)$$2)).a(axd.O)) {
            $$1 = azn.a($$3);
         }
      } else if (this.dY().a_(new jh($$0, $$1 - 1, $$2)).a(axd.O)) {
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
   public void bh() {
      super.bh();
   }

   @Override
   public void aA() {
      super.aA();
   }

   @Override
   public boolean bs() {
      return super.bs();
   }

   @Override
   public ezr ai() {
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
      ezr $$1 = this.dB();
      this.n(azn.a($$1.d, -$$0, $$0), $$1.e, azn.a($$1.f, -$$0, $$0));
      if (this.aL()) {
         this.h(this.dB().c(0.5));
      }

      this.a(bvi.a, this.dB());
      if (!this.aL()) {
         this.h(this.dB().c(0.95));
      }
   }

   protected double a(jh $$0, dwr $$1, double $$2) {
      return this.m.a($$0, $$1, $$2);
   }

   @Override
   public void a(bvi $$0, ezr $$1) {
      if (b(this.dY())) {
         ezr $$2 = this.dw().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.m.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dw()));
         }

         if ($$0.equals(bvi.c)) {
            this.k = false;
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean cs() {
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

   public ezr a(jh $$0) {
      dvo $$1 = this.dY().a_($$0);
      if ($$1.a(dil.bp) && $$1.c(dof.f)) {
         dwr $$2 = $$1.c(((dhy)$$1.b()).c());
         if ($$2 == dwr.b) {
            if (this.b($$0.h())) {
               return new ezr(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new ezr(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dwr.a) {
            if (this.b($$0.f())) {
               return new ezr(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new ezr(0.0, 0.0, -1.0);
            }
         }

         return ezr.c;
      } else {
         return ezr.c;
      }
   }

   public boolean b(jh $$0) {
      return this.dY().a_($$0).d(this.dY(), $$0);
   }

   @Override
   protected ezr a(ezr $$0) {
      double $$1 = this.m.s();
      ezr $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bl()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(un $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(vc.a(this.dY().a(ma.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.l = $$0.q("FlippedRotation");
      this.al = $$0.q("HasTicked");
   }

   @Override
   protected void b(un $$0) {
      if (this.C()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", vc.a(this.y()));
         $$0.a("DisplayOffset", this.A());
      }

      $$0.a("FlippedRotation", this.l);
      $$0.a("HasTicked", this.al);
   }

   @Override
   public void h(bui $$0) {
      if (!this.dY().C) {
         if (!$$0.ae && !this.ae) {
            if (!this.y($$0)) {
               double $$1 = $$0.dD() - this.dD();
               double $$2 = $$0.dJ() - this.dJ();
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
                  if ($$0 instanceof cqo $$5) {
                     this.a($$5, $$1, $$2);
                  } else {
                     this.j(-$$1, 0.0, -$$2);
                     $$0.j($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   private void a(cqo $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dY())) {
         $$3 = this.dB().d;
         $$4 = this.dB().f;
      } else {
         $$3 = $$0.dD() - this.dD();
         $$4 = $$0.dJ() - this.dJ();
      }

      ezr $$7 = new ezr($$3, 0.0, $$4).d();
      ezr $$8 = new ezr((double)azn.b(this.dO() * (float) (Math.PI / 180.0)), 0.0, (double)azn.a(this.dO() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dY())) {
         ezr $$10 = this.dB();
         ezr $$11 = $$0.dB();
         if ($$0.E() && !this.E()) {
            this.h($$10.d(0.2, 1.0, 0.2));
            this.j($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.h($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.E() && this.E()) {
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
      }
   }

   public dvo y() {
      return !this.C() ? this.z() : dij.a(this.aw().a(d));
   }

   public dvo z() {
      return dil.a.m();
   }

   public int A() {
      return !this.C() ? this.B() : this.aw().a(e);
   }

   public int B() {
      return 6;
   }

   public void c(dvo $$0) {
      this.aw().a(d, dij.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.aw().a(e, $$0);
      this.r(true);
   }

   public boolean C() {
      return this.aw().a(i);
   }

   public void r(boolean $$0) {
      this.aw().a(i, $$0);
   }

   public static boolean b(dff $$0) {
      return $$0.J().b(crl.e);
   }

   @Override
   public abstract cwf dL();

   public boolean D() {
      return false;
   }

   public boolean E() {
      return false;
   }
}
