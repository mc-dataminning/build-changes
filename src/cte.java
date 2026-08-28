import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cte extends ctw {
   private static final fdw b = new fdw(0.0, 0.0, 0.0);
   private static final akh<Integer> c = akl.a(cte.class, akj.b);
   private static final akh<Integer> d = akl.a(cte.class, akj.b);
   private static final akh<Boolean> h = akl.a(cte.class, akj.k);
   private static final ImmutableMap<bxl, ImmutableList<Integer>> i = ImmutableMap.of(
      bxl.a, ImmutableList.of(0, 1, -1), bxl.f, ImmutableList.of(0, 1, -1), bxl.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final ctm l;
   private static final Map<eas, Pair<jz, jz>> m = Maps.newEnumMap(
      (Map)af.a(
         () -> {
            jz $$0 = ja.e.q();
            jz $$1 = ja.f.q();
            jz $$2 = ja.c.q();
            jz $$3 = ja.d.q();
            jz $$4 = $$0.p();
            jz $$5 = $$1.p();
            jz $$6 = $$2.p();
            jz $$7 = $$3.p();
            return ImmutableMap.of(
               eas.a,
               Pair.of($$2, $$3),
               eas.b,
               Pair.of($$0, $$1),
               eas.c,
               Pair.of($$4, $$1),
               eas.d,
               Pair.of($$0, $$5),
               eas.e,
               Pair.of($$2, $$7),
               eas.f,
               Pair.of($$6, $$3),
               eas.g,
               Pair.of($$3, $$1),
               eas.h,
               Pair.of($$3, $$0),
               eas.i,
               Pair.of($$2, $$0),
               eas.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected cte(bwj<?> $$0, dip $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new ctt(this);
      } else {
         this.l = new ctu(this);
      }
   }

   protected cte(bwj<?> $$0, dip $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.p($$2, $$3, $$4);
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Nullable
   public static <T extends cte> T a(dip $$0, double $$1, double $$2, double $$3, bwj<T> $$4, bwi $$5, cys $$6, @Nullable cqs $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bwj.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof ctt $$9) {
            iu $$10 = $$8.j();
            dzo $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public ctm f() {
      return this.l;
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.c;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, dlu.j(dlw.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(bwa $$0) {
      return ctc.a(this, $$0);
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public fdw a(ja.a $$0, l.a $$1) {
      return bwz.k(super.a($$0, $$1));
   }

   @Override
   protected fdw a(bwa $$0, bwd $$1, float $$2) {
      boolean $$3 = $$0 instanceof cqe || $$0 instanceof cqk;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fdw b(bwz $$0) {
      ja $$1 = this.cP();
      if ($$1.o() == ja.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = ctk.a($$1);
         iu $$3 = this.dv();
         iu.a $$4 = new iu.a();
         ImmutableList<bxl> $$5 = $$0.fN();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bxl $$6 = (bxl)$$14.next();
            bwd $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(ctk.a(this.dV(), $$4), () -> ctk.a(this.dV(), $$4.e()));
                  if (ctk.a($$11)) {
                     fdr $$12 = new fdr((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fdw $$13 = fdw.a($$4, $$11);
                     if (ctk.a(this.dV(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cR().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bxl $$15 = (bxl)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azk.c($$14x - (double)$$4.v() + $$16);
            double $$18 = ctk.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
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
      dzo $$0 = this.dV().a_(this.dv());
      return $$0.a(axa.P) ? 1.0F : super.aT();
   }

   @Override
   public void q(float $$0) {
      this.l(-this.J());
      this.d(10);
      this.b(this.H() + this.H() * 10.0F);
   }

   @Override
   public boolean bG() {
      return !this.dQ();
   }

   public static Pair<jz, jz> a(eas $$0) {
      return m.get($$0);
   }

   @Override
   public ja cP() {
      return this.l.l();
   }

   @Override
   protected double bd() {
      return this.bj() ? 0.005 : 0.04;
   }

   @Override
   public void h() {
      if (this.I() > 0) {
         this.d(this.I() - 1);
      }

      if (this.H() > 0.0F) {
         this.b(this.H() - 1.0F);
      }

      this.aA();
      this.bW();
      this.l.b();
      this.bp();
      if (this.bw()) {
         this.aE();
         this.Z *= 0.5;
      }

      this.ak = false;
   }

   public boolean g() {
      return this.ak;
   }

   public iu j() {
      int $$0 = azk.a(this.dA());
      int $$1 = azk.a(this.dC());
      int $$2 = azk.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(iu.a((double)$$0, $$3, (double)$$2)).a(axa.P)) {
            $$1 = azk.a($$3);
         }
      } else if (this.dV().a_(new iu($$0, $$1 - 1, $$2)).a(axa.P)) {
         $$1--;
      }

      return new iu($$0, $$1, $$2);
   }

   protected double a(aro $$0) {
      return this.l.b($$0);
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void bf() {
      super.bf();
   }

   @Override
   public void ay() {
      super.ay();
   }

   @Override
   public boolean bp() {
      return super.bp();
   }

   @Override
   public fdw ah() {
      return this.l.c(super.ah());
   }

   @Override
   public bwu N_() {
      return this.l.a();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(aro $$0) {
      this.l.a($$0);
   }

   protected void e(aro $$0) {
      double $$1 = this.a($$0);
      fdw $$2 = this.dy();
      this.n(azk.a($$2.d, -$$1, $$1), $$2.e, azk.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.i(this.dy().c(0.5));
      }

      this.a(bxd.a, this.dy());
      if (!this.aJ()) {
         this.i(this.dy().c(0.95));
      }
   }

   protected double a(iu $$0, eas $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bxd $$0, fdw $$1) {
      if (b(this.dV())) {
         fdw $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.d();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bxd.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
         this.aK();
      }
   }

   @Override
   public void aK() {
      if (!b(this.dV())) {
         this.a(this.dt(), this.dt());
      } else {
         super.aK();
      }
   }

   @Override
   public boolean cq() {
      return this.j;
   }

   public void a(boolean $$0) {
      this.j = $$0;
   }

   public boolean m() {
      return this.k;
   }

   public void b(boolean $$0) {
      this.k = $$0;
   }

   public fdw a(iu $$0) {
      dzo $$1 = this.dV().a_($$0);
      if ($$1.a(dlw.bw) && $$1.c(drv.d)) {
         eas $$2 = $$1.c(((dlj)$$1.b()).c());
         if ($$2 == eas.b) {
            if (this.b($$0.h())) {
               return new fdw(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fdw(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == eas.a) {
            if (this.b($$0.f())) {
               return new fdw(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fdw(0.0, 0.0, -1.0);
            }
         }

         return fdw.c;
      } else {
         return fdw.c;
      }
   }

   public boolean b(iu $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected fdw a(fdw $$0) {
      double $$1 = this.l.m();
      fdw $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(um.a(this.dV().a(mg.i), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(tx $$0) {
      if (this.y()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", um.a(this.n()));
         $$0.a("DisplayOffset", this.w());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bwa $$0) {
      if (!this.dV().C) {
         if (!$$0.ad && !this.ad) {
            if (!this.y($$0)) {
               double $$1 = $$0.dA() - this.dA();
               double $$2 = $$0.dG() - this.dG();
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
                  if ($$0 instanceof cte $$5) {
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

   private void a(cte $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      fdw $$7 = new fdw($$3, 0.0, $$4).d();
      fdw $$8 = new fdw((double)azk.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)azk.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         fdw $$10 = this.dy();
         fdw $$11 = $$0.dy();
         if ($$0.A() && !this.A()) {
            this.i($$10.d(0.2, 1.0, 0.2));
            this.j($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.i($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.A() && this.A()) {
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.j($$10.d + $$1, 0.0, $$10.f + $$2);
            this.i($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.i($$10.d(0.2, 1.0, 0.2));
            this.j($$12 - $$1, 0.0, $$13 - $$2);
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.j($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public dzo n() {
      return !this.y() ? this.v() : dlu.a(this.au().a(c));
   }

   public dzo v() {
      return dlw.a.m();
   }

   public int w() {
      return !this.y() ? this.x() : this.au().a(d);
   }

   public int x() {
      return 6;
   }

   public void c(dzo $$0) {
      this.au().a(c, dlu.j($$0));
      this.q(true);
   }

   public void c(int $$0) {
      this.au().a(d, $$0);
      this.q(true);
   }

   public boolean y() {
      return this.au().a(h);
   }

   public void q(boolean $$0) {
      this.au().a(h, $$0);
   }

   public static boolean b(dip $$0) {
      return $$0.K().b(cud.d);
   }

   @Override
   public abstract cys dI();

   public boolean z() {
      return false;
   }

   public boolean A() {
      return false;
   }
}
