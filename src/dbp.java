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

public class dbp {
   private static final dbq a = new dbq();
   private static final int b = 16;
   private final boolean c;
   private final dbp.a d;
   private final azg e = azg.a();
   private final dbx f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bst j;
   private final float k;
   private final brm l;
   private final dbq m;
   private final lg n;
   private final lg o;
   private final ji<avy> p;
   private final ObjectArrayList<iz> q = new ObjectArrayList();
   private final Map<cmw, evq> r = Maps.newHashMap();

   public static brm a(dbx $$0, @Nullable bst $$1) {
      return $$0.aj().d($$1, b($$1));
   }

   public dbp(dbx $$0, @Nullable bst $$1, double $$2, double $$3, double $$4, float $$5, List<iz> $$6, dbp.a $$7, lg $$8, lg $$9, ji<avy> $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public dbp(dbx $$0, @Nullable bst $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dbp.a $$7, List<iz> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public dbp(dbx $$0, @Nullable bst $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dbp.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, li.w, li.v, avz.ke);
   }

   public dbp(
      dbx $$0,
      @Nullable bst $$1,
      @Nullable brm $$2,
      @Nullable dbq $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      dbp.a $$9,
      lg $$10,
      lg $$11,
      ji<avy> $$12
   ) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? $$0.aj().a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
   }

   private dbq a(@Nullable bst $$0) {
      return (dbq)($$0 == null ? a : new dbn($$0));
   }

   public static float a(evq $$0, bst $$1) {
      evl $$2 = $$1.cK();
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
                  double $$13 = ayy.d($$10, $$2.a, $$2.d);
                  double $$14 = ayy.d($$11, $$2.b, $$2.e);
                  double $$15 = ayy.d($$12, $$2.c, $$2.f);
                  evq $$16 = new evq($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dP().a(new dbg($$16, $$0, dbg.a.a, dbg.b.a, $$1)).c() == evo.a.a) {
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

   public evq b() {
      return new evq(this.g, this.h, this.i);
   }

   public void c() {
      this.f.a(this.j, dwu.w, new evq(this.g, this.h, this.i));
      Set<iz> $$0 = Sets.newHashSet();
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
                     iz $$14 = iz.a($$10, $$11, $$12);
                     dsb $$15 = this.f.a_($$14);
                     enu $$16 = this.f.b_($$14);
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
      int $$19 = ayy.a(this.g - (double)$$18 - 1.0);
      int $$20 = ayy.a(this.g + (double)$$18 + 1.0);
      int $$21 = ayy.a(this.h - (double)$$18 - 1.0);
      int $$22 = ayy.a(this.h + (double)$$18 + 1.0);
      int $$23 = ayy.a(this.i - (double)$$18 - 1.0);
      int $$24 = ayy.a(this.i + (double)$$18 + 1.0);
      List<bst> $$25 = this.f.a_(this.j, new evl((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      evq $$26 = new evq(this.g, this.h, this.i);

      for (bst $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.du() - this.g;
               double $$30 = ($$27 instanceof cjh ? $$27.dw() : $$27.dy()) - this.h;
               double $$31 = $$27.dA() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  if (this.m.a(this, $$27)) {
                     $$27.a(this.l, this.m.b(this, $$27));
                  }

                  double $$33 = (1.0 - $$28) * (double)a($$26, $$27) * (double)this.m.a($$27);
                  double $$35;
                  if ($$27 instanceof bto $$34) {
                     $$35 = dai.a($$34, $$33);
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  evq $$37 = new evq($$29, $$30, $$31);
                  $$27.h($$27.ds().e($$37));
                  if ($$27 instanceof cmw) {
                     cmw $$38 = (cmw)$$27;
                     if (!$$38.N_() && (!$$38.f() || !$$38.gd().b)) {
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
         this.f.a(this.g, this.h, this.i, this.p.a(), awa.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         lg $$3;
         if (!(this.k < 2.0F) && $$1) {
            $$3 = this.o;
         } else {
            $$3 = this.n;
         }

         this.f.a($$3, this.g, this.h, this.i, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.f.ag().a("explosion_blocks");
         List<Pair<cuo, iz>> $$4 = new ArrayList<>();
         ac.c(this.q, this.f.z);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            iz $$5 = (iz)$$7.next();
            this.f.a_($$5).a(this.f, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<cuo, iz> $$6 : $$4) {
            dey.a(this.f, (iz)$$6.getSecond(), (cuo)$$6.getFirst());
         }

         this.f.ag().c();
      }

      if (this.c) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            iz $$7 = (iz)var7.next();
            if (this.e.a(3) == 0 && this.f.a_($$7).i() && this.f.a_($$7.d()).i(this.f, $$7.d())) {
               this.f.b($$7, del.a(this.f, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<cuo, iz>> $$0, cuo $$1, iz $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<cuo, iz> $$4 = $$0.get($$3);
         cuo $$5 = (cuo)$$4.getFirst();
         if (cjg.a($$5, $$1)) {
            $$0.set($$3, Pair.of(cjg.a($$5, $$1, 16), (iz)$$4.getSecond()));
            if ($$1.e()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.d != dbp.a.a;
   }

   public Map<cmw, evq> e() {
      return this.r;
   }

   @Nullable
   private static bto b(@Nullable bst $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof cjh $$1) {
         return $$1.p();
      } else if ($$0 instanceof bto) {
         return (bto)$$0;
      } else {
         if ($$0 instanceof cno $$3) {
            bst $$4 = $$3.s();
            if ($$4 instanceof bto) {
               return (bto)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public bto f() {
      return b(this.j);
   }

   @Nullable
   public bst g() {
      return this.j;
   }

   public void h() {
      this.q.clear();
   }

   public List<iz> i() {
      return this.q;
   }

   public dbp.a j() {
      return this.d;
   }

   public lg k() {
      return this.n;
   }

   public lg l() {
      return this.o;
   }

   public ji<avy> m() {
      return this.p;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
