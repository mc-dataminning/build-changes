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

public class dbs {
   private static final dbt i = new dbt();
   private static final int j = 16;
   private final boolean k;
   private final dbs.a l;
   private final ayt m = ayt.a();
   final dca a;
   final double b;
   final double c;
   final double d;
   @Nullable
   private final brv n;
   final float e;
   private final bqt o;
   private final dbt p;
   final kz f;
   final kz g;
   final ja<avn> h;
   private final ObjectArrayList<ir> q = new ObjectArrayList();
   private final Map<cly, ewu> r = Maps.newHashMap();

   public static bqt a(dca $$0, @Nullable brv $$1) {
      return $$0.aj().d($$1, b($$1));
   }

   public dbs(dca $$0, @Nullable brv $$1, double $$2, double $$3, double $$4, float $$5, List<ir> $$6, dbs.a $$7, kz $$8, kz $$9, ja<avn> $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public dbs(dca $$0, @Nullable brv $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dbs.a $$7, List<ir> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public dbs(dca $$0, @Nullable brv $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dbs.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, lb.w, lb.v, avo.kr);
   }

   public dbs(
      dca $$0,
      @Nullable brv $$1,
      @Nullable bqt $$2,
      @Nullable dbt $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      dbs.a $$9,
      kz $$10,
      kz $$11,
      ja<avn> $$12
   ) {
      this.a = $$0;
      this.n = $$1;
      this.e = $$7;
      this.b = $$4;
      this.c = $$5;
      this.d = $$6;
      this.k = $$8;
      this.l = $$9;
      this.o = $$2 == null ? $$0.aj().a(this) : $$2;
      this.p = $$3 == null ? this.a($$1) : $$3;
      this.f = $$10;
      this.g = $$11;
      this.h = $$12;
   }

   private dbt a(@Nullable brv $$0) {
      return (dbt)($$0 == null ? i : new dbq($$0));
   }

   public static float a(ewu $$0, brv $$1) {
      ewp $$2 = $$1.cP();
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
                  double $$13 = aym.d($$10, $$2.a, $$2.d);
                  double $$14 = aym.d($$11, $$2.b, $$2.e);
                  double $$15 = aym.d($$12, $$2.c, $$2.f);
                  ewu $$16 = new ewu($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dU().a(new dbj($$16, $$0, dbj.a.a, dbj.b.a, $$1)).c() == ews.a.a) {
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
      return this.e;
   }

   public ewu b() {
      return new ewu(this.b, this.c, this.d);
   }

   public void c() {
      this.a.a(this.n, dxv.w, new ewu(this.b, this.c, this.d));
      Set<ir> $$0 = Sets.newHashSet();
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
                  float $$9 = this.e * (0.7F + this.a.A.i() * 0.6F);
                  double $$10 = this.b;
                  double $$11 = this.c;
                  double $$12 = this.d;

                  for (float $$13 = 0.3F; $$9 > 0.0F; $$9 -= 0.22500001F) {
                     ir $$14 = ir.a($$10, $$11, $$12);
                     dtc $$15 = this.a.a_($$14);
                     epe $$16 = this.a.b_($$14);
                     if (!this.a.k($$14)) {
                        break;
                     }

                     Optional<Float> $$17 = this.p.a(this, this.a, $$14, $$15, $$16);
                     if ($$17.isPresent()) {
                        $$9 -= ($$17.get() + 0.3F) * 0.3F;
                     }

                     if ($$9 > 0.0F && this.p.a(this, this.a, $$14, $$15, $$9)) {
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
      float $$18 = this.e * 2.0F;
      int $$19 = aym.a(this.b - (double)$$18 - 1.0);
      int $$20 = aym.a(this.b + (double)$$18 + 1.0);
      int $$21 = aym.a(this.c - (double)$$18 - 1.0);
      int $$22 = aym.a(this.c + (double)$$18 + 1.0);
      int $$23 = aym.a(this.d - (double)$$18 - 1.0);
      int $$24 = aym.a(this.d + (double)$$18 + 1.0);
      List<brv> $$25 = this.a.a_(this.n, new ewp((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      ewu $$26 = new ewu(this.b, this.c, this.d);

      for (brv $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dz() - this.b;
               double $$30 = ($$27 instanceof cih ? $$27.dB() : $$27.dD()) - this.c;
               double $$31 = $$27.dF() - this.d;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  if (this.p.a(this, $$27)) {
                     $$27.a(this.o, this.p.b(this, $$27));
                  }

                  double $$33 = (1.0 - $$28) * (double)a($$26, $$27) * (double)this.p.a();
                  double $$35;
                  if ($$27 instanceof bso $$34) {
                     $$35 = dam.a($$34, $$33);
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  ewu $$37 = new ewu($$29, $$30, $$31);
                  $$27.g($$27.dx().e($$37));
                  if ($$27 instanceof cly) {
                     cly $$38 = (cly)$$27;
                     if (!$$38.O_() && (!$$38.f() || !$$38.gm().b)) {
                        this.r.put($$38, $$37);
                     }
                  }

                  $$27.a(this.n);
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.a.C) {
         this.a.a(this.b, this.c, this.d, this.h.a(), avq.e, 4.0F, (1.0F + (this.a.A.i() - this.a.A.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         kz $$3;
         if (!(this.e < 2.0F) && $$1) {
            $$3 = this.g;
         } else {
            $$3 = this.f;
         }

         this.a.a($$3, this.b, this.c, this.d, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.a.ag().a("explosion_blocks");
         List<Pair<cuh, ir>> $$4 = new ArrayList<>();
         ad.c(this.q, this.a.A);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            ir $$5 = (ir)$$7.next();
            this.a.a_($$5).a(this.a, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<cuh, ir> $$6 : $$4) {
            dfc.a(this.a, (ir)$$6.getSecond(), (cuh)$$6.getFirst());
         }

         this.a.ag().c();
      }

      if (this.k) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            ir $$7 = (ir)var7.next();
            if (this.m.a(3) == 0 && this.a.a_($$7).i() && this.a.a_($$7.d()).i(this.a, $$7.d())) {
               this.a.b($$7, deo.a(this.a, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<cuh, ir>> $$0, cuh $$1, ir $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<cuh, ir> $$4 = $$0.get($$3);
         cuh $$5 = (cuh)$$4.getFirst();
         if (cig.a($$5, $$1)) {
            $$0.set($$3, Pair.of(cig.a($$5, $$1, 16), (ir)$$4.getSecond()));
            if ($$1.d()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.l != dbs.a.a;
   }

   public Map<cly, ewu> e() {
      return this.r;
   }

   @Nullable
   private static bso b(@Nullable brv $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof cih $$1) {
         return $$1.p();
      } else if ($$0 instanceof bso) {
         return (bso)$$0;
      } else {
         if ($$0 instanceof cms $$3) {
            brv $$4 = $$3.t();
            if ($$4 instanceof bso) {
               return (bso)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public bso f() {
      return b(this.n);
   }

   @Nullable
   public brv g() {
      return this.n;
   }

   public void h() {
      this.q.clear();
   }

   public List<ir> i() {
      return this.q;
   }

   public dbs.a j() {
      return this.l;
   }

   public kz k() {
      return this.f;
   }

   public kz l() {
      return this.g;
   }

   public ja<avn> m() {
      return this.h;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
