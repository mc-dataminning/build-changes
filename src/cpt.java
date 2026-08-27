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

public class cpt {
   private static final cpu a = new cpu();
   private static final int b = 16;
   private final boolean c;
   private final cpt.a d;
   private final ash e = ash.a();
   private final cqb f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final biw j;
   private final float k;
   private final bhu l;
   private final cpu m;
   private final ObjectArrayList<gw> n = new ObjectArrayList();
   private final Map<cca, ehh> o = Maps.newHashMap();

   public cpt(cqb $$0, @Nullable biw $$1, double $$2, double $$3, double $$4, float $$5, List<gw> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, cpt.a.c, $$6);
   }

   public cpt(cqb $$0, @Nullable biw $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpt.a $$7, List<gw> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public cpt(cqb $$0, @Nullable biw $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpt.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cpt(cqb $$0, @Nullable biw $$1, @Nullable bhu $$2, @Nullable cpu $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, cpt.a $$9) {
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

   private cpu a(@Nullable biw $$0) {
      return (cpu)($$0 == null ? a : new cpr($$0));
   }

   public static float a(ehh $$0, biw $$1) {
      ehc $$2 = $$1.cG();
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
                  double $$13 = asb.d($$10, $$2.a, $$2.d);
                  double $$14 = asb.d($$11, $$2.b, $$2.e);
                  double $$15 = asb.d($$12, $$2.c, $$2.f);
                  ehh $$16 = new ehh($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dL().a(new cpk($$16, $$0, cpk.a.a, cpk.b.a, $$1)).c() == ehf.a.a) {
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
      this.f.a(this.j, djn.w, new ehh(this.g, this.h, this.i));
      Set<gw> $$0 = Sets.newHashSet();
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
                     gw $$14 = gw.a($$10, $$11, $$12);
                     dfd $$15 = this.f.a_($$14);
                     eag $$16 = this.f.b_($$14);
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
      int $$19 = asb.a(this.g - (double)$$18 - 1.0);
      int $$20 = asb.a(this.g + (double)$$18 + 1.0);
      int $$21 = asb.a(this.h - (double)$$18 - 1.0);
      int $$22 = asb.a(this.h + (double)$$18 + 1.0);
      int $$23 = asb.a(this.i - (double)$$18 - 1.0);
      int $$24 = asb.a(this.i + (double)$$18 + 1.0);
      List<biw> $$25 = this.f.a_(this.j, new ehc((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      ehh $$26 = new ehh(this.g, this.h, this.i);

      for (biw $$27 : $$25) {
         if (!$$27.cL()) {
            double $$28 = Math.sqrt($$27.e($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dq() - this.g;
               double $$30 = ($$27 instanceof byu ? $$27.ds() : $$27.du()) - this.h;
               double $$31 = $$27.dw() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  double $$33 = (double)a($$26, $$27);
                  double $$34 = (1.0 - $$28) * $$33;
                  $$27.a(this.c(), (float)((int)(($$34 * $$34 + $$34) / 2.0 * 7.0 * (double)$$18 + 1.0)));
                  double $$36;
                  if ($$27 instanceof bjm $$35) {
                     $$36 = coh.a($$35, $$34);
                  } else {
                     $$36 = $$34;
                  }

                  $$29 *= $$36;
                  $$30 *= $$36;
                  $$31 *= $$36;
                  ehh $$38 = new ehh($$29, $$30, $$31);
                  $$27.f($$27.do().e($$38));
                  if ($$27 instanceof cca) {
                     cca $$39 = (cca)$$27;
                     if (!$$39.M_() && (!$$39.f() || !$$39.fT().b)) {
                        this.o.put($$39, $$38);
                     }
                  }
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, apg.iX, aph.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.b();
      if ($$0) {
         if (!(this.k < 2.0F) && $$1) {
            this.f.a(iv.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         } else {
            this.f.a(iv.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         }
      }

      if ($$1) {
         ObjectArrayList<Pair<cjl, gw>> $$2 = new ObjectArrayList();
         boolean $$3 = this.e() instanceof cca;
         ac.b(this.n, this.f.z);
         ObjectListIterator var5 = this.n.iterator();

         while (var5.hasNext()) {
            gw $$4 = (gw)var5.next();
            dfd $$5 = this.f.a_($$4);
            ctc $$6 = $$5.b();
            if (!$$5.i()) {
               gw $$7 = $$4.i();
               this.f.ad().a("explosion_blocks");
               if ($$6.a(this)) {
                  cqb $$9 = this.f;
                  if ($$9 instanceof akt) {
                     akt $$8 = (akt)$$9;
                     dcz $$9x = $$5.t() ? this.f.c_($$4) : null;
                     ecq.a $$10 = new ecq.a($$8).a(eev.f, ehh.b($$4)).a(eev.i, cjl.b).b(eev.h, $$9x).b(eev.a, this.j);
                     if (this.d == cpt.a.c) {
                        $$10.a(eev.j, this.k);
                     }

                     $$5.a($$8, $$4, cjl.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, cte.a.o(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ad().c();
            }
         }

         var5 = $$2.iterator();

         while (var5.hasNext()) {
            Pair<cjl, gw> $$11 = (Pair<cjl, gw>)var5.next();
            ctc.a(this.f, (gw)$$11.getSecond(), (cjl)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while (var13.hasNext()) {
            gw $$12 = (gw)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).i() && this.f.a_($$12.d()).i(this.f, $$12.d())) {
               this.f.b($$12, csp.a(this.f, $$12));
            }
         }
      }
   }

   public boolean b() {
      return this.d != cpt.a.a;
   }

   private static void a(ObjectArrayList<Pair<cjl, gw>> $$0, cjl $$1, gw $$2) {
      int $$3 = $$0.size();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Pair<cjl, gw> $$5 = (Pair<cjl, gw>)$$0.get($$4);
         cjl $$6 = (cjl)$$5.getFirst();
         if (byt.a($$6, $$1)) {
            cjl $$7 = byt.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (gw)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public bhu c() {
      return this.l;
   }

   public Map<cca, ehh> d() {
      return this.o;
   }

   @Nullable
   public bjm e() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof byu $$0) {
         return $$0.q();
      } else {
         biw $$3 = this.j;
         if ($$3 instanceof bjm) {
            return (bjm)$$3;
         } else {
            if (this.j instanceof ccs $$2) {
               $$3 = $$2.v();
               if ($$3 instanceof bjm) {
                  return (bjm)$$3;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public biw f() {
      return this.j;
   }

   public void g() {
      this.n.clear();
   }

   public List<gw> h() {
      return this.n;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
