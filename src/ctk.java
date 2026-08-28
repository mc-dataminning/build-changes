import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ctk extends cuc {
   private static final fei b = new fei(0.0, 0.0, 0.0);
   private static final akj<Integer> c = akn.a(ctk.class, akl.b);
   private static final akj<Integer> d = akn.a(ctk.class, akl.b);
   private static final akj<Boolean> h = akn.a(ctk.class, akl.k);
   private static final ImmutableMap<bxo, ImmutableList<Integer>> i = ImmutableMap.of(
      bxo.a, ImmutableList.of(0, 1, -1), bxo.f, ImmutableList.of(0, 1, -1), bxo.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final cts l;
   private static final Map<ebd, Pair<jz, jz>> m = Maps.newEnumMap(
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
               ebd.a,
               Pair.of($$2, $$3),
               ebd.b,
               Pair.of($$0, $$1),
               ebd.c,
               Pair.of($$4, $$1),
               ebd.d,
               Pair.of($$0, $$5),
               ebd.e,
               Pair.of($$2, $$7),
               ebd.f,
               Pair.of($$6, $$3),
               ebd.g,
               Pair.of($$3, $$1),
               ebd.h,
               Pair.of($$3, $$0),
               ebd.i,
               Pair.of($$2, $$0),
               ebd.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected ctk(bwm<?> $$0, div $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new ctz(this);
      } else {
         this.l = new cua(this);
      }
   }

   protected ctk(bwm<?> $$0, div $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends ctk> T a(div $$0, double $$1, double $$2, double $$3, bwm<T> $$4, bwl $$5, cyy $$6, @Nullable cqy $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bwm.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof ctz $$9) {
            iu $$10 = $$8.j();
            dzz $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public cts f() {
      return this.l;
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.c;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, dma.j(dmc.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(bwd $$0) {
      return cti.a(this, $$0);
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public fei a(ja.a $$0, l.a $$1) {
      return bxc.k(super.a($$0, $$1));
   }

   @Override
   protected fei a(bwd $$0, bwg $$1, float $$2) {
      boolean $$3 = $$0 instanceof cqk || $$0 instanceof cqq;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fei b(bxc $$0) {
      ja $$1 = this.cP();
      if ($$1.o() == ja.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = ctq.a($$1);
         iu $$3 = this.dv();
         iu.a $$4 = new iu.a();
         ImmutableList<bxo> $$5 = $$0.fN();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bxo $$6 = (bxo)$$14.next();
            bwg $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(ctq.a(this.dV(), $$4), () -> ctq.a(this.dV(), $$4.e()));
                  if (ctq.a($$11)) {
                     fed $$12 = new fed((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fei $$13 = fei.a($$4, $$11);
                     if (ctq.a(this.dV(), $$0, $$12.c($$13))) {
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
            bxo $$15 = (bxo)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azm.c($$14x - (double)$$4.v() + $$16);
            double $$18 = ctq.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
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
      dzz $$0 = this.dV().a_(this.dv());
      return $$0.a(axc.P) ? 1.0F : super.aT();
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

   public static Pair<jz, jz> a(ebd $$0) {
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
      int $$0 = azm.a(this.dA());
      int $$1 = azm.a(this.dC());
      int $$2 = azm.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(iu.a((double)$$0, $$3, (double)$$2)).a(axc.P)) {
            $$1 = azm.a($$3);
         }
      } else if (this.dV().a_(new iu($$0, $$1 - 1, $$2)).a(axc.P)) {
         $$1--;
      }

      return new iu($$0, $$1, $$2);
   }

   protected double a(arq $$0) {
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
   public fei ah() {
      return this.l.c(super.ah());
   }

   @Override
   public bwx N_() {
      return this.l.a();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(arq $$0) {
      this.l.a($$0);
   }

   protected void e(arq $$0) {
      double $$1 = this.a($$0);
      fei $$2 = this.dy();
      this.n(azm.a($$2.d, -$$1, $$1), $$2.e, azm.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.i(this.dy().c(0.5));
      }

      this.a(bxg.a, this.dy());
      if (!this.aJ()) {
         this.i(this.dy().c(0.95));
      }
   }

   protected double a(iu $$0, ebd $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bxg $$0, fei $$1) {
      if (b(this.dV())) {
         fei $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.d();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bxg.c)) {
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

   public fei a(iu $$0) {
      dzz $$1 = this.dV().a_($$0);
      if ($$1.a(dmc.bw) && $$1.c(dsc.d)) {
         ebd $$2 = $$1.c(((dlp)$$1.b()).c());
         if ($$2 == ebd.b) {
            if (this.b($$0.h())) {
               return new fei(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fei(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == ebd.a) {
            if (this.b($$0.f())) {
               return new fei(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fei(0.0, 0.0, -1.0);
            }
         }

         return fei.c;
      } else {
         return fei.c;
      }
   }

   public boolean b(iu $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected fei a(fei $$0) {
      double $$1 = this.l.m();
      fei $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tz $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uo.a(this.dV().a(mg.i), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(tz $$0) {
      if (this.y()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uo.a(this.n()));
         $$0.a("DisplayOffset", this.w());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bwd $$0) {
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
                  if ($$0 instanceof ctk $$5) {
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

   private void a(ctk $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      fei $$7 = new fei($$3, 0.0, $$4).d();
      fei $$8 = new fei((double)azm.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)azm.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         fei $$10 = this.dy();
         fei $$11 = $$0.dy();
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

   public dzz n() {
      return !this.y() ? this.v() : dma.a(this.au().a(c));
   }

   public dzz v() {
      return dmc.a.m();
   }

   public int w() {
      return !this.y() ? this.x() : this.au().a(d);
   }

   public int x() {
      return 6;
   }

   public void c(dzz $$0) {
      this.au().a(c, dma.j($$0));
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

   public static boolean b(div $$0) {
      return $$0.K().b(cuj.d);
   }

   @Override
   public abstract cyy dI();

   public boolean z() {
      return false;
   }

   public boolean A() {
      return false;
   }
}
