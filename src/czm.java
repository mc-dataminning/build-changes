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

public class czm {
   private static final czn a = new czn();
   private static final int b = 16;
   private final boolean c;
   private final czm.a d;
   private final ayd e = ayd.a();
   private final czu f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bql j;
   private final float k;
   private final bpj l;
   private final czn m;
   private final ku n;
   private final ku o;
   private final iv<auy> p;
   private final ObjectArrayList<im> q = new ObjectArrayList();
   private final Map<ckl, etf> r = Maps.newHashMap();

   public static bpj a(czu $$0, @Nullable bql $$1) {
      return $$0.ai().d($$1, b($$1));
   }

   public czm(czu $$0, @Nullable bql $$1, double $$2, double $$3, double $$4, float $$5, List<im> $$6, czm.a $$7, ku $$8, ku $$9, iv<auy> $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public czm(czu $$0, @Nullable bql $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, czm.a $$7, List<im> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public czm(czu $$0, @Nullable bql $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, czm.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, kw.w, kw.v, auz.jZ);
   }

   public czm(
      czu $$0,
      @Nullable bql $$1,
      @Nullable bpj $$2,
      @Nullable czn $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      czm.a $$9,
      ku $$10,
      ku $$11,
      iv<auy> $$12
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

   private czn a(@Nullable bql $$0) {
      return (czn)($$0 == null ? a : new czk($$0));
   }

   public static float a(etf $$0, bql $$1) {
      eta $$2 = $$1.cI();
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
                  double $$13 = axw.d($$10, $$2.a, $$2.d);
                  double $$14 = axw.d($$11, $$2.b, $$2.e);
                  double $$15 = axw.d($$12, $$2.c, $$2.f);
                  etf $$16 = new etf($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dN().a(new czd($$16, $$0, czd.a.a, czd.b.a, $$1)).c() == etd.a.a) {
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

   public etf b() {
      return new etf(this.g, this.h, this.i);
   }

   public void c() {
      this.f.a(this.j, dur.w, new etf(this.g, this.h, this.i));
      Set<im> $$0 = Sets.newHashSet();
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
                     im $$14 = im.a($$10, $$11, $$12);
                     dpy $$15 = this.f.a_($$14);
                     elr $$16 = this.f.b_($$14);
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
      int $$19 = axw.a(this.g - (double)$$18 - 1.0);
      int $$20 = axw.a(this.g + (double)$$18 + 1.0);
      int $$21 = axw.a(this.h - (double)$$18 - 1.0);
      int $$22 = axw.a(this.h + (double)$$18 + 1.0);
      int $$23 = axw.a(this.i - (double)$$18 - 1.0);
      int $$24 = axw.a(this.i + (double)$$18 + 1.0);
      List<bql> $$25 = this.f.a_(this.j, new eta((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      etf $$26 = new etf(this.g, this.h, this.i);

      for (bql $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.ds() - this.g;
               double $$30 = ($$27 instanceof cgw ? $$27.du() : $$27.dw()) - this.h;
               double $$31 = $$27.dy() - this.i;
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
                  if ($$27 instanceof bre $$34) {
                     $$35 = cya.a($$34, $$33);
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  etf $$37 = new etf($$29, $$30, $$31);
                  $$27.g($$27.dq().e($$37));
                  if ($$27 instanceof ckl) {
                     ckl $$38 = (ckl)$$27;
                     if (!$$38.N_() && (!$$38.f() || !$$38.gb().b)) {
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
         this.f.a(this.g, this.h, this.i, this.p.a(), ava.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         ku $$3;
         if (!(this.k < 2.0F) && $$1) {
            $$3 = this.o;
         } else {
            $$3 = this.n;
         }

         this.f.a($$3, this.g, this.h, this.i, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.f.af().a("explosion_blocks");
         List<Pair<csd, im>> $$4 = new ArrayList<>();
         ac.c(this.q, this.f.z);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            im $$5 = (im)$$7.next();
            this.f.a_($$5).a(this.f, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<csd, im> $$6 : $$4) {
            dcv.a(this.f, (im)$$6.getSecond(), (csd)$$6.getFirst());
         }

         this.f.af().c();
      }

      if (this.c) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            im $$7 = (im)var7.next();
            if (this.e.a(3) == 0 && this.f.a_($$7).i() && this.f.a_($$7.d()).i(this.f, $$7.d())) {
               this.f.b($$7, dci.a(this.f, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<csd, im>> $$0, csd $$1, im $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<csd, im> $$4 = $$0.get($$3);
         csd $$5 = (csd)$$4.getFirst();
         if (cgv.a($$5, $$1)) {
            $$0.set($$3, Pair.of(cgv.a($$5, $$1, 16), (im)$$4.getSecond()));
            if ($$1.d()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.d != czm.a.a;
   }

   public Map<ckl, etf> e() {
      return this.r;
   }

   @Nullable
   private static bre b(@Nullable bql $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof cgw $$1) {
         return $$1.p();
      } else if ($$0 instanceof bre) {
         return (bre)$$0;
      } else {
         if ($$0 instanceof cld $$3) {
            bql $$4 = $$3.u();
            if ($$4 instanceof bre) {
               return (bre)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public bre f() {
      return b(this.j);
   }

   @Nullable
   public bql g() {
      return this.j;
   }

   public void h() {
      this.q.clear();
   }

   public List<im> i() {
      return this.q;
   }

   public czm.a j() {
      return this.d;
   }

   public ku k() {
      return this.n;
   }

   public ku l() {
      return this.o;
   }

   public iv<auy> m() {
      return this.p;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
