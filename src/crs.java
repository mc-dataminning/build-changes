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

public class crs {
   private static final crt a = new crt();
   private static final int b = 16;
   private final boolean c;
   private final crs.a d;
   private final ats e = ats.a();
   private final csa f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bkq j;
   private final float k;
   private final bjo l;
   private final crt m;
   private final ObjectArrayList<ht> n = new ObjectArrayList();
   private final Map<cdu, eju> o = Maps.newHashMap();

   public crs(csa $$0, @Nullable bkq $$1, double $$2, double $$3, double $$4, float $$5, List<ht> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, crs.a.c, $$6);
   }

   public crs(csa $$0, @Nullable bkq $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, crs.a $$7, List<ht> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public crs(csa $$0, @Nullable bkq $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, crs.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public crs(csa $$0, @Nullable bkq $$1, @Nullable bjo $$2, @Nullable crt $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, crs.a $$9) {
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
   }

   private crt a(@Nullable bkq $$0) {
      return (crt)($$0 == null ? a : new crq($$0));
   }

   public static float a(eju $$0, bkq $$1) {
      ejp $$2 = $$1.cH();
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
                  double $$13 = atm.d($$10, $$2.a, $$2.d);
                  double $$14 = atm.d($$11, $$2.b, $$2.e);
                  double $$15 = atm.d($$12, $$2.c, $$2.f);
                  eju $$16 = new eju($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dN().a(new crj($$16, $$0, crj.a.a, crj.b.a, $$1)).c() == ejs.a.a) {
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
      this.f.a(this.j, dls.w, new eju(this.g, this.h, this.i));
      Set<ht> $$0 = Sets.newHashSet();
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
                     ht $$14 = ht.a($$10, $$11, $$12);
                     dhi $$15 = this.f.a_($$14);
                     ecs $$16 = this.f.b_($$14);
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
      int $$19 = atm.a(this.g - (double)$$18 - 1.0);
      int $$20 = atm.a(this.g + (double)$$18 + 1.0);
      int $$21 = atm.a(this.h - (double)$$18 - 1.0);
      int $$22 = atm.a(this.h + (double)$$18 + 1.0);
      int $$23 = atm.a(this.i - (double)$$18 - 1.0);
      int $$24 = atm.a(this.i + (double)$$18 + 1.0);
      List<bkq> $$25 = this.f.a_(this.j, new ejp((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      eju $$26 = new eju(this.g, this.h, this.i);

      for (bkq $$27 : $$25) {
         if (!$$27.cM()) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.ds() - this.g;
               double $$30 = ($$27 instanceof cao ? $$27.du() : $$27.dw()) - this.h;
               double $$31 = $$27.dy() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  double $$33 = (double)a($$26, $$27);
                  double $$34 = (1.0 - $$28) * $$33;
                  $$27.a(this.c(), (float)((int)(($$34 * $$34 + $$34) / 2.0 * 7.0 * (double)$$18 + 1.0)));
                  double $$36;
                  if ($$27 instanceof blg $$35) {
                     $$36 = cqh.a($$35, $$34);
                  } else {
                     $$36 = $$34;
                  }

                  $$29 *= $$36;
                  $$30 *= $$36;
                  $$31 *= $$36;
                  eju $$38 = new eju($$29, $$30, $$31);
                  $$27.g($$27.dq().e($$38));
                  if ($$27 instanceof cdu) {
                     cdu $$39 = (cdu)$$27;
                     if (!$$39.O_() && (!$$39.f() || !$$39.fU().b)) {
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
         this.f.a(this.g, this.h, this.i, aqr.jr, aqs.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.b();
      if ($$0) {
         if (!(this.k < 2.0F) && $$1) {
            this.f.a(js.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         } else {
            this.f.a(js.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         }
      }

      if ($$1) {
         ObjectArrayList<Pair<clj, ht>> $$2 = new ObjectArrayList();
         boolean $$3 = this.e() instanceof cdu;
         ac.c(this.n, this.f.z);
         ObjectListIterator var5 = this.n.iterator();

         while (var5.hasNext()) {
            ht $$4 = (ht)var5.next();
            dhi $$5 = this.f.a_($$4);
            cva $$6 = $$5.b();
            if (!$$5.i()) {
               ht $$7 = $$4.i();
               this.f.ae().a("explosion_blocks");
               if ($$6.a(this)) {
                  csa $$9 = this.f;
                  if ($$9 instanceof ame) {
                     ame $$8 = (ame)$$9;
                     dfd $$9x = $$5.t() ? this.f.c_($$4) : null;
                     efd.a $$10 = new efd.a($$8).a(ehi.f, eju.b($$4)).a(ehi.i, clj.b).b(ehi.h, $$9x).b(ehi.a, this.j);
                     if (this.d == crs.a.c) {
                        $$10.a(ehi.j, this.k);
                     }

                     $$5.a($$8, $$4, clj.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, cvc.a.o(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ae().c();
            }
         }

         var5 = $$2.iterator();

         while (var5.hasNext()) {
            Pair<clj, ht> $$11 = (Pair<clj, ht>)var5.next();
            cva.a(this.f, (ht)$$11.getSecond(), (clj)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while (var13.hasNext()) {
            ht $$12 = (ht)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).i() && this.f.a_($$12.d()).i(this.f, $$12.d())) {
               this.f.b($$12, cun.a(this.f, $$12));
            }
         }
      }
   }

   public boolean b() {
      return this.d != crs.a.a;
   }

   private static void a(ObjectArrayList<Pair<clj, ht>> $$0, clj $$1, ht $$2) {
      int $$3 = $$0.size();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Pair<clj, ht> $$5 = (Pair<clj, ht>)$$0.get($$4);
         clj $$6 = (clj)$$5.getFirst();
         if (can.a($$6, $$1)) {
            clj $$7 = can.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (ht)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public bjo c() {
      return this.l;
   }

   public Map<cdu, eju> d() {
      return this.o;
   }

   @Nullable
   public blg e() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof cao $$0) {
         return $$0.q();
      } else {
         bkq $$3 = this.j;
         if ($$3 instanceof blg) {
            return (blg)$$3;
         } else {
            if (this.j instanceof cem $$2) {
               $$3 = $$2.w();
               if ($$3 instanceof blg) {
                  return (blg)$$3;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public bkq f() {
      return this.j;
   }

   public void g() {
      this.n.clear();
   }

   public List<ht> h() {
      return this.n;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
