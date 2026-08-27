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

public class cth {
   private static final cti a = new cti();
   private static final int b = 16;
   private final boolean c;
   private final cth.a d;
   private final auv e = auv.a();
   private final ctp f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final blv j;
   private final float k;
   private final bkt l;
   private final cti m;
   private final jv n;
   private final jv o;
   private final arr p;
   private final ObjectArrayList<hx> q = new ObjectArrayList();
   private final Map<cfi, elt> r = Maps.newHashMap();

   public static bkt a(ctp $$0, @Nullable blv $$1) {
      return $$0.ai().d($$1, b($$1));
   }

   public cth(ctp $$0, @Nullable blv $$1, double $$2, double $$3, double $$4, float $$5, List<hx> $$6, cth.a $$7, jv $$8, jv $$9, arr $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public cth(ctp $$0, @Nullable blv $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cth.a $$7, List<hx> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public cth(ctp $$0, @Nullable blv $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cth.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, jx.x, jx.w, ars.jA);
   }

   public cth(
      ctp $$0,
      @Nullable blv $$1,
      @Nullable bkt $$2,
      @Nullable cti $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      cth.a $$9,
      jv $$10,
      jv $$11,
      arr $$12
   ) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? $$0.ai().a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
   }

   private cti a(@Nullable blv $$0) {
      return (cti)($$0 == null ? a : new ctf($$0));
   }

   public static float a(elt $$0, blv $$1) {
      elo $$2 = $$1.cH();
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
                  double $$13 = auo.d($$10, $$2.a, $$2.d);
                  double $$14 = auo.d($$11, $$2.b, $$2.e);
                  double $$15 = auo.d($$12, $$2.c, $$2.f);
                  elt $$16 = new elt($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dM().a(new csy($$16, $$0, csy.a.a, csy.b.a, $$1)).c() == elr.a.a) {
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

   public elt b() {
      return new elt(this.g, this.h, this.i);
   }

   public void c() {
      this.f.a(this.j, dnr.w, new elt(this.g, this.h, this.i));
      Set<hx> $$0 = Sets.newHashSet();
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
                     hx $$14 = hx.a($$10, $$11, $$12);
                     djh $$15 = this.f.a_($$14);
                     eer $$16 = this.f.b_($$14);
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
      int $$19 = auo.a(this.g - (double)$$18 - 1.0);
      int $$20 = auo.a(this.g + (double)$$18 + 1.0);
      int $$21 = auo.a(this.h - (double)$$18 - 1.0);
      int $$22 = auo.a(this.h + (double)$$18 + 1.0);
      int $$23 = auo.a(this.i - (double)$$18 - 1.0);
      int $$24 = auo.a(this.i + (double)$$18 + 1.0);
      List<blv> $$25 = this.f.a_(this.j, new elo((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      elt $$26 = new elt(this.g, this.h, this.i);

      for (blv $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dr() - this.g;
               double $$30 = ($$27 instanceof cbv ? $$27.dt() : $$27.dv()) - this.h;
               double $$31 = $$27.dx() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  if (this.m.a(this, $$27)) {
                     $$27.a(this.l, this.m.b(this, $$27));
                  }

                  double $$33 = (1.0 - $$28) * (double)a($$26, $$27);
                  double $$35;
                  if ($$27 instanceof bml $$34) {
                     $$35 = crw.a($$34, $$33);
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  elt $$37 = new elt($$29, $$30, $$31);
                  $$27.g($$27.dp().e($$37));
                  if ($$27 instanceof cfi) {
                     cfi $$38 = (cfi)$$27;
                     if (!$$38.P_() && (!$$38.f() || !$$38.fT().b)) {
                        this.r.put($$38, $$37);
                     }
                  }
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, this.p, art.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         jv $$3;
         if (!(this.k < 2.0F) && $$1) {
            $$3 = this.o;
         } else {
            $$3 = this.n;
         }

         this.f.a($$3, this.g, this.h, this.i, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.f.af().a("explosion_blocks");
         List<Pair<cmy, hx>> $$4 = new ArrayList<>();
         ac.c(this.q, this.f.z);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            hx $$5 = (hx)$$7.next();
            this.f.a_($$5).a(this.f, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<cmy, hx> $$6 : $$4) {
            cwq.a(this.f, (hx)$$6.getSecond(), (cmy)$$6.getFirst());
         }

         this.f.af().c();
      }

      if (this.c) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            hx $$7 = (hx)var7.next();
            if (this.e.a(3) == 0 && this.f.a_($$7).i() && this.f.a_($$7.d()).i(this.f, $$7.d())) {
               this.f.b($$7, cwd.a(this.f, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<cmy, hx>> $$0, cmy $$1, hx $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<cmy, hx> $$4 = $$0.get($$3);
         cmy $$5 = (cmy)$$4.getFirst();
         if (cbu.a($$5, $$1)) {
            $$0.set($$3, Pair.of(cbu.a($$5, $$1, 16), (hx)$$4.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.d != cth.a.a;
   }

   public Map<cfi, elt> e() {
      return this.r;
   }

   @Nullable
   private static bml b(@Nullable blv $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof cbv $$1) {
         return $$1.q();
      } else if ($$0 instanceof bml) {
         return (bml)$$0;
      } else {
         if ($$0 instanceof cga $$3) {
            blv $$4 = $$3.w();
            if ($$4 instanceof bml) {
               return (bml)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public bml f() {
      return b(this.j);
   }

   @Nullable
   public blv g() {
      return this.j;
   }

   public void h() {
      this.q.clear();
   }

   public List<hx> i() {
      return this.q;
   }

   public cth.a j() {
      return this.d;
   }

   public jv k() {
      return this.n;
   }

   public jv l() {
      return this.o;
   }

   public arr m() {
      return this.p;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
