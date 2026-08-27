import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class cwt {
   private static final cwu a = new cwu();
   private static final int b = 16;
   private final boolean c;
   private final cwt.a d;
   private final axd e = axd.a();
   private final cxb f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final box j;
   private final float k;
   private final bnw l;
   private final cwu m;
   private final ka n;
   private final ka o;
   private final il<atx> p;
   private final ObjectArrayList<ib> q = new ObjectArrayList();
   private final Map<ciu, ept> r = Maps.newHashMap();

   public static bnw a(cxb $$0, @Nullable box $$1) {
      return $$0.ah().d($$1, b($$1));
   }

   public cwt(cxb $$0, @Nullable box $$1, double $$2, double $$3, double $$4, float $$5, List<ib> $$6, cwt.a $$7, ka $$8, ka $$9, il<atx> $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public cwt(cxb $$0, @Nullable box $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cwt.a $$7, List<ib> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public cwt(cxb $$0, @Nullable box $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cwt.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, kc.x, kc.w, aty.jX);
   }

   public cwt(
      cxb $$0,
      @Nullable box $$1,
      @Nullable bnw $$2,
      @Nullable cwu $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      cwt.a $$9,
      ka $$10,
      ka $$11,
      il<atx> $$12
   ) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? $$0.ah().a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
   }

   private cwu a(@Nullable box $$0) {
      return (cwu)($$0 == null ? a : new cwr($$0));
   }

   public static float a(ept $$0, box $$1) {
      epo $$2 = $$1.cH();
      double $$3 = 1.0 / (($$2.d - $$2.a) * 2.0 + 1.0);
      double $$4 = 1.0 / (($$2.e - $$2.b) * 2.0 + 1.0);
      double $$5 = 1.0 / (($$2.f - $$2.c) * 2.0 + 1.0);
      double $$6 = (1.0 - Math.floor(1.0 / $$3) * $$3) / 2.0;
      double $$7 = (1.0 - Math.floor(1.0 / $$5) * $$5) / 2.0;
      if (!($$3 < 0.0) && !($$4 < 0.0) && !($$5 < 0.0)) {
         int $$8 = 0;
         int $$9 = 0;

         for (double $$10 = 0.0; $$10 <= 1.0; $$10 += $$3) {
            for (double $$11 = 0.0; $$11 <= 1.0; $$11 += $$4) {
               for (double $$12 = 0.0; $$12 <= 1.0; $$12 += $$5) {
                  double $$13 = aww.d($$10, $$2.a, $$2.d);
                  double $$14 = aww.d($$11, $$2.b, $$2.e);
                  double $$15 = aww.d($$12, $$2.c, $$2.f);
                  ept $$16 = new ept($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dM().a(new cwk($$16, $$0, cwk.a.a, cwk.b.a, $$1)).c() == epr.a.a) {
                     $$8++;
                  }

                  $$9++;
               }
            }
         }

         return (float)$$8 / (float)$$9;
      } else {
         return 0.0F;
      }
   }

   public float a() {
      return this.k;
   }

   public ept b() {
      return new ept(this.g, this.h, this.i);
   }

   public void c() {
      this.f.a(this.j, drp.w, new ept(this.g, this.h, this.i));
      Set<ib> $$0 = Sets.newHashSet();
      int $$1 = 16;

      for (int $$2 = 0; $$2 < 16; $$2++) {
         for (int $$3 = 0; $$3 < 16; $$3++) {
            for (int $$4 = 0; $$4 < 16; $$4++) {
               if ($$2 == 0 || $$2 == 15 || $$3 == 0 || $$3 == 15 || $$4 == 0 || $$4 == 15) {
                  double $$5 = (double)((float)$$2 / 15.0F * 2.0F - 1.0F);
                  double $$6 = (double)((float)$$3 / 15.0F * 2.0F - 1.0F);
                  double $$7 = (double)((float)$$4 / 15.0F * 2.0F - 1.0F);
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  float $$9 = this.k * (0.7F + this.f.z.i() * 0.6F);
                  double $$10 = this.g;
                  double $$11 = this.h;
                  double $$12 = this.i;

                  for (float $$13 = 0.3F; $$9 > 0.0F; $$9 -= 0.22500001F) {
                     ib $$14 = ib.a($$10, $$11, $$12);
                     dnb $$15 = this.f.a_($$14);
                     eip $$16 = this.f.b_($$14);
                     if (!this.f.k($$14)) {
                        break;
                     }

                     Optional<Float> $$17 = this.m.a(this, this.f, $$14, $$15, $$16);
                     if ($$17.isPresent()) {
                        $$9 -= ($$17.get() + 0.3F) * 0.3F;
                     }

                     if ($$9 > 0.0F && this.m.a(this, this.f, $$14, $$15, $$9)) {
                        $$0.add($$14);
                     }

                     $$10 += $$5 * 0.3F;
                     $$11 += $$6 * 0.3F;
                     $$12 += $$7 * 0.3F;
                  }
               }
            }
         }
      }

      this.q.addAll($$0);
      float $$18 = this.k * 2.0F;
      int $$19 = aww.a(this.g - (double)$$18 - 1.0);
      int $$20 = aww.a(this.g + (double)$$18 + 1.0);
      int $$21 = aww.a(this.h - (double)$$18 - 1.0);
      int $$22 = aww.a(this.h + (double)$$18 + 1.0);
      int $$23 = aww.a(this.i - (double)$$18 - 1.0);
      int $$24 = aww.a(this.i + (double)$$18 + 1.0);
      List<box> $$25 = this.f.a_(this.j, new epo((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      ept $$26 = new ept(this.g, this.h, this.i);

      for (box $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dr() - this.g;
               double $$30 = ($$27 instanceof cff ? $$27.dt() : $$27.dv()) - this.h;
               double $$31 = $$27.dx() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  if (this.m.a(this, $$27)) {
                     $$27.a(this.l, this.m.b(this, $$27));
                  }

                  double $$33 = (1.0 - $$28) * (double)a($$26, $$27) * (double)this.m.a();
                  double $$35;
                  if ($$27 instanceof bpp $$34) {
                     $$35 = cvi.a($$34, $$33);
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  ept $$37 = new ept($$29, $$30, $$31);
                  $$27.g($$27.dp().e($$37));
                  if ($$27 instanceof ciu) {
                     ciu $$38 = (ciu)$$27;
                     if (!$$38.N_() && (!$$38.f() || !$$38.ga().b)) {
                        this.r.put($$38, $$37);
                     }
                  }

                  $$27.a(this.j);
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, this.p.a(), atz.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         ka $$3;
         if (!(this.k < 2.0F) && $$1) {
            $$3 = this.o;
         } else {
            $$3 = this.n;
         }

         this.f.a($$3, this.g, this.h, this.i, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.f.ae().a("explosion_blocks");
         List<Pair<cqm, ib>> $$4 = new ArrayList<>();
         ac.c(this.q, this.f.z);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            ib $$5 = (ib)$$7.next();
            this.f.a_($$5).a(this.f, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<cqm, ib> $$6 : $$4) {
            dac.a(this.f, (ib)$$6.getSecond(), (cqm)$$6.getFirst());
         }

         this.f.ae().c();
      }

      if (this.c) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            ib $$7 = (ib)var7.next();
            if (this.e.a(3) == 0 && this.f.a_($$7).i() && this.f.a_($$7.d()).i(this.f, $$7.d())) {
               this.f.b($$7, czp.a(this.f, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<cqm, ib>> $$0, cqm $$1, ib $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<cqm, ib> $$4 = $$0.get($$3);
         cqm $$5 = (cqm)$$4.getFirst();
         if (cfe.a($$5, $$1)) {
            $$0.set($$3, Pair.of(cfe.a($$5, $$1, 16), (ib)$$4.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.d != cwt.a.a;
   }

   public Map<ciu, ept> e() {
      return this.r;
   }

   @Nullable
   private static bpp b(@Nullable box $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof cff $$1) {
         return $$1.p();
      } else if ($$0 instanceof bpp) {
         return (bpp)$$0;
      } else {
         if ($$0 instanceof cjm $$3) {
            box $$4 = $$3.af_();
            if ($$4 instanceof bpp) {
               return (bpp)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public bpp f() {
      return b(this.j);
   }

   @Nullable
   public box g() {
      return this.j;
   }

   public void h() {
      this.q.clear();
   }

   public List<ib> i() {
      return this.q;
   }

   public cwt.a j() {
      return this.d;
   }

   public ka k() {
      return this.n;
   }

   public ka l() {
      return this.o;
   }

   public il<atx> m() {
      return this.p;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
