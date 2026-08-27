import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class cpc {
   private static final cpd a = new cpd();
   private static final int b = 16;
   private final boolean c;
   private final cpc.a d;
   private final art e = art.a();
   private final cpk f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final big j;
   private final float k;
   private final bhe l;
   private final cpd m;
   private final ObjectArrayList<gv> n = new ObjectArrayList();
   private final Map<cbl, ehf> o = Maps.newHashMap();

   public cpc(cpk $$0, @Nullable big $$1, double $$2, double $$3, double $$4, float $$5, List<gv> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, cpc.a.c, $$6);
   }

   public cpc(cpk $$0, @Nullable big $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpc.a $$7, List<gv> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public cpc(cpk $$0, @Nullable big $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpc.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cpc(cpk $$0, @Nullable big $$1, @Nullable bhe $$2, @Nullable cpd $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, cpc.a $$9) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? $$0.ag().a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
   }

   private cpd a(@Nullable big $$0) {
      return (cpd)($$0 == null ? a : new cpa($$0));
   }

   public static float a(ehf $$0, big $$1) {
      eha $$2 = $$1.cG();
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
                  double $$13 = aro.d($$10, $$2.a, $$2.d);
                  double $$14 = aro.d($$11, $$2.b, $$2.e);
                  double $$15 = aro.d($$12, $$2.c, $$2.f);
                  ehf $$16 = new ehf($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dK().a(new cot($$16, $$0, cot.a.a, cot.b.a, $$1)).c() == ehd.a.a) {
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

   public void a() {
      this.f.a(this.j, dji.w, new ehf(this.g, this.h, this.i));
      Set<gv> $$0 = Sets.newHashSet();
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
                     gv $$14 = gv.a($$10, $$11, $$12);
                     dey $$15 = this.f.a_($$14);
                     eab $$16 = this.f.b_($$14);
                     if (!this.f.j($$14)) {
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

      this.n.addAll($$0);
      float $$18 = this.k * 2.0F;
      int $$19 = aro.a(this.g - (double)$$18 - 1.0);
      int $$20 = aro.a(this.g + (double)$$18 + 1.0);
      int $$21 = aro.a(this.h - (double)$$18 - 1.0);
      int $$22 = aro.a(this.h + (double)$$18 + 1.0);
      int $$23 = aro.a(this.i - (double)$$18 - 1.0);
      int $$24 = aro.a(this.i + (double)$$18 + 1.0);
      List<big> $$25 = this.f.a_(this.j, new eha((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      ehf $$26 = new ehf(this.g, this.h, this.i);

      for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
         big $$28 = $$25.get($$27);
         if (!$$28.cL()) {
            double $$29 = Math.sqrt($$28.e($$26)) / (double)$$18;
            if ($$29 <= 1.0) {
               double $$30 = $$28.dp() - this.g;
               double $$31 = ($$28 instanceof byf ? $$28.dr() : $$28.dt()) - this.h;
               double $$32 = $$28.dv() - this.i;
               double $$33 = Math.sqrt($$30 * $$30 + $$31 * $$31 + $$32 * $$32);
               if ($$33 != 0.0) {
                  $$30 /= $$33;
                  $$31 /= $$33;
                  $$32 /= $$33;
                  double $$34 = (double)a($$26, $$28);
                  double $$35 = (1.0 - $$29) * $$34;
                  $$28.a(this.c(), (float)((int)(($$35 * $$35 + $$35) / 2.0 * 7.0 * (double)$$18 + 1.0)));
                  double $$37;
                  if ($$28 instanceof biw $$36) {
                     $$37 = cnq.a($$36, $$35);
                  } else {
                     $$37 = $$35;
                  }

                  $$30 *= $$37;
                  $$31 *= $$37;
                  $$32 *= $$37;
                  ehf $$39 = new ehf($$30, $$31, $$32);
                  $$28.f($$28.dn().e($$39));
                  if ($$28 instanceof cbl) {
                     cbl $$40 = (cbl)$$28;
                     if (!$$40.G_() && (!$$40.f() || !$$40.fR().b)) {
                        this.o.put($$40, $$39);
                     }
                  }
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, aou.iX, aov.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.b();
      if ($$0) {
         if (!(this.k < 2.0F) && $$1) {
            this.f.a(iw.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         } else {
            this.f.a(iw.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         }
      }

      if ($$1) {
         ObjectArrayList<Pair<ciw, gv>> $$2 = new ObjectArrayList();
         boolean $$3 = this.e() instanceof cbl;
         ac.b(this.n, this.f.z);
         ObjectListIterator var5 = this.n.iterator();

         while (var5.hasNext()) {
            gv $$4 = (gv)var5.next();
            dey $$5 = this.f.a_($$4);
            csk $$6 = $$5.b();
            if (!$$5.i()) {
               gv $$7 = $$4.i();
               this.f.ad().a("explosion_blocks");
               if ($$6.a(this)) {
                  cpk $$9 = this.f;
                  if ($$9 instanceof aki) {
                     aki $$8 = (aki)$$9;
                     dck $$9x = $$5.t() ? this.f.c_($$4) : null;
                     ecn.a $$10 = new ecn.a($$8).a(eet.f, ehf.b($$4)).a(eet.i, ciw.b).b(eet.h, $$9x).b(eet.a, this.j);
                     if (this.d == cpc.a.c) {
                        $$10.a(eet.j, this.k);
                     }

                     $$5.a($$8, $$4, ciw.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, csl.a.n(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ad().c();
            }
         }

         var5 = $$2.iterator();

         while (var5.hasNext()) {
            Pair<ciw, gv> $$11 = (Pair<ciw, gv>)var5.next();
            csk.a(this.f, (gv)$$11.getSecond(), (ciw)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while (var13.hasNext()) {
            gv $$12 = (gv)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).i() && this.f.a_($$12.d()).i(this.f, $$12.d())) {
               this.f.b($$12, cry.a(this.f, $$12));
            }
         }
      }
   }

   public boolean b() {
      return this.d != cpc.a.a;
   }

   private static void a(ObjectArrayList<Pair<ciw, gv>> $$0, ciw $$1, gv $$2) {
      int $$3 = $$0.size();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Pair<ciw, gv> $$5 = (Pair<ciw, gv>)$$0.get($$4);
         ciw $$6 = (ciw)$$5.getFirst();
         if (bye.a($$6, $$1)) {
            ciw $$7 = bye.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (gv)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public bhe c() {
      return this.l;
   }

   public Map<cbl, ehf> d() {
      return this.o;
   }

   @Nullable
   public biw e() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof byf $$0) {
         return $$0.j();
      } else {
         big $$3 = this.j;
         if ($$3 instanceof biw) {
            return (biw)$$3;
         } else {
            if (this.j instanceof ccd $$2) {
               $$3 = $$2.v();
               if ($$3 instanceof biw) {
                  return (biw)$$3;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public big f() {
      return this.j;
   }

   public void g() {
      this.n.clear();
   }

   public List<gv> h() {
      return this.n;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
